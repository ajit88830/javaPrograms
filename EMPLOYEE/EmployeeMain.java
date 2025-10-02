package EMPLOYEE;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setRollNO(1);
        emp1.setEmpName("Ajit");
        emp1.setAddress("Varanasi");
        emp1.setSalary(1904);
        System.out.println("list element is");
        System.out.println(emp1);

        Employee emp2=new Employee(101,"Rohit Kumar","Karnatka",10000);
        System.out.println(emp2);

        List<Employee> empList=new ArrayList<Employee>();
        for(int i=1;i<10;i++){
            Employee emp=new Employee(101+i,"rohit kumar"+i,"Tumbad"+i,100*i);
            empList.add(emp);
        }
        System.out.println();
        List<Employee> list=new ArrayList<>();
       for(Employee emp:empList){
        if(emp.getSalary()>400){
            list.add(emp);            
       }
       System.out.println("salaris of empllyees greatwr than 400: "+list);
       System.out.println();
        System.out.println("getting each item from the list");
        for(int i=0;i<empList.size();i++){
            
            System.out.println(empList.get(i));
        }
        // for(Employee e:empList){
        //     System.out.println("list is "+e);
         // }  
    }
    }
}
