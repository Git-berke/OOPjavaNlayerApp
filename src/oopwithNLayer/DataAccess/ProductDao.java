package oopwithNLayer.DataAccess;

import oopwithNLayer.entities.Product;

public interface ProductDao {

    //sözleşmeyi yaz
    //interfaceler sadece method imzasını barındırabilir ...
      void add(Product product);
}
