package ThreadLearn;

public class ThreadClass {
    
    public static void main(String[] args) {
       
        Main thread=new Main();
        thread.start();
        thread.state();
    }
}
class Main extends Thread{
    public void run(){
        System.out.println("thread class working");
    }
    public void state(){
        System.out.println("other method is also working");
    }
}

