package HASHING;
import java.util.HashMap;
import java.util.Map;

public class HashMapAjit {       //hashMap is based on <key ,value> pair
    public static void main(String[] args) {
       
        Map <String,Integer> map = new HashMap<String, Integer>();
        //insertion
        for(int i=0;i<100;i++){
            map.put("India" +i,120+i);
            System.out.println(map);
        }
       
        // map.put("China",90); 
        // map.put("Bangladesh",70);

          // printing the values

        if(map.containsKey("India0"))    // to check the value relaed to the key
            System.out.println("key is present");
        else{
            System.out.println("Key is not present");
            }
            for(Map.Entry<String, Integer> e:map.entrySet()){  // iterating all the element of list
                System.out.println("data in the list is "+e);
                // System.out.println(e.getKey());
                // System.out.println(e.getValue());
            }

            
    }
}
