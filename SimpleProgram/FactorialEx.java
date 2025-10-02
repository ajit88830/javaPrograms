package SimpleProgram;

import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number ");
        int fact=1;
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
       System.out.println("factorial is: "+fact);
}
}
