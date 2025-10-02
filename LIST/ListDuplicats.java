package LIST;

import java.util.Arrays;
import java.util.List;

public class ListDuplicats {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ajit","Prakash","Pradeep","Ajit","Pradip");
            list =list.stream().distinct().toList();
            System.out.println(list);
        }
    }
    
