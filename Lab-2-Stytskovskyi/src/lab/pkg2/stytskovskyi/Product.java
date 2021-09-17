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
public class Product 
{
    private String name;
    private double price;
    
    public Product (String n, double p)
    {
        name = n;
        price = p;
    }
    
    public String getName() { return name; }
    public String setName(String n) { name = n; return name; }
    
    public double getPrice() { return price; }
    public double setPrice(double p) 
    {
        if (p >= 0)
            price = p;
        else
            price = 0;
        
        return price; 
    }
    
    public void raisePrice (double percent)
    {
        price += price * (percent/100);
    }
    
     public void lowerPrice (double percent)
    {
        price -= price * (percent/100);
        
        if (price < 0) { price = 0; }
    }
}
