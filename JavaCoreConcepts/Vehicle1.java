package JavaCoreConcepts;

public class Vehicle1 {
    private String model;
    private int year;
    private int reantalFee;

    public Vehicle1(){
        
    }

    public Vehicle1(String model,int year,int reantalFee){
        this.model=model;
        this.year=year;
        this.reantalFee=reantalFee;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getReantalFee() {
        return reantalFee;
    }

    public void setReantalFee(int reantalFee) {
        this.reantalFee = reantalFee;
    }
    
    public void details(){
        System.out.println("model "+this.model);
        System.out.println("year " +this.year);
        System.out.println("rentalFee "+this.reantalFee);
    }
   
}
