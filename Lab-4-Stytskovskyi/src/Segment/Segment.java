/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segment;
import Point.Point;
import lab.pkg4.stytskovskyi.SegmentCreator;

/**
 *
 * @author USER
 */
public class Segment //extends SegmentCreator
{
    private double length;
    Point p1, p2;
    
    public Segment (Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;                
    }
    
    public void calculateLength()
    {
        length = Math.sqrt( Math.pow(p2.getX() - p1.getX(), 2) 
                + Math.pow(p2.getY() - p1.getY(), 2) );    
    }
    
    public double getLength() { return length; }
}
