/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg5.stytskovskyi;

/**
 *
 * @author USER
 */
public class Lab5Stytskovskyi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Person a = new Student("Mathew", "Callahan", 20, "AL", 189);
        Person b = new Student("Joey", "Rottham", 19, "AD", 169);
        
        Person c = new Lecturer("Alexander", "Boskey", 30, "Programming", 14000);
        
        Person[] array = { a, b , c };
        
        for (int i = 0; i < array.length; i++)
            array[i].printInfo();
    }
    
}
