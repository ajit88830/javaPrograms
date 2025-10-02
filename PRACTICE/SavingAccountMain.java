

public class SavingAccountMain {
     
     public static void main(String[] args) {
        SavingsAccount saver1=new SavingsAccount(2000);
        SavingsAccount saver2=new SavingsAccount(3000);
        SavingsAccount.annuallInterestRate=0.04;

      for(int i=0;i<12;i++){
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
      }

      System.out.println("new balance for saver1 ="+saver1.getBalance()+".00");
      System.out.println("new balance for saver2 ="+saver2.getBalance()+".00");

      SavingsAccount.modifyInterestRate(0.05);
      saver1.calculateMonthlyInterest();
      saver2.calculateMonthlyInterest();

      System.out.println("new balance for saver 1 ="+saver1.getBalance()+ ".00");
      System.out.println("new balance for saver 2 ="+saver2.getBalance()+".00");
        
      }
    
}
class SavingsAccount{
static double annuallInterestRate;
private int savingsBalance;

public SavingsAccount(int amount){
this.savingsBalance=amount;

}
static void modifyInterestRate(double rate){
annuallInterestRate=rate;
System.out.println("the annual interest rate has been changed to "+rate+"%");
}

void calculateMonthlyInterest(){
  int interest=(int) (this.savingsBalance*(annuallInterestRate/12));
  this.savingsBalance+=interest;

}

int getBalance(){
  return savingsBalance;
}
}
