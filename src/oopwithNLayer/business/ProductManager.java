package oopwithNLayer.business;

import oopwithNLayer.Core.logging.Logger;
import oopwithNLayer.DataAccess.HibernateProductDao;
import oopwithNLayer.DataAccess.JdbcProductDao;
import oopwithNLayer.DataAccess.ProductDao;
import oopwithNLayer.entities.Product;

import java.util.List;

public class ProductManager {
    //response request

    private ProductDao productDao;
    private List<Logger>loggers ;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }


    //buraya iş kuralları yazıalcak...
    public void add(Product product) throws Exception {
        if(product.getUnitPrice()<10)
        {
            throw new Exception("ürün fiyatı 10'dan küçük olamaz ");

        }

        productDao.add(product);

        for (Logger logger : loggers)
        {
            logger.log(product.getName());

        }




    }
}
