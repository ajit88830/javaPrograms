package StreamsInJava;

import java.util.ArrayList;
import java.util.List;

public class JavaStream {
    public static void main(String[] args) {
        
    
    List<String> list=new ArrayList<>();
    list.add("Ajit");
    list.add("Rohit");
    list.add("Ajit");

    System.out.println("list is :" +list);

    List<String> arc=list.stream().distinct().toList();
    System.out.println("after removing du[plicates:" +arc);
    }
}
