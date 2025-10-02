package JavaCoreConcepts;

import java.util.Scanner;

public class StudentNames {
    public static void main(String[] args) {
        int vowelCount=0;
        int consonantCount=0;


        Scanner sc=new Scanner(System.in);
       String input=sc.nextLine();
      
        sc.close();
        String lowerCaseInput=input.toLowerCase();
       for(char ch:lowerCaseInput.toCharArray()){
        if(lowerCaseInput.isEmpty())
            System.out.println("input is empty : "+input);
        if(Character.isDigit(ch))
            System.out.println("invalid input : "+ input);    
        if(Character.isLetter(ch))

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowelCount++;
            else
                consonantCount++;
       }
        System.out.println("number of vowel : "+vowelCount);
        System.out.println("number ofconsonant : "+consonantCount);
    }
}
