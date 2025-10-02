package JavaCoreConcepts;

 
interface InnerKhushi {
    // by default abstract methods
    public void ajit();
    public void rishi();    
} 
public class Chitkara implements InnerKhushi{

    public void ajit() {
       System.out.println("ajit called");
    }
    public void rishi() {
       System.out.println("rishi called");
    }
    
} // main
class Chtikara2{
    public static void main(String[] args) {
        Chitkara ab=new Chitkara();

        ab.ajit();
        ab.rishi();
    }
}


    

