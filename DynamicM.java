import java.util.*;

abstract class shape{
    int length, breadth;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your fisrt no:");
        length=sc.nextInt();
        System.out.println("Enter your 2nd no:");
        breadth=sc.nextInt();

    }
    abstract void compute_area();        // REmember it ohkk

    
} 
class Rectangle extends shape{
    int area;

    public void compute_area(){
        this.area= length*breadth;
        System.out.println("area of the rectangle is "+area);
    }
}

class DynamicM{
    public static void main (String[] args){
        Rectangle r = new Rectangle();
        r.input();
        r.compute_area();
    }
}