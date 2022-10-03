/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.Category;
import repos.impl.CategoryRepos;
import service.IServiceCategory;

/**
 *
 * @author HOANG SON
 */
public class CategoryService implements IServiceCategory {

    CategoryRepos repos;
    List<Category> lsCategorys;

    public CategoryService() {
        repos = new CategoryRepos();
    }

    @Override
    public List<Category> finAll() {
        lsCategorys = repos.finAll();
        return lsCategorys;
    }

}
