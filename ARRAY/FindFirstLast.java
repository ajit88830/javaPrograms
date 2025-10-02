package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class FindFirstLast extends Thread {
    public void run(){
    List<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(4);
    list.add(8);
    list.add(6);
     int first=list.getFirst();
     System.out.println("first element is:"+ first);
     int last=list.getLast();
     System.out.println("last element is:"+last);
    }

  
}
