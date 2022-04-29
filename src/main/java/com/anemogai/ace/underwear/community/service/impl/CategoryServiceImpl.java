package com.anemogai.ace.underwear.community.service.impl;

import com.anemogai.ace.underwear.community.entity.Category;
import com.anemogai.ace.underwear.community.repo.CategoryRepo;
import com.anemogai.ace.underwear.community.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Iterable<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public Category categoryAdd(Category category) {
        return categoryRepo.save(category);
    }
}
