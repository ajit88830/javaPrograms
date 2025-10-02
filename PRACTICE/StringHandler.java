import java.util.*;

class StringHandler{
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String: " + sb.reverse());
        System.out.println("Upper string is: "+str.toUpperCase());
        System.out.println("Lower string is: "+str.toLowerCase());
        //doing it by hard code
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
      sc.close();
    }
}