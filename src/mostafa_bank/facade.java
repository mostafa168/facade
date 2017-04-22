
package mostafa_bank;


public class facade {
    private int account_number;
    private int security_code;
    
    welcome w;
    checktheaccountnumber acc;
    securitycodecheck sc;
    fundscheck f;
    
    public facade(int acct_no, int sec_code){
        account_number=acct_no;
        security_code=sec_code;
        w=new welcome();
        acc=new checktheaccountnumber();
        sc=new  securitycodecheck();
        f=new fundscheck(); 
    }
    public int getAccountNo(){
         return account_number;
     } 
    public int getSecurityCode(){
         return security_code;
     } 
    public void withdrawCash(double cashtowithdraw){
        if(f.haveenoughmoney(cashtowithdraw) && acc.accountActive(account_number)
                && sc.isCodeCorrect(security_code)){
            System.out.println("transaction completed\n");
        } else {
            System.out.println("transaction failed\n");
        }
    }
    public void depositCash(double cashtodeposit){
        if(acc.accountActive(account_number) && sc.isCodeCorrect(security_code)){
            f.makeDeposit(cashtodeposit);
            System.out.println("transaction completed\n");
        } else {
            System.out.println("transaction failed\n");
        }
}
}