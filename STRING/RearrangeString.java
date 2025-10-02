
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RearrangeString {
    public static void main(String[] args) {
        String input = "name2 my1 is3 Ajit4";
        System.out.println("Input:" + input);

        // System.out.println("output: " +convertString(input));
        // }

        // public static String convertString(String input) {
        String[] words = input.split(" ");
        Map<Integer, String> maping = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];

            // str=str.substring(0,str.length()-1) ;
            // str=str.substring(str.length()-1,str.length()) ;
            // System.out.println(str);
            maping.put(Integer.valueOf(str.substring(str.length() - 1, str.length())),
                    str.substring(0, str.length() - 1));

        }
        System.out.println(maping);

        // System.out.println("Hi "+name.substring(0,3));
        // System.out.println("Hi "+name.substring(1,2));
        // System.out.println("Hi "+name.substring(0,name.length()-1));

        String output = "";
        for (Map.Entry<Integer, String> e : maping.entrySet()) {
            output += e.getValue() + " ";
        }
        System.out.println(output);
        List<Integer> keyList = Arrays.asList(4,2,3,1);
        //List<Integer> keyList = new ArrayList<>();
        //keyList.addAll(maping.keySet());
        Collections.sort(keyList);
        Collections.reverse(keyList);

        for (int e : keyList) {
            System.out.println("Key : "+e+" Value : "+maping.get(e));

        }

        // String[] outputWords= new String[words.length];
        // // outputWords=Arrays.stream(outputWords)
        // // .map(sis->sis.replaceAll("\\d+"," ")).toArray(String[]::new);
        // outputWords[0]=words[1];//my
        // outputWords[1]=words[0];//name
        // outputWords[2]=words[2];//is
        // outputWords[3]=words[3];//Ajit
        // return String.join(" ", outputWords);
    }
}
