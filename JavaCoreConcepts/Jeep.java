package JavaCoreConcepts;

public class Jeep extends Car {
    public void run() {

        Scooter obj1Scooter = new Scooter();
        obj1Scooter.breaking(this);
        super.start();
        System.out.println("jeep is running");
    }

    Jeep() {
        System.out.println("jeep is being created");
    }

    public static void main(String[] args) {

        Jeep jp = new Jeep();
        
        jp.start();
    }

}

class Scooter {
    public void breaking(Car car) {
        System.out.println("scooter breaking");
    }

}
