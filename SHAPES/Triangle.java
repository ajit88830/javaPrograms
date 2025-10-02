package SHAPES;

public class Triangle {
   public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    // Simplified: assumes equilateral triangle for perimeter
    public double getPerimeter() {
        return 3 * base;
    }
}
