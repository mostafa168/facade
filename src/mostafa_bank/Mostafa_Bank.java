
package mostafa_bank;


public class Mostafa_Bank {

   
    public static void main(String[] args) {
       facade fac = new facade(123456789,12345);
       
       fac.withdrawCash(90);
       fac.depositCash(120);
       fac.withdrawCash(100);
       fac.depositCash(90);
       fac.withdrawCash(200);
    }
    
}
