package com.athena.Athena_Ecommerce.service.interf;

import com.athena.Athena_Ecommerce.dto.CategoryDto;
import com.athena.Athena_Ecommerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}