package com.machine.service;

import com.machine.DAO.DAOFactory;
import com.machine.DAO.ProductDAO;
import com.machine.models.product.Product;

public class ProductServise {
    public static Long addProductToWarehouse(int productCode, String name, Double quantity, Double measure,Double pricePerUnit){
        ProductDAO<Product> productDAO = DAOFactory.getProductDAO();
        Product product = new Product();
        product.setProductCode(productCode);
        product.setProductName(name);
        product.setPricePerMeasureOrQuantity(pricePerUnit);
        if(quantity==null) {
            product.setQuantity(-100500);
        } else {
            product.setQuantity(quantity);
        }
        if (measure==null){
            product.setMeasure(-100500);
        } else {
            product.setMeasure(measure);
        }
        return productDAO.create(product);

    }
    public static void setProductAmountOnWarehouseByName(String name,Double amount){
        ProductDAO<Product> productDAO = DAOFactory.getProductDAO();
        Product product = productDAO.getProductByName(name);
        if(product.getQuantity()!=-100500){
            product.setQuantity(amount);
        } else {
            product.setMeasure(amount);
        }
        productDAO.update(product);
    }
    public static void setProductAmountOnWarehouseByCode(int code,Double amount){
        ProductDAO<Product> productDAO = DAOFactory.getProductDAO();
        Product product = productDAO.getProductByCode(code);
        if(product.getQuantity()!=-100500){
            product.setQuantity(amount);
        } else {
            product.setMeasure(amount);
        }
        productDAO.update(product);
    }
}
