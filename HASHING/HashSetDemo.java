package HASHING;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        if(set.contains(4)){
            System.out.println("yes");
        }else
        System.out.println("no element related");
        //set.remove(1);
        System.out.println(set);

        System.out.println(set.size());
        Iterator<Integer> it=set.iterator();
        System.out.println("----------------------");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------");
       
    }
}
