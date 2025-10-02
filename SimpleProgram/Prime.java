package SimpleProgram;

import java.util.Scanner;

public class Prime {
        public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int numPrime=sc.nextInt();

        if(isPrime(numPrime))
            System.out.println("is prime");
        else
            System.out.println("not a prime");
       sc.close();
    }
    public static boolean isPrime(int numPrime){
        for(int i=2;i<numPrime;i++){
            if(numPrime%i==0)
                return false;
        }
        return true;

        }
       }
   
        
    
