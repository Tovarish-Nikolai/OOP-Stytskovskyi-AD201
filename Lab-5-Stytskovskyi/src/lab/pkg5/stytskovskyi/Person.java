/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5.stytskovskyi;

/**
 *
 * @author USER
 */
public class Person 
{
    protected String name, lastName;
    protected int age;
    
    public Person(String n, String l, int a)
    {
        setName(n);
        setLastName(l);
        setAge(a);
    }
    
    public void printInfo()     // В джаве нет cout для того чтобы его оверлоуднуть, да?
    {
        System.out.println("Человек " + name + " " + lastName + ", возраст: " + age);
    }
    
    final public void setName(String n) { name = n; }
    public String getName() { return name; }
    
    final public void setLastName(String l) { lastName = l; }
    public String getLastName() { return lastName; }
    
    final public void setAge(int a) { age = a; }
    public int getAge() { return age; }
}
