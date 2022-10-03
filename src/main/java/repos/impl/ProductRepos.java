/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repos.impl;

import java.util.ArrayList;
import java.util.List;
import model.Product;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import repos.IReposProduct;
import util.HibernateUtil;

/**
 *
 * @author HOANG SON
 */
public class ProductRepos implements IReposProduct{
    Session session;
    List<Product> lsProducts;
    public ProductRepos() {
        session = HibernateUtil.getSessionFactory().openSession();
        lsProducts = new ArrayList<>();
    }

    @Override
    public List<Product> finAll() {
        String sql = "FROM Product";
        lsProducts = session.createQuery(sql, Product.class).list();
        return  lsProducts;
    }
    
}
