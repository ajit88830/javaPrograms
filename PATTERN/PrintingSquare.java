package PATTERN;

import java.util.Scanner;

public class PrintingSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int num = sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {

            
            for (int j = 0; j < num; j++) {
                System.out.print("  *");
            }
            
            System.out.println();
        }
    }
    }
