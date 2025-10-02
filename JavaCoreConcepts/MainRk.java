package JavaCoreConcepts;
//main
public class MainRk {
    public static void main(String[] args) {
        Wagnor ajit=new Wagnor();
        ajit.Rishi();
        ajit.Sonu();
    }
              
    }
    class Wagnor extends Jadu{ //child class
        public void Rishi(){
            System.out.println("Rishikesh");        
        }
    }
    //abstract class

    
    abstract class Jadu{
        public abstract void Rishi();  // abstract method

       //non abstract method
        public void Sonu(){
            System.out.println("sonu");
        }
    }
    
