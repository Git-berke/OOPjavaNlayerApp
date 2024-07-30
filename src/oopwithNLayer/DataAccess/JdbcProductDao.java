package oopwithNLayer.DataAccess;

import oopwithNLayer.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product)
    {
        // sadece database erişim kodları buraya yazılır ...
        //sql öğrenmem gerekecek
        System.out.println("JDBC ile veritabanına eklendi");
    }


}
