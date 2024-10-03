package com.athena.Athena_Ecommerce.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryService {

    private final Cloudinary cloudinary;

    // Inject Cloudinary credentials from application.properties
    public CloudinaryService(@Value("${cloudinary.cloud.name}") String cloudName,
                             @Value("${cloudinary.api.key}") String apiKey,
                             @Value("${cloudinary.api.secret}") String apiSecret) {
        // Initialize Cloudinary with the provided credentials
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key", apiKey,
                "api_secret", apiSecret
        ));
    }

    // Method to upload the image to Cloudinary
    public String saveImage(MultipartFile photo) {
        try {
            // Upload the image to Cloudinary and retrieve the upload result
            Map uploadResult = cloudinary.uploader().upload(photo.getBytes(),
                    ObjectUtils.asMap("resource_type", "auto"));

            // Return the URL of the uploaded image
            return uploadResult.get("secure_url").toString();
        } catch (IOException e) {
            // Handle any exceptions and throw a standard RuntimeException
            throw new RuntimeException("Unable to upload image to Cloudinary: " + e.getMessage(), e);
        }
    }
}
