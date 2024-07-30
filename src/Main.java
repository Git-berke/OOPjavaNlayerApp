import oopwithNLayer.Core.logging.DataBaseLogger;
import oopwithNLayer.Core.logging.FileLogger;
import oopwithNLayer.Core.logging.Logger;
import oopwithNLayer.Core.logging.MailLogger;
import oopwithNLayer.DataAccess.HibernateProductDao;
import oopwithNLayer.DataAccess.JdbcProductDao;
import oopwithNLayer.DataAccess.ProductDao;
import oopwithNLayer.business.ProductManager;
import oopwithNLayer.entities.Product;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"Iphone Xr",12);
        ProductDao pro = new HibernateProductDao();
        Logger[] loggers = {new DataBaseLogger(),new MailLogger(), new FileLogger()};
        ProductManager productManager = new ProductManager(pro, List.of(loggers));

        productManager.add(product1);


    }
}