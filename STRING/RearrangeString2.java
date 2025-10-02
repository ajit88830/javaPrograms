import java.util.HashMap;
import java.util.Map;

public class RearrangeString2 {
    public static void main(String[] args) {

        String name2 = "Pradip8 is7 Pradp9";
        String[] words1 = name2.split(" ");

        Map<Integer, String> map2 = new HashMap<Integer, String>();

        for (int i = 0; i < words1.length; i++) {
            String str2 = words1[i];
             map2.put(Integer.valueOf(str2.substring(str2.length() - 1, str2.length())),
                     str2.substring(0, str2.length() - 1));
        }        
        System.out.println(" output are" + map2);

        String outputString = " ";
        for (Map.Entry<Integer,String> e4 : map2.entrySet()) {
            outputString += e4.getValue() + " ";
        }
        System.out.println(outputString);
    }
}
