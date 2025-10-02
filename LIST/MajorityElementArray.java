package LIST;

import java.util.HashMap;

import java.util.Map;

public class MajorityElementArray {
    public static void majorityElement(int num[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){

            if(map.containsKey(num[i])) //true
                map.put(num[i],map.get(num[i])+1);
            else                        //false
                map.put(num[i], 1);
        }
        for(int key:map.keySet()){
            if(map.get(key)> num.length/3)
                System.out.println(key);
            
        }
    }
    public static void main(String[] args) {
        int num[]={1,3,2,5,1,3,1,5,1} ;
       majorityElement(num);


    }
}
