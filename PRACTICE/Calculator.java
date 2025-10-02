
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Choose an operator");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        int choice=sc.nextInt();
        System.out.println("enter the 1st number");
        double num1=sc.nextInt();

        System.out.println("enter the 2nd number");
        double num2=sc.nextInt();

        double result=0;
        switch (choice) {
            case 1:
                result=num1+num2;
                System.out.println("Result: "+num1+"+"+num2+"="+result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("Result: "+num1+"-"+num2+"="+result);
                break;        
            case 3:
                result=num1*num2;
                System.out.println("Result: "+num1+"*"+num2+"="+result);
                break;

            case 4:
            if(num2!=0){
                result=num1/num2;
                System.out.println("Result: "+num1+"/"+num2+"="+result);
            }else{
                System.out.println("cannot be divided by Zero");
            }
                break;
            default:
                System.out.println("invalid choice");
            
        }
        sc.close();
        
    }
}
