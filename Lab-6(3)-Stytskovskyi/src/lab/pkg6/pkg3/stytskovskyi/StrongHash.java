/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.pkg3.stytskovskyi;

/**
 *
 * @author USER
 */
public class StrongHash implements HashInterface
{

    @Override
    public int hash(String str) 
    {
       int strongHash = 0;
       char[] charArray = str.toCharArray();
       
       for (int i = 0; i < str.length(); i++)
       {
           if (charArray[i] != ' ')
           {
               strongHash += charArray[i] * i;
           }
       }
       
       return strongHash;
    }
    
}
