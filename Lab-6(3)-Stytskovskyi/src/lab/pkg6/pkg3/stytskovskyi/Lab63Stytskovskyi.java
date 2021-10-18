/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg6.pkg3.stytskovskyi;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Lab63Stytskovskyi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a string..");
        String str = sc.nextLine();
        
        HashInterface wH = new WeakHash();
        HashInterface sH = new StrongHash();
        
        System.out.println("The weak hash of this string equals to: " + wH.hash(str));
        System.out.println("The strong hash of this string equals to: " + sH.hash(str));
    }
    
}
