package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products= new ArrayList<>( Arrays.asList(
//            new Product(101,"iphone",50000),
//            new Product(102,"Canon Camera",70000),
//            new Product(103,"microphone",40000)));

    public List<Product> getProducts() {
        return  repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }
//    public Product getProductById(int id) {
//        for (Product p : products) {
//            if (p.getProdId() == id) {
//                return p;
//            }
//        }
//        return null; // return null if not found
//    }
    public void addProduct(Product prod){
       repo.save(prod);
    }

    public void updateProduct(Product prod){
       repo.save(prod);
    }


    public void deleteProduct(int prodId) {
         repo.deleteById(prodId);
    }
}
