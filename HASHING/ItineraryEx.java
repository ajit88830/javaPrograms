package HASHING;

import java.util.HashMap;

public class ItineraryEx {
    public static String getStart( HashMap<String,String> tickets){
        HashMap<String,String> reverseMap=new HashMap<>();

        for(String key: tickets.keySet()){
            reverseMap.put(tickets.get(key), key);
        }
        for(String key:tickets.keySet()){
            if(!reverseMap.containsKey(key)){
                return key;
          }

        }       
      return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("chennai" , "bengluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

       String start=getStart(tickets);
      
       while(tickets.containsKey(start)){
        System.out.println(start);
        start=tickets.get(start);
       }
       System.out.println(start);
        
    }

}
