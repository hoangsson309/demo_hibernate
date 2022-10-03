/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repos.impl;

import java.util.ArrayList;
import java.util.List;
import model.Category;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import repos.IReposCategory;
import util.HibernateUtil;

/**
 *
 * @author HOANG SON
 */
public class CategoryRepos implements IReposCategory{

    Session session;
    List<Category> lstCate;
    public CategoryRepos() {
        session = HibernateUtil.getSessionFactory().openSession();
        lstCate = new ArrayList<>();
    }

    @Override
    public List<Category> finAll() {
        try {
            String sql = "FROM Category";
            lstCate = session.createQuery(sql, Category.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lstCate;
    }
    
}
