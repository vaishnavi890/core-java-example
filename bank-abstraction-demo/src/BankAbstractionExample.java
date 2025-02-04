import com.vaishnavi.practice.abstraction.service.SBIBankService;

public class BankAbstractionExample {
    public static void main(String[] args){
            SBIBankService sbiBankService = new SBIBankService();
            sbiBankService.openAccount();
            sbiBankService.disburseLoan();
        }
    }
