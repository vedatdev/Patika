package entities;

public class MemberAccount {


    private int id;
    private Bill bill; //Can be List<Bill> because member can have many bills. If we use RDB it should be billId.
    private String memberName;
    private String memberSurname;
    private int balance;
    private String phoneNumber;
    private String memberCode;

    //All args constructor
    public MemberAccount(int id, Bill bill, String memberName, String memberSurname, int balance, String phoneNumber) {
        this.id = id;
        this.bill = bill;
        this.memberName = memberName;
        this.memberSurname = memberSurname;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.memberCode = id+memberName.substring(0,2);
    }
    //No args constructor
    public MemberAccount(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSurname() {
        return memberSurname;
    }

    public void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMemberCode() {
        setMemberCode();
        return memberCode;
    }

    //Member code can't be set by user so this method is private. Using just when getting.
    private void setMemberCode() {
        this.memberCode = id+memberName.substring(0,2);
    }
}
