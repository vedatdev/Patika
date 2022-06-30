/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package services;

import entities.BillType;
import entities.MemberAccount;
import entities.Response;

public class BillClient {

    private final BaseBillService baseBillService;

    public BillClient(BaseBillService baseBillService){
        this.baseBillService = baseBillService;
    }


    public Response pay(MemberAccount memberAccount) throws PaymentException {
        return baseBillService.pay(memberAccount.getBill().getBillType(),memberAccount.getMemberCode(),memberAccount.getBill().getAmount(),memberAccount.getBalance());
    }

    public Response query(BillType billType,String memberCode){
        return baseBillService.query(billType,memberCode);
    }

    public Response CancelPay(MemberAccount memberAccount){
        return baseBillService.cancelPay(memberAccount.getBill().getBillType(),memberAccount.getMemberCode(),memberAccount.getBill().getAmount(),memberAccount.getBalance());
    }


}
