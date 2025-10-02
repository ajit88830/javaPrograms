package LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> listarr=new ArrayList<>();
        listarr.add(0);
        listarr.add(1);
        listarr.add(2);
        listarr.add(3);
        System.out.println(listarr); //printing list

        System.out.println(listarr.get(1));

        listarr.add(3,  5);
        System.out.println(listarr); 
        Collections.sort(listarr);
        System.out.println("list sorrted: "+listarr);
       String input="my1 ajit4 is3 name2";
       String words[]=input.split(" ");
        // SortedMap<Integer,String> map1=new TreeMap< >();
    HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            map.put(Integer.valueOf(str.substring(str.length()-1,str.length()))
            , str.substring(0, str.length()-1));

        }
        String outpString= " ";
        for(Map.Entry<Integer,String> e:map.entrySet()){
            outpString+=e.getValue()+" ";
        }
        System.out.println("output string is :"+outpString);
        // System.out.println(map);
       
        // map.put(2, "Ajit0");
        // map.put(1, "Ajit1");
        // map.put(3, "Ajit2");
        // map.put(0, "Ajit3");
       
    }
}
