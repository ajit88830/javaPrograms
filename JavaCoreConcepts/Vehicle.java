package JavaCoreConcepts;

public class Vehicle {
    int wheelsCount;

    public void start1(){
        System.out.println("Vehicle is starting");
    }
    Vehicle(){
        System.out.println("vehicle is being created");
    }
    Vehicle(int wheelsCount){
        this.wheelsCount=wheelsCount;
        System.out.println("vehicle created using wheel");
    }
}
