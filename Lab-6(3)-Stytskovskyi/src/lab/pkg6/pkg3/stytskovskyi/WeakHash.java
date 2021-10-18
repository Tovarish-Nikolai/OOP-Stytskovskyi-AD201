/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.pkg3.stytskovskyi;

/**
 *
 * @author USER
 */
public class WeakHash implements HashInterface
{
    @Override
    public int hash(String str) 
    {
        int weakHash = (int) str.chars().filter(ch -> ch != ' ').count();
        
        return weakHash;
    }
    
}
