package LIST;

import java.util.Arrays;

import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter 5 numbers");
        
       for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
       }
       sc.close();
        int min=Arrays.stream(arr).min().getAsInt();
        System.out.println("min number is: "+min);

        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println("max number is: "+max);



    }
}