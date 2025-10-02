package JavaCoreConcepts;

public class Employee1 {
    private int id;
    private String name;
    private int salaray;

    public Employee1( int id,String name,int salaray){
        this.id=id;
        this.name=name;
        this.salaray=salaray;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaray() {
        return salaray;
    }

    public void setSalaray(int sal) {
        this.salaray = sal;
    }
    public void displayDetails(){
        System.out.println("id "+this.id);
        System.out.println("name "+this.name);
        System.out.println("salary "+this.salaray);
        System.out.println();
    }
    public static void main(String[] args) {
        Employee1 obj=new Employee1(1, "Ajit1", 10000);
        Employee1 ob1=new Employee1(2, "Ajit2", 100012);
        Employee1 obj2=new Employee1(3, "Ajit3", 10013);
        Employee1 obj3=new Employee1(4, "Ajit4", 10014);
        obj.displayDetails();
        ob1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }
}