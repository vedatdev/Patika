import entities.Bill;
import entities.BillType;
import entities.MemberAccount;
import entities.Response;
import services.BillClient;
import services.BillService;
import services.PaymentException;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws PaymentException {

        Bill bill = new Bill();
        bill.setId(1);
        bill.setBillType(BillType.Phone);
        bill.setAmount(30);
        bill.setProcessDate(new Date());

        MemberAccount memberAccount = new MemberAccount();
        memberAccount.setMemberName("Gizem");
        memberAccount.setMemberName("Atalay");
        memberAccount.setId(1);
        memberAccount.setPhoneNumber("5555555555");
        memberAccount.setBalance(20);

        memberAccount.setBill(bill);
        bill.setMemberAccount(memberAccount);

        BillClient billClient = new BillClient(new BillService());

        Response response = new Response();
        try {
            response = billClient.pay(memberAccount);
        } catch (PaymentException e) {
            response.setCode("1");
            response.setDate(new Date().toString());
        }

        if (response.getCode().equals("0")){
            System.out.println("İşlem Başarılı. İşlem Tarihi : " + response.getDate());
        }else
            System.out.println("İşlem Başarısız. İşlem Tarihi :" + response.getDate());


    }
}