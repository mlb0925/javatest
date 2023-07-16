package com.example.mappers;

import com.example.models.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> getAllCategories();

    Category getCategoryById(@Param("categoryId") int categoryId);

    // Other methods...
}
