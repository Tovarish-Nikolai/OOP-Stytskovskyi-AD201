/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.stytskovskyi;
import java.util.ArrayList;
/**
 *
 * @author Student
 */
public class ShoppingCart
{
    ArrayList<Product> produce = new ArrayList<> ();
    private int maxSize;
    
    public ShoppingCart(int s) { maxSize = s; }
    
    public int getMaxSize() { return maxSize; } 
    public int setMaxSize(int s) 
    {
        if (s < 0)
            s = 0;
        
        maxSize = s;
        return maxSize;
    } 
    
    public void addProduct (Product p)
    {
        if (produce.size() < maxSize)
            produce.add(0,p);
    }
    
    public void removeProduct ()
    {
        if (produce.size() > 0)
            produce.remove(produce.size());
    }
    
    public double getPriceSum ()
    {
        double s = 0;
        
        for (Product item:produce)
        {
            s += item.getPrice();
        }
        return s;
    }
    
    public void raisePrices (double percents)
    {
        double tempPrice;
        
        for (Product item:produce)
        {
            tempPrice = item.getPrice();
            tempPrice += tempPrice * (percents / 100);
            item.setPrice(tempPrice);
        }
    }
    
     public void lowerPrices (double percents)
    {
        double tempPrice;
        
        for (Product item:produce)
        {
            tempPrice = item.getPrice();
            tempPrice -= tempPrice * (percents / 100);
            item.setPrice(tempPrice);
        }
    }
}
