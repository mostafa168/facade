
package mostafa_bank;


public class fundscheck {
  private double cashinaccount = 100.00;
  
  public double getcashinaccount(){
      return cashinaccount;
  }
  public void decreaseCash(double cashwithdrawn){
      cashinaccount-=cashwithdrawn;
  }
   public void increaseCash(double cashdeposited){
      cashinaccount+=cashdeposited;
  }
   public boolean haveenoughmoney(double cashtowithdraw){
       if(cashtowithdraw>cashinaccount){
           System.out.println("sorry you do not have enough money");
           System.out.println("current balance: "+getcashinaccount());
           return false;
       }
       else{
           decreaseCash(cashtowithdraw);
           System.out.println("withdraw completed  current balance: "+getcashinaccount());
           return true;
       }
   }
   public void makeDeposit(double cashtodeposit){
       increaseCash(cashtodeposit);
       System.out.println("deposit completed  current balance: "+getcashinaccount());
   }
}
