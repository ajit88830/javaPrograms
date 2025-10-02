package ExceptionHandling;

import java.util.Scanner;

public class LearnException{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");

        try
        {
            int age=sc.nextInt();
            sc.close();
            
            if(age>100)
                throw new MyException("hi there is error") ;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

