package com.anemogai.ace.underwear.community.service;

import com.anemogai.ace.underwear.community.entity.Category;

public interface CategoryService {

    Iterable<Category> getAllCategories();

    Category categoryAdd(Category category);

}
