package JavaCoreConcepts;

public class Car  extends Vehicle {
   int cylinderCount;
    public void start(){
        System.out.println("starting car");
    }
    Car(){
        System.out.println("car is being created");
    }
    Car(int cylinderCount){
        this.cylinderCount=cylinderCount;
        System.out.println("creating car with cylinder");
    }
   
    
}
