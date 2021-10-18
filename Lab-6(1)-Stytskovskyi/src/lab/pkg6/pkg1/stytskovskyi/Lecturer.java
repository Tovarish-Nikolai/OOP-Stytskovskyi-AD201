/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.pkg1.stytskovskyi;

/**
 *
 * @author USER
 */
public final class Lecturer extends Person
{
    private String faculty;
    private int salary;
    
    public Lecturer(String n, String l, int a, String f, int s)
    {
        super(n, l, a);
        
        setFaculty(f);
        setSalary(s);
    }
    
    @Override
    public void printInfo()
    {
        System.out.println("Преподаватель кафедры " + faculty + " " + lastName + " " + name
        + ", возраст: " + age + ". Зарплата: " + salary);
    }
    
    public void setFaculty(String f) { faculty = f; }
    public String getFaculty() { return faculty; }
    
    public void setSalary(int s) { salary = s; }
    public int getSalary() { return salary; }
    
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
