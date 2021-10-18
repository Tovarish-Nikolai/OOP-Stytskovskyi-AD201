/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.pkg1.stytskovskyi;

/**
 *
 * @author USER
 */
public abstract class Person 
{
    protected String name, lastName;
    protected int age;
    
    public Person(String n, String l, int a)
    {
        setName(n);
        setLastName(l);
        setAge(a);
    }
    
    abstract void printInfo();    

    abstract void setName(String n);
    abstract String getName();
    
    abstract void setLastName(String l);
    abstract String getLastName();
    
    abstract void setAge(int a);
    abstract int getAge();
}
