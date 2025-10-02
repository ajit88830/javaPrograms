package ARRAY;

import java.util.Scanner;

public class ConsonentpProblem {

    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);

        return ch=='a' ;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String st=sc.nextLine();

        int vowelCount=0;
        int consonantCount=0;

       for(char c:st.toCharArray()){
            if(st.isEmpty() || !Character.isLetter(c)){
                System.out.println("invalid characters");
            }
           else{
            if(c=='a' || c=='a' ||c=='e' || c=='i' || c=='o'|| c=='u'){
                System.out.println();
                vowelCount++;
            }else{
                consonantCount++;
            }
           }    
        }
        System.out.println("Numbers of vowels in the String : "+vowelCount);
        System.out.println("NUmber of Consonants in the String : " +consonantCount);
        sc.close();
    
       }
    }

