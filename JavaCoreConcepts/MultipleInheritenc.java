package JavaCoreConcepts;

public class MultipleInheritenc implements B1,A1{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public static void main(String[] args) {
        MultipleInheritenc obj=new MultipleInheritenc();
        obj.m1();
        obj.m2();
    }
}
interface B1{
    void m1();
}
interface A1{
    void m2();
}

