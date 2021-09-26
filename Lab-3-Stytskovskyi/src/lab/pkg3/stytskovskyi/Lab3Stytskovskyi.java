/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3.stytskovskyi;

/**
 *
 * @author USER
 */
public class Lab3Stytskovskyi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fred = "Fred";
        
        if (checkEd(fred) == true)
        {
            System.out.print("true");
        }
        
        String nums = "fr3dd13";
        System.out.println(sumNumbers(nums));
    }
    
    public static boolean checkEd(String s) //Метод 1
    {                                       //Смысла в нём мало, но раз надо - держите        
            return s.endsWith("ed");
    }
    
    public static int sumNumbers(String s)  //Метод 2
    {                                       //Хотя-бы не просто использует одну встроенную функцию
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                sum += Character.getNumericValue(s.charAt(i));
            }
        }
        
        return sum;
    }
}

