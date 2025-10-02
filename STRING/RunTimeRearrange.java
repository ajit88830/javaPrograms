import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;
import java.util.Scanner;

public class RunTimeRearrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the string");
        String inputString=sc.nextLine();
        

        System.out.println("enter the number to be removed");
        String numberRemove=sc.nextLine();
        sc.close();

        String resultString=removeNumbers(inputString,numberRemove);
        System.out.println(resultString);


    }

    private static String removeNumbers(String inputString, String numberRemove) {
        // Map<Character,Boolean> map=new HashMap<>();
        List<Character> removed = new ArrayList<>();
        for(char c:numberRemove.toCharArray()){
            if(Character.isDigit(c)){//when the number is digit it will add it to list.
                // map.put(c, true);
                removed.add(c);

            }
        }
        System.out.println("list of number array is :"+removed);
        // System.out.println(removed);
        StringBuilder sb=new StringBuilder();
        for(char c:inputString.toCharArray()){
            // if(!map.containsKey(c)){
            //     sb.append(c);
            // }
           
            if(!removed.contains(c)){
                sb.append(c);
            }
        }
        // System.out.println(sb);
        return sb.toString();
    }
    
}