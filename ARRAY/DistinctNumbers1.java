package ARRAY;


import java.util.HashSet;
import java.util.Set;

public class DistinctNumbers1 {
    public static void main(String[] args) {
        int n=5; //number of values.
        int[] nIntegers={2,3,2,2,3};
       Set<Integer> setInt=new HashSet<>();
        for(int i=0;i<n;i++){
            setInt.add(nIntegers[i]);
        }
        System.out.println("elements in set : "+setInt);
        System.out.println("size : "+setInt.size());
       };
    }


