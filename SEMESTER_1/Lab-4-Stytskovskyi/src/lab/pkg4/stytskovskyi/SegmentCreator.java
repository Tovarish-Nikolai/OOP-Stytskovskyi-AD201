/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4.stytskovskyi;
import Segment.Segment;
import Point.Point;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class SegmentCreator 
{    
    public SegmentCreator() 
    {
       Scanner sc = new Scanner(System.in);
        
       int xPoint1, xPoint2, yPoint1, yPoint2;
        
        System.out.println("Enter X of the first point..");
        xPoint1 = sc.nextInt();
        System.out.println("Enter Y of the first point..");
        yPoint1 = sc.nextInt();
        System.out.println("Enter X of the second point..");
        xPoint2 = sc.nextInt();
        System.out.println("Enter Y of the second point..");
        yPoint2 = sc.nextInt();
        
        
        Point p1 = new Point (xPoint1, yPoint1);
        Point p2 = new Point (xPoint2, yPoint2);                 
        
        Segment s1 = new Segment(p1, p2);
        s1.calculateLength();
        
        System.out.println("\n\n\nThe length of the segment equals to " + s1.getLength());
    }       
}
