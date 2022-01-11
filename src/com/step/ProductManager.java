package com.step;

public class ProductManager {
    //Product product[] = new Product[5];
    Product p1 = new Product("Paine", 5.00, "Franzeluta");
    Product p2 = new Product("Lapte", 6.00, "Alba");
    Product p3 = new Product("Ciocolate", 7.00, "Bucuria");
    Product p4 = new Product("Apa", 8.00, "Dorna");
    Product p5 = new Product("Inghetata", 9.00, "Drancor");

    @Override
    public String toString() {
        return "ProductManager{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                ", p5=" + p5 +
                '}';
    }

    public double totalPrice() {
       double sum = 0;
       sum = p1.getPrice() + p2.getPrice() + p3.getPrice() + p4.getPrice() + p5.getPrice();
       return sum;
    }
}
