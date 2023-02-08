package com.careerdevs.Ecommerce.service;

import com.careerdevs.Ecommerce.model.Category;
import com.careerdevs.Ecommerce.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public void createCategory(Category category) {
        categoryRepo.save(category);
    }
}
