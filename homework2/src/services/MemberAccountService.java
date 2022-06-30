package services;

import entities.MemberAccount;

public class MemberAccountService {

    //to create a row of MemberAccount
    public void create(MemberAccount memberAccount){
        System.out.println(memberAccount.getMemberCode() + " kayıt eklendi");
    }

    //Normally this method returns list of membeAccounts but this is just a example of using methods.
    public void getAll(){
        System.out.println("Bütün hesapları listelendi");
    }

    //Normally this method can take id or class that will update as a parameter and returns boolean, id or class that will update.
    public void update(MemberAccount memberAccount){
        System.out.println(memberAccount.getMemberCode() + " kayıt güncellendi");
    }

    //to delete row of memberAccount that have this id
    public void delete(int id){
        System.out.println(id + " id numaralı kayıt silindi.");
    }
}
