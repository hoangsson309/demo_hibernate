/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.util.Properties;
import model.Category;
import model.Product;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author HOANG SON
 */
public class HibernateUtil {
    private static SessionFactory FACTORY;

    static {
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
                settings.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=demo_hibernate;useSSL=false"
                        + ";encrypt=true;trustServerCertificate=true;");
                settings.put(Environment.USER, "hns");
                settings.put(Environment.PASS, "hns309");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
                settings.put(Environment.SHOW_SQL, "true");

                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Category.class);
                configuration.addAnnotatedClass(Product.class);

                ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                FACTORY = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }
}
