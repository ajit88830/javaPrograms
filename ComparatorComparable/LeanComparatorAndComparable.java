 package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LeanComparatorAndComparable {
    public static void main(String[] args) {
        Animal a1=new Animal(2, "POJO",13);
        Animal a2=new Animal(3, "ROJO",15);
        Animal a3=new Animal(1, "KHOJO",10);
        Animal a4=new Animal(4, "JOJO",14);

        List<Animal> dogs=new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        
       System.out.println(dogs); 
       Collections.sort(dogs, new MyCustomComparator());//comparator
       Collections.sort(dogs,(o1,o2)-> o1.name.compareTo(o2.name));
       Collections.sort(dogs);//comparable
      
       System.out.println(dogs);

        
    }
    
}

class MyCustomComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.weight-o2.weight;
    }

}
 