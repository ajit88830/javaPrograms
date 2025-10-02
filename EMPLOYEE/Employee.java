package EMPLOYEE;
public class Employee {
    private int rollNO;
    private String empName;
    private String address;
    private int salary;
    public Employee() {
    }
    public Employee(int rollNO, String empName, String address, int salary) {
        this.rollNO = rollNO;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }
    public int getRollNO() {
        return rollNO;
    }
    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [rollNO=" + rollNO + ", empName=" + empName + ", address=" + address + ", salary=" + salary
                + "]";
    }

    
    
}