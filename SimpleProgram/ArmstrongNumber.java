package SimpleProgram;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int originial=n;
        int temp,armStrong=0;
        
        while(n>0){
            temp=n%10;
            temp=(int) Math.pow(temp, 3);
            armStrong=armStrong+temp;
            n=n/10;
            
    }
     
    if(armStrong==originial)
        System.out.println("Number is armstrong");
    else
        System.out.println("Not a armstrong");
}

}
