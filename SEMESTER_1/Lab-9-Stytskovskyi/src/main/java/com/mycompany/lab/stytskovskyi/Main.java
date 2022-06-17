/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab.stytskovskyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        List<Parallelepiped> parallelepipedList = new ArrayList<> ();
        int amount;
        
        System.out.println("Введите количество параллелепипедов для генерации (10 макс)");
        
        amount = sc.nextInt();
        if (amount > 10)
            amount = 10;
        
        for (int i = 0; i < 10; i++)
            parallelepipedList.add(generateParallelepiped());
               
        parallelepipedSort(parallelepipedList);
        
        for (int i = 0; i < parallelepipedList.size(); i++)
            System.out.println("(" + parallelepipedList.get(i).getLength() + ", " + parallelepipedList.get(i).getWidth() + 
                    ", " + parallelepipedList.get(i).getHeight() + ") - Area equals to : " + calculateArea(parallelepipedList.get(i)));
    }
    
    public static void parallelepipedSort (List<Parallelepiped> parallelepipedArray)
    {
        List<Parallelepiped> tempList = new ArrayList<> ();
        List<Parallelepiped> comparatorList = new ArrayList<> ();
        comparatorList.addAll(parallelepipedArray);
        
        boolean delete;
        int areaFirst, areaNext;
        int number;
        
        for (int j = 0; j < parallelepipedArray.size(); j++)
        {
            areaFirst = calculateArea(parallelepipedArray.get(j));
            number = j;
            delete = false;
            for (int i = 1; i < comparatorList.size(); i++)
            {            
                areaNext = calculateArea(comparatorList.get(i));
                if (areaFirst > areaNext)
                {
                    areaFirst = areaNext;
                    number = i;
                    delete = true;
                }
                else if (areaFirst == areaNext &&
                        parallelepipedArray.get(j).getLength() > comparatorList.get(i).getLength())
                {                                      
                        number = i;
                        delete = true;                                                              
                }
                else if (areaFirst == areaNext && 
                        parallelepipedArray.get(j).getLength()== comparatorList.get(i).getLength()&&
                        parallelepipedArray.get(j).getWidth()> comparatorList.get(i).getWidth())
                {
                        number = i;
                        delete = true;
                }
            }                
            tempList.add(parallelepipedArray.get(number));
            if (delete == true)
            {
                comparatorList.remove(number);
                parallelepipedArray.remove(number);
                j--;
            }
        }
        
        parallelepipedArray.removeAll(parallelepipedArray);
        parallelepipedArray.addAll(tempList);
    }
    
    public static Parallelepiped generateParallelepiped()
    { return new Parallelepiped ((int)(0 + Math.random() * 25),(int)(0 + Math.random() * 25), (int)(0 + Math.random() * 25)); }
    
    public static int calculateArea(Parallelepiped a)
    {
        return 2 * ((a.getHeight() * a.getWidth()) +
                (a.getWidth() * a.getLength()) +
                (a.getHeight() * a.getLength()));
    }
    
    public static class Parallelepiped
    {
        private int length, width, height;
        
        public Parallelepiped(int length, int width, int height)
        {setLength(length); setWidth(width); setHeight(height);}
        
        public void setLength(int length) { this.length = length; }
        public void setWidth(int width) {this.width = width; }
        public void setHeight(int height) {this.height = height; }
        
        public int getLength() {return length;}
        public int getWidth() {return width;}
        public int getHeight() {return height;}
    }
}
