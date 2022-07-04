package com.Attractor;

import com.Attractor.Products.*;

public class Main {

    public static void main(String[] args) {
	run();
    }

    private static void run(){
        Dealer dealer = new Dealer(3000, 3, 0);
        dealer.TakeMoney();
        System.out.println("Состояние счета Торговца: " + dealer.getMoney());

        System.out.println("                       Закуп товара.           ");
        System.out.println("Product   |   Produced on  | Storage place | S. life date  |   Fresh ");
        System.out.println("----------+----------------+---------------+---------------+---------");

        Product[] products = new Product[40];
        int totalMoney = (int) dealer.getMoney();

        for (int i = 0; i < products.length; i++) {
            int productType = (int)Math.floor(Math.random() * 5);
            switch (productType) {
                case 0: products[i] = new Corn(100, "Corn", 1.2, 350);
                    totalMoney -= products[i].getPrice();
                    break;
                case 1: products[i] = new DriedFruits(100, "Dried Fruits", 1.2, 250);
                    totalMoney -= products[i].getPrice();
                    break;
                case 2: products[i] =  new Fabrics(100, "Fabrics", 1.2, 100);
                    totalMoney -= products[i].getPrice();
                    break;
                case 3: products[i] =  new Flour(100, "Flour", 1.2, 440);
                    totalMoney -= products[i].getPrice();
                     break;
                case 4: products[i] =  new Meal(100, "Meal", 1.2, 260);
                    totalMoney -= products[i].getPrice();
                    break;
                case 5: products[i] =  new Paints(100, "Paints", 1.2, 720);
                    totalMoney -= products[i].getPrice();
                     break;
            }
        }
        for (Product a : products) {
            System.out.print(a.getName() + ", " + "\n");
        }
        System.out.println("----------+----------------+---------------+---------------+---------");
        System.out.println("Остаток денег у Торговца " + totalMoney);
    }

}
