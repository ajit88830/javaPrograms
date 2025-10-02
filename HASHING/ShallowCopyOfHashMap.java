package HASHING;

import java.util.HashMap;

public class ShallowCopyOfHashMap {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        for(int i=0;i<10;i++){
            hashMap.put(1+i,"Ajit"+i);
        }
        System.out.println("the original HashMAp is: "+hashMap);
        HashMap<Integer,String> hash_Map=new HashMap<>();
        hash_Map=(HashMap)hashMap.clone();
        System.out.println("the cloned hash_Map is: "+hash_Map);
    }
}
