/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5.stytskovskyi;

/**
 *
 * @author USER
 */
public class Student extends Person        
{
    private String group;
    private int number;
    
    public Student (String n, String l, int a, String g, int num)
    {
        super(n,l,a);
        
        setGtoup(g);
        setNumber(num);
    }
    
    @Override
    public void printInfo()
    {
        System.out.println("Студент группы " + group + " " + lastName + " " + name + ", возраст: "
        + age + "\nНомер студенческого билета: " + number);
    }
    
    final public void setGtoup(String g) { group = g; }
    public String getGroup() { return group; }
    
    final public void setNumber(int n) { number = n; }
    public int getNumber() { return number; }
}
