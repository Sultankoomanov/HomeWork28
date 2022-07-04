package com.Attractor;

import com.Attractor.Products.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	run();
    }

    private static void run(){
        Dealer dealer = new Dealer(3000, 3, 0);
        dealer.TakeMoney();
        System.out.println("-----------------------------------------------------");
        System.out.println("Состояние счета Торговца: " + dealer.getMoney());
        System.out.println("-----------------------------------------------------");

        System.out.println("                       Закуп товара.           ");
        System.out.println("Product         |   Weight      | Quality        | Price         | ");
        System.out.println("----------------+----------------+---------------+---------------+");

        Product[] products = new Product[40];
        int totalMoney = (int) dealer.getMoney();

        ArrayList<Product> p = new ArrayList<>();

        for (int i = 0; i < products.length; i++) {
            int productType = (int)Math.floor(Math.random() * 6);
            switch (productType) {
                case 0: products[i] = new Corn(100, "Corn", 1.2, 350);
                    totalMoney -= products[i].getPrice();
                    p.add(products[i]);
                    break;
                case 1: products[i] = new DriedFruits(100, "D.Fruits", 1.2, 250);
                    totalMoney -= products[i].getPrice();
                    p.add(products[i]);
                    break;
                case 2: products[i] =  new Fabrics(100, "Fabrics", 1.2, 100);
                    totalMoney -= products[i].getPrice();
                    p.add(products[i]);
                    break;
                case 3: products[i] =  new Flour(100, "Flour", 1.2, 440);
                    totalMoney -= products[i].getPrice();
                    p.add(products[i]);
                     break;
                case 4: products[i] =  new Meal(100, "Meal", 1.2, 260);
                    totalMoney -= products[i].getPrice();
                    p.add(products[i]);
                    break;
                case 5: products[i] =  new Paints(100, "Paints", 1.2, 220);
                    totalMoney -= products[i].getPrice();
                    p.add(products[i]);
                     break;
            }
        }
        for (Product a : products) {
            System.out.printf("%s         \t|  %s  \t| %s    \t| %s    \t     \n", a.getName(), a.getWeight(), a.getQualityOfProduct(), a.getPrice());
        }
        System.out.println("----------+----------------+---------------+---------------+");
        System.out.println("Остаток денег у Торговца " + totalMoney);

        // вывод аррай листа с записанными данными

//        for (int i = 0; i < p.size(); i++) {
//            System.out.println(p.get(i).getName());
//        }
        System.out.println(City.getRandom());
        System.out.println(City.getRandom2());



    }

    private static void chooseCity() {

    }

}
