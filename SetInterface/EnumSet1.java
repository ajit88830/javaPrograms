package SetInterface;


import java.util.EnumSet;

public class EnumSet1 {
     enum Color{
        Red,green,yellow
     }
     public static void main(String[] args) {
        EnumSet<Color> enumSet= EnumSet.allOf(Color.class);
        System.out.println(enumSet);
     }
}
