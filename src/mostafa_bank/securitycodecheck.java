
package mostafa_bank;


public class securitycodecheck {
    private final int security_code=12345;
    
     public int getSecurityCode(){
         return security_code;
     } 
     public boolean isCodeCorrect(int codetocheck){
         return codetocheck==getSecurityCode();
     }
}
