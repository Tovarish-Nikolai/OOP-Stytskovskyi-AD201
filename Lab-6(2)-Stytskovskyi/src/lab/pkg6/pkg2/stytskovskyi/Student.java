/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.pkg2.stytskovskyi;

/**
 *
 * @author USER
 */
public class Student implements Person        
{
    protected String name, lastName;
    protected int age;
    
    private String group;
    private int number;
    
    public Student (String n, String l, int a, String g, int num)
    {
        setName(n);
        setLastName(l);
        setAge(a);
        
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
    
    @Override
    final public void setName(String n) { name = n; }
    @Override
    public String getName() { return name; }
    
    @Override
    final public void setLastName(String l) { lastName = l; }
    @Override
    public String getLastName() { return lastName; }
    
    @Override
    final public void setAge(int a) { age = a; }
    @Override
    public int getAge() { return age; }
}
