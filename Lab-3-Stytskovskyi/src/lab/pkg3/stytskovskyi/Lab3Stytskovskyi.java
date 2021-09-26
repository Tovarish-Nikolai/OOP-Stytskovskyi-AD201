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
            System.out.println("true");
        }
        
        String nums = "fr3dd13";
        System.out.println(sumNumbers(nums));
        
        String block = "aaanndddd";
        System.out.println(longestBlock(block));
        
        String words = "I love cake";
        separateWords(words);
        
        String wordA = "Java", wordB = "Script";
        System.out.println(combineSymbols(wordA, wordB));
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
    
    public static int longestBlock (String s) //Метод 3
    {                                        //Ничего сложного, но хотя-бы пришлось немного подумать 
        int longest = 0, temp = 1;
        
        for (int i = 0; i < s.length(); i++)
        {
            if (i+1 < s.length() && s.charAt(i + 1) == s.charAt(i))
            {
                temp++;
            }
            else
            {
                if (longest < temp)
                    longest = temp;
                temp = 1;
            }
        }
        
        return longest;
    }
    
    public static void separateWords(String s)  //Метод 4
    {
        String word = "";     
        
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != ' ')
            {
                   word += s.charAt(i);
            }
            else
            {
                System.out.println(word);
                word = "";
            }
            if (i == s.length() - 1)
            System.out.println(word);
        }
    }
    
    public static String combineSymbols(String a, String b) //Метод 5
    {
        String combined = "";
        int length;
        
        if (a.length() > b.length())
            length = a.length();
        else
            length = b.length();
        
        for (int i = 0; i < length; i++)
        {
            if (i < a.length())
                combined += a.charAt(i);
            if (i < b.length())
               combined += b.charAt(i);
        }
        
        return combined;
    }
}

//Всё довольно просто, не думаю что нужны какие-то коменты
// но если вдруг нужны - на следующий раз учту

