import java.util.HashMap;
import java.util.Map;

public class RearrangeString3 {
    public static void main(String[] args) {
        String input="boy.4 is2 the3 Where1";
        System.out.println("input is: "+input);

        String[] word=input.split(" ");
        Map<Integer,String> map=new HashMap<>();

        for(int i=0;i<word.length;i++){
            String str=word[i];
            map.put(Integer.valueOf(str.substring(str.length() - 1, str.length())),
                     str.substring(0, str.length() - 1));
        }
        System.out.println("elements :"+map);

        String output=" ";
        for(Map.Entry<Integer,String> e:map.entrySet()){
            output+=e.getValue()+" ";
        }
        System.out.println(" output is:"+ output);        
    }
}