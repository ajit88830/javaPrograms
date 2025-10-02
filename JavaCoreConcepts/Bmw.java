package JavaCoreConcepts;

public class Bmw extends Vehicle1 {

    private int numDoors;
    private String fuelType;

    public Bmw(){
        // super();
    }

    public Bmw(String model, int year, int reantalFee, int numDoors, String fuelType) {
        super(model, year, reantalFee); // calling vehicle constructor
        System.out.println("Constructor called");
        this.numDoors = numDoors;
        this.fuelType = fuelType;

    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getFuelType() {
        return fuelType;
    }
    
    public void calulateRent(double additionalFee) {
        double newRentalFee = super.getReantalFee() + additionalFee;

        System.out.println("rental fee is: " + newRentalFee);

    }

}
