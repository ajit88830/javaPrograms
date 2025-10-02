package JavaCoreConcepts;


public class Main201{
    public void rishi12(){
        System.out.println("ABC");
    }
    public void rishi12(int a,int b){
        System.out.println(a+b);
    }
    public void rishi12(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
       Main201 obj=new Main201();
        obj.rishi12();
        obj.rishi12(2, 4);
        obj.rishi12(2, 3, 4);
    }
}

