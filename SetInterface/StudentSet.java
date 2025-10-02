package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> st=new HashSet<>();
        st.add(new Student(1, "Anuj"));  
        st.add(new Student(1, "rohit"));
        st.add(new Student(1, "Anuj"));
        System.out.println(st);
    }
}
class Student{
    private int rollNo;
    private String name;
    
    
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
    //constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }
    
    
    
     }
    
    
