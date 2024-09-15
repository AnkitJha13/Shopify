package com.athena.Athena_Ecommerce.repository;

import com.athena.Athena_Ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}