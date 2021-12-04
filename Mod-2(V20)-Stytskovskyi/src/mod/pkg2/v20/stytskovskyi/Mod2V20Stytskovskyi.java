/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mod.pkg2.v20.stytskovskyi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mod2V20Stytskovskyi 
{
    public static void main(String[] args) throws IOException 
    {
        List<Integer> intCollection = new ArrayList<> ();
        Scanner sc = new Scanner(System.in);
        int input;
        boolean run = true;
        
        intCollection.add(3);
        intCollection.add(8);
        
        while(run == true)
        {
            clearConsole();
            System.out.print("List of items in the collection: ");
            for (int i = 0; i < intCollection.size(); i++)
            {
                System.out.print(intCollection.get(i) + " ");
            }
            
            System.out.println("\nEnter 1 for adding an Integer.\nEnter 2 for removing an Integer\nEnter 3 for searching for an Integer\nEnter 4 to exit the program.");
        
            input = sc.nextInt();
        
            if (input == 1)
            {
                clearConsole();

                System.out.println("Enter an Integer to add to the collection..");
                input = sc.nextInt();
                intCollection.add(input);
                
                System.out.println("Integer added.");
                
                input = 0;
                System.in.read();
            }else if (input == 2)
            {
                clearConsole();
                
                System.out.println("Enter an Integer to remove from the collection..");
                input = sc.nextInt();
                if (intCollection.indexOf(input) != -1)
                {
                    intCollection.remove(intCollection.indexOf(input));
                    System.out.println("Integer removed successfully.");
                }
                else
                    System.out.println("Couldn't find the Integer.");
                input = 0;
                System.in.read();
            }else if (input == 3)
            {
                clearConsole();
                
                System.out.println("Enter an Integer to search for..");
                input = sc.nextInt();
                
                if (intCollection.indexOf(input) != -1)
                    System.out.println("The Integer " + input + " was found in the collection.");
                else
                {
                    int closest = 0;
                    int closestDifference = 1000000000;
                    for (int i = 0; i < intCollection.size(); i++)
                    {
                        int t = intCollection.get(i) - input;                        
                        if (t < 0)
                            t *= (-1);
                        if (closestDifference > t)
                        {
                            closestDifference = t;
                            closest = intCollection.get(i);
                        }
                    }
                    System.out.println("The closest Integer to " + input + " is " + closest + ".");
                }
                input = 0;
                System.in.read();
            }else if (input == 4)
                    run = false;
        }
    }
    public static void clearConsole() 
    {
        for (int i = 0; i < 100; i++)
            System.out.println("\b");
    }

}

