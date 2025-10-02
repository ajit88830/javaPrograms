package JavaCoreConcepts;

public class MainMethodClass {
     public static void main(String[] args) {
        Bmw car = new Bmw("BMW", 2012, 5000, 6, "P");
        Bmw c1 = new Bmw();
        car.calulateRent(20);
        c1.calulateRent(20.0);
        System.out.println("Fee Calculated");
    }
}
