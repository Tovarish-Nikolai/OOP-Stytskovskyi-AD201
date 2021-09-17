/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.stytskovskyi;

/**
 *
 * @author Student
 */
public class Lab2Stytskovskyi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Product product = new Product("Soap", 3);
        Product product1 = new Product("Crackers", 6);
        Product product2 = new Product("Wine", 15);
        Product product3 = new Product("Cornflakes", 7);
        Product product4 = new Product("Toothpaste", 8);
        
        ShoppingCart cart = new ShoppingCart(15);
        
        cart.addProduct(product);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        
        System.out.println("Total = " + cart.getPriceSum());
        System.out.println("..............................");
        cart.raisePrices(15);
        System.out.println("Total(+15%) = " + cart.getPriceSum());
         System.out.println("..............................");
        cart.lowerPrices(30);
        System.out.println("Total(+15% , -30%) = " + cart.getPriceSum());
    }
    
}
