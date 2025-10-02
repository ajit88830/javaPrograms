package SimpleProgram;

public class Fibonacciseries {
    public static void main(String[] args) {
        int n=7,f=0,s=1,t;
       for(int i=1;i<=n;i++){
        t=f+s;
        System.out.println(t);
        f=s;
        s=t;
       }
    }
}
