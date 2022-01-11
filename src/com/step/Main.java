package com.step;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        ProductManager productManager = new ProductManager();

        switch (menu.menu()) {
            case 1:
                System.out.println(productManager.toString()); break;
            case 2:
                System.out.println("Total price is: " + productManager.totalPrice()); break;
            case 3: return;
        }
    }
}
