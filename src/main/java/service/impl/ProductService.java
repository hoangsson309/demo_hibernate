/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.Product;
import repos.IReposProduct;
import repos.impl.ProductRepos;

/**
 *
 * @author HOANG SON
 */
public class ProductService implements IReposProduct{

    ProductRepos repos;
    List<Product> lsProducts;
    
    public ProductService() {
        repos = new ProductRepos();
        lsProducts= new ArrayList<>();
    }
    
    @Override
    public List<Product> finAll() {
        lsProducts = repos.finAll();
        return lsProducts;
    }
    
}
