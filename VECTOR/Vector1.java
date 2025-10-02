package VECTOR;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(4);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(4);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(4);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(4);
        System.out.println("capacity is: "+v.capacity());
        for(int i:v){
            System.out.println(i);
        }
       
    }
}
