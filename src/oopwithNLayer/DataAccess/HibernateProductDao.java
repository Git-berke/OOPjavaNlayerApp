package oopwithNLayer.DataAccess;

import oopwithNLayer.entities.Product;

public class HibernateProductDao implements ProductDao {

    public void add(Product product)
    {
        // sadece database erişim kodları buraya yazılır ...
        //sql öğrenmem gerekecek
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}