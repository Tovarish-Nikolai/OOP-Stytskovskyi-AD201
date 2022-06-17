/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Point;  
//import lab.pkg4.stytskovskyi.SegmentCreator;
/**
 *
 * @author USER
 */
public class Point //extends SegmentCreator
{
    private final double x, y;
    
    public Point(double x, double y) 
    {       
        this.x = x;
        this.y = y;
    }    
    
    public double getY() { return y; }
    public double getX() { return x; }
}
//Я искренне не могу понять зачем нужен этот класс
// ладно Segment, в нём хотябы метод вычисления длины
//  а зачем по заданию создавать класс точки, я так и не допёр
//   И также не допёр зачем чудить с import'aми, но это дело такое
//    если просят сделать - я делаю.

// ааа, теория про наследственность, а задание нет, как я сразу не догадался, прикол вышел))))))0)