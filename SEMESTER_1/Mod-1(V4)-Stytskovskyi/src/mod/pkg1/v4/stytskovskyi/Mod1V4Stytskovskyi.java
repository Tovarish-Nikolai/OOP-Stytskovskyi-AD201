/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mod.pkg1.v4.stytskovskyi;
import java.util.Scanner;
import java.util.ArrayList;  
import java.util.Arrays;  
/**
 *
 * @author USER
 */
public class Mod1V4Stytskovskyi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int num;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        System.out.println("Введите число: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++)
        {
            if (num%i == 0)
               numbers.add(i);
        }
        
        System.out.print("Введённое число " + num + " делится без остатка на следующие числа:");
        
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(" " + numbers.get(i));
        
        System.out.println(". \n");
    }
    
}
