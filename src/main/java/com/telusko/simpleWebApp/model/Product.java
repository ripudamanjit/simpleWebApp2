package com.telusko.simpleWebApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product() {
        this.prodId=0;
        this.prodName="none";
        this.price=0;


    }



    @Override public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

}
