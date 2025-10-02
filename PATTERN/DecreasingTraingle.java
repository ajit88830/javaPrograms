package PATTERN;

import java.util.Scanner;

public class DecreasingTraingle {
    public static void main(String[] args) {
            // * * * *
            // * * *
            // * *
            // *
                           
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
