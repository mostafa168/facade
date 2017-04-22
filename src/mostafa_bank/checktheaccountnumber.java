
package mostafa_bank;


public class checktheaccountnumber {
     private final int account_number=123456789;
     
     public int getAccountNo(){
         return account_number;
     } 
     public boolean accountActive(int accountnotocheck){
         return accountnotocheck==getAccountNo();
     }
}
