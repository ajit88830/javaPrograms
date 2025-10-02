package SimpleProgram;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        int x,y,t;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of x");
       x=sc.nextInt();
       System.out.println("enter the value of y");
       y=sc.nextInt();
        sc.close();
        t=x;
        x=y;
        y=t;
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
