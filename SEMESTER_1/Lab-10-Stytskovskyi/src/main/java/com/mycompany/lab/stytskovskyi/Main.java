/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab.stytskovskyi;
import java.util.*;
/**
 *
 * @author USER
 */
public class Main 
{
    public static void main(String[] args)
    {
        LinkedList<Integer> A = new LinkedList<> ();
        LinkedList<Integer> B = new LinkedList<> ();
        LinkedList<Integer> C = new LinkedList<> ();
        
        for (int i = 0; i < 10; i++)
        {
            A.add((int)(0 + Math.random() * 10));
            B.add((int)(0 + Math.random() * 10));
        }
        
        System.out.println("Group A : " + A);
        System.out.println("Group B : " + B);
        
        C.addAll(findUnique(A, B));
        
        System.out.println("Group C : " + C);
    }
    
    public static <V extends Comparable,T extends LinkedList<V>> LinkedList findUnique(T a, T b)
    {
        LinkedList<V> returnList = new LinkedList<> ();
        boolean unique;
       
        for (int i = 0; i < a.size(); i++)
        {
            unique = true;
            for (int j = 0; j < b.size(); j++)
            {
                if (a.get(i) == b.get(j))
                    unique = false;
            }
            if (unique == true)
                returnList.add(a.get(i));
        }
        
        for (int i = 0; i < b.size(); i++)
        {
            unique = true;
            for (int j = 0; j < a.size(); j++)
            {
                if (b.get(i) == a.get(j))
                    unique = false;
            }
            if (unique == true)
                returnList.add(b.get(i));
        }
        return returnList;
    }
}
