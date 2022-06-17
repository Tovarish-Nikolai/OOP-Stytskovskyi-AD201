/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5.stytskovskyi;

/**
 *
 * @author USER
 */
public class Lecturer extends Person
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
}
