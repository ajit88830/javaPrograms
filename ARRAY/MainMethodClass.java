package ARRAY;

import JavaCoreConcepts.Bmw;

public class MainMethodClass {
     public static void main(String[] args) {
        Bmw c = new Bmw("BMW", 2012, 5000, 6, "P");
        c.calulateRent(20);
        System.out.println("Fee Calculated");
    }
}
