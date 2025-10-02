package JavaCoreConcepts;

import java.util.Scanner;

public class AverageSumClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers");
        int n[] = new int[4];
        int avg = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            avg = n[i] + avg;

        }
        System.out.println("Avg Sum is: " + avg);

        // division by zero
        // System.out.println("enter dividend: ");
        // int dividend=sc.nextInt();

        System.out.print("enter divisor: ");
        int divisor = sc.nextInt();
        
        int average = 0;
        if (divisor == 0) {
            System.out.println("Do not divided by zero");
        } else {
            average = avg / divisor;
            System.out.println("average after division: " + average);
        }
        // upper limit

        System.out.println("enter the number of entries(max 2)");
        if (n.length > 2) {
            System.out.println("you have crossed the upper limit");
        }

        String input = sc.nextLine();
        if (input.length() > 10)
            System.out.println("string entered should not be more than 10");
        else
            System.out.println("string entered" + input);
        
        // emoloyee code 
        try{
            System.out.println("enter the employee code (1-100)");
            int empCode=sc.nextInt();
       
         if(empCode<1){ 
         throw new InvalidEmployeeCodeException("do not enter -ve value");
         }
         else if(empCode>100){
                throw new InvalidEmployeeCodeException("Do not enter value more than 100");
         }

    
        }
      catch(InvalidEmployeeCodeException e){
        System.out.println(e.getMessage());
       }      
    }  
}
class InvalidEmployeeCodeException extends Exception{
    public InvalidEmployeeCodeException(String message){
        super(message);
    }

}
