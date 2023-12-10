import java.util.*;
abstract class Shape
{
    double length, breadth;
    void input()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter first value");
        
        length = s.nextDouble();

        System.out.println("Enter Second value");
        
        breadth = s.nextDouble();
        
    }
     abstract void compute_area();
}


class Triangle extends Shape
{
    public void compute_area()
    {
        double area;
        area = 0.5 * length * breadth;
        System.out.println("Traiangle Area is :"+area);
    }
}
class Rectangle extends Shape
{
    public void compute_area()
    {
        double area;
        area = length * breadth;
        System.out.println("Rectangle area is:"+area);
    }
}


public class Dynamic
{
    public static void main(String args[])
    {
      
        
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
      
        t.input();
        t.compute_area();
        
            r.input();
        r.compute_area();
                
    }
}


/*
Output
Enter first value
20
Enter Second value
30
Traiangle Area is :300.0
Enter first value
14
Enter Second value
12
Rectangle area is:168.0

*/
