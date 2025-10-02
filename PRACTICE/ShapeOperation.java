

import java.util.Scanner;

public class ShapeOperation {

    public static int squareOperationArea(int a) {
        int result = a * a;
        return result;
    }

    public static int squareOperationPerimeter(int side) {
        int result = 4 * side;
        return result;
    }

    public static double circleOperationPerimeter(double r) {
        double result = 2 * 3.14 * r;
        return result;
    }

    public static double circleOperationArea(double r) {
        double result = 3.14 * r * r;
        return result;
    }

    public static double rectangleOperationArea(double a, double b) {
        double result = a * b;
        return result;
    }

    public static double areaOperationArea(double a, double b) {
        double result = 2 * (a + b);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n enter the opearation to be done on Shapes");
            System.out.println("1: Area of Square ");
            System.out.println("2: Perimeter of square");
            System.out.println("3: Area of Circle ");
            System.out.println("4: Perimeter of circle ");
            System.out.println("5: Area of Rectangle ");
            System.out.println("6: Perimeter of Rectangle");

            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("enter the number of side");
                    int a = sc.nextInt();

                    int resultArea = squareOperationArea(a);
                    System.out.println("area of square of is: " + resultArea);
                    break;
                }
                case 2: {
                    System.out.println("enter the number of sides ");
                    int side = sc.nextInt();

                    int resultPerimeter = squareOperationPerimeter(side);
                    System.out.println("perimeter of the square is: " + resultPerimeter);
                    break;
                }

                case 3: {
                    System.out.println("enter the radius of circle");
                    double r = sc.nextDouble();

                    double result = circleOperationPerimeter(r);
                    System.out.println("perimeter of the circle is: " + result);
                    break;

                }
                case 4: {
                    System.out.println("enter the radius of the circle");
                    double r = sc.nextDouble();

                    double result = circleOperationArea(r);
                    System.out.println("Area of the circle is : " + result);
                    break;
                }
                case 5: {
                    System.out.println("enter the length  ");
                    double a = sc.nextDouble();

                    System.out.println("enter the width  ");
                    double b = sc.nextDouble();

                    double result = rectangleOperationArea(a, b);
                    System.out.println("Area of the recatange is :" + result);
                    break;
                }
                case 6: {
                    System.out.println("enter the length  ");
                    double a = sc.nextDouble();

                    System.out.println("enter the width  ");
                    double b = sc.nextDouble();

                    double result = areaOperationArea(a, b);
                    System.out.println("Area of the recatange is :" + result);

                    break;

                }
                case 7:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println(" invalid choice");

            }
        }
    }
}
