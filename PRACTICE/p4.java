import java.util.Scanner;

class Account{

    int accno;
    String name;
    double bal;

    Account(int accno, String name, double bal){
        System.out.println("Account created");
        this.bal=bal;
        this.accno=accno;
        this.name=name;
        System.out.println("Account number: "+accno);
        System.out.println("Account holder Name: "+name);
        System.out.println("Account balance: "+bal);
    }

    void withdraw(double amt) throws LessBalanceException{
       System.out.println("available balance: "+bal);
       bal=bal-amt;
       if(bal<500){
        bal=bal+amt;
        throw new LessBalanceException("Insufficient balance"); 
       }
    System.out.println("rs"+amt+"/-debited");
    System.out.println("Available balance: "+bal);
    }

    void deposit(double amt){
        System.out.println("available balance: "+bal);
        bal=bal+amt;
        System.out.println("rs"+amt+"/-credited");
        System.out.println("Available balance: "+bal);
    }

    void balance(){
        System.out.println("customer info");
        System.out.println("customer name: "+name);
        System.out.println("account no"+accno);
}
}

//creating exception class
class LessBalanceException extends Exception{
    LessBalanceException(String amt){
                System.out.println("withdrawing "+amt+" is not possible");
    }
}
public class p4 {
    static int i=0;
    public static void main(String[] args) {
        Account a[] = new Account[10];
        Scanner sc=new Scanner(System.in);
       
        String name;
        double amt;
        int accno,ch,k;
        boolean t=false;
        
        while(true){
            System.out.println("bank transaction");
            System.out.println("1. Create account 2. Withdraw 3.deposit 4. balance 5. exit");
            ch=sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("opening new account");
                    System.out.println("enter your name");
                    name=sc.next();

                    System.out.println("enter account number");
                    accno=sc.nextInt();

                    System.out.println("enter initial balance greater than 500");
                    amt=sc.nextDouble();

                    if(amt<500){
                        System.out.println("initial balance should be greater than 500");
                    }
                    else{
                       a[i]=new Account(accno,name,amt);
                       i++;
                    }
                    break;
            
                case 2:
                    System.out.println("enter account number");
                    accno=sc.nextInt();

                    for(k=0;k<i;k++){
                        if(a[k].accno==accno){
                            t=true;
                            break;
                        }
                    }
                    if(t){
                        System.out.println("\n enter the amount to withdraw: ");
                        amt=sc.nextDouble();
                        try{
                            a[k].withdraw(amt);
                        }
                        catch(LessBalanceException e){
                            System.out.println(e);
                        }
                       
                    }
                    else{
                        System.out.println("invalid account number");
                        t=false;
                    }
                    break;
                case 3:
                    System.out.println("enter account number");
                    accno=sc.nextInt();

                    for(k=0;k<i;k++){
                        if(a[k].accno==accno){
                            t=true;
                            break;
                        }
                    }
                   
                    break;
                case 4:
                    System.out.println("enter account number");
                    accno=sc.nextInt();

                    for(k=0;k<i;k++){
                        if(a[k].accno==accno){
                            t=true;
                            break;
                        }
                    }
                    if(t){
                        a[k].balance();
                    }
                    else{
                        System.out.println("invalid account number");
                        t=false;
                    }
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }
          
        }    
    }
}
