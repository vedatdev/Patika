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

public interface BillServices {

    Response pay(BillType billType, String memberCode,int amount,int balance) throws PaymentException;

    Response query(BillType billType, String memberCode);

    Response query(BillType billType, String memberCode,boolean inProgress);

    Response cancelPay(BillType billType, String memberCode,int amount,int balance);

}
