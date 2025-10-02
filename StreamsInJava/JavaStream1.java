package StreamsInJava;

import java.util.Arrays;
import java.util.List;

public class JavaStream1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,3,5,2);
        double average=list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(average);
        
    }
}
