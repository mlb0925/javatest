package com.example.services;

import com.example.models.Category;
import com.example.mappers.CategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }

    public Category getCategoryById(int categoryId) {
        return categoryMapper.getCategoryById(categoryId);
    }

    // Other methods...
}
