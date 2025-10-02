package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class LearnSet {
    
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(1);
       
            System.out.println(set);
        set.remove(2);
        System.out.println(set);
System.out.println("---------------------------------");

        Set<Integer> lset=new LinkedHashSet<>();
        lset.add(2);
        lset.add(4);
        lset.add(6);
        lset.add(8);
        System.out.println(lset);
        lset.remove(6);
        System.out.println(lset);

        System.out.println("---------------------------------");

        Set<Integer> setTree=new TreeSet<>();
        setTree.add(4);
        setTree.add(5);
        setTree.add(2);
        setTree.add(7);
        setTree.add(9);

        System.out.println(setTree);
    
    }
}
 