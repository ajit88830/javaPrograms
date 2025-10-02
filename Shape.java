

import SHAPES.Circle;
import SHAPES.Square;
import SHAPES.Triangle;

public class Shape {
    public static void main(String[] args){
        
        
        Circle c = new Circle(2.5);
        Triangle t = new Triangle(3,4);
        Square s = new Square(5);

        System.out.println("Area of circle is : "+c.getArea()+"Circumference of Circle"+c.getPerimeter());
        System.out.println("Area of Triangle is : "+t.getArea()+"Perimeter"+t.getPerimeter());
        System.out.println("Area of Square is : "+s.getArea()+"Perimeter"+s.getPerimeter());
}
}
