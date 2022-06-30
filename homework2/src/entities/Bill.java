package entities;

import java.lang.reflect.Member;
import java.util.Date;

public class Bill {

    private int id;
    private MemberAccount memberAccount; //Bill can have only one MemberAccount. If we use RDB it should be memberAccountId.
    private int amount;
    private Date processDate;
    private BillType billType;

    //All args constructor
    public Bill(int id, MemberAccount memberAccount,int amount, Date processDate, BillType billType) {
        this.id = id;
        this.memberAccount = memberAccount;
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
    }
    //No args constructor
    public Bill() {
    }

    public MemberAccount getMember() {
        return memberAccount;
    }

    public void setMemberAccount(MemberAccount memberAccount) {
        this.memberAccount = memberAccount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
