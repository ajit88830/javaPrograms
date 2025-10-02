package ARRAY;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int table[][]=new int[3][3];
         for(int i=0;i<table.length;i++){
            for(int j=0;j<table.length;j++){
                table[i][j]=sc.nextInt();
                
            }  
            
            System.out.println(table);
         }
            sc.close();       
    }
}
