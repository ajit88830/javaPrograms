

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        String input="Ajit4 my1 is3 name2";
        String wordString[]=input.split(" ");
        for(int i=0;i<wordString.length;i++){
            String str=wordString[i];
            map.put(Integer.valueOf(str.substring(str.length()-1,str.length())),str.substring
            (0,str.length()-1));
        }
        System.out.println(map);
        String outPut=" ";
        for(Map.Entry<Integer,String> e:map.entrySet()){
            outPut+=e.getValue()+" ";
        }
        System.out.println(outPut);
    }
}
