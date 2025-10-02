package JavaCoreConcepts;

public class SuperEx {

    public static void main(String[] args) {
        B obj=new B(5);
        obj.run2();
       
    }
}
class A{
    A(){
        System.out.println("A is called");
    }
    A(int a){
        System.out.println("in a Int");
    }
}
class B extends A{
    B(){
       
        System.out.println("B is caled");
    }
    B(int a){
         super(a);
       // this();
        System.out.println("in B int");
        

    }
    void run2(){
        System.out.println("always run");
    }
}
