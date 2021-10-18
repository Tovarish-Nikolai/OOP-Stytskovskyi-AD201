/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.pkg2.stytskovskyi;

/**
 *
 * @author USER
 */
interface Person 
{       
    abstract void printInfo();    

    abstract void setName(String n);
    abstract String getName();
    
    abstract void setLastName(String l);
    abstract String getLastName();
    
    abstract void setAge(int a);
    abstract int getAge();
}
