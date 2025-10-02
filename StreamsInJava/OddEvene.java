package StreamsInJava;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class OddEvene {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(11,22,43,15,54);
        List<Integer> even=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
