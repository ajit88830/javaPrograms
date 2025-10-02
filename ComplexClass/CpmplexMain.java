package ComplexClass;

public class CpmplexMain {
    public static void main(String[] args) {
        ComplexNumber z=new ComplexNumber(2, 3);
        ComplexNumber z1=new ComplexNumber(4);
        ComplexNumber z2=new ComplexNumber(-4,-3);
       ComplexNumber product=z.multiply(z2);
       System.out.println("product is ="+product);
        System.out.println("z2="+z2);
        System.out.println("z="+z);
        System.out.println("z1="+z1);

        ////
        // Integer i=new Integer(257);
        // byte x=i.byteValue();
        // System.out.println(x);
        
    }
}
