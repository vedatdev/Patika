/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package services;

import entities.BillType;
import entities.Response;

import java.util.Date;

public class BaseBillService implements BillServices {


    @Override
    public Response pay(BillType billType, String memberCode, int amount,int balance) throws PaymentException {
        Response response = new Response();
        Date date = new Date();


        if (balance>=amount){
            response.setCode("0");
            response.setDate(date.toString());
        }else{
            response.setCode("1");
            response.setDate(date.toString());
            throw new PaymentException("Yetersiz Bakiye");
        }

        return response;
    }

    @Override
    public Response query(BillType billType, String memberCode) {
        return new Response("0",new Date().toString());
    }

    @Override
    public Response query(BillType billType, String memberCode, boolean inProgress) {
        return new Response("0",new Date().toString());
    }

    @Override
    public Response cancelPay(BillType billType, String memberCode,int amount,int balance) {
        return new Response("0",new Date().toString());
    }
}
