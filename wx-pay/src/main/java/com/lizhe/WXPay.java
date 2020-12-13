package com.lizhe;

/**
 * @Auther: lizhe
 * @Date: 2020/12/13 - 12 - 13 - 14:45
 * @Description:PACKAGE_NAME
 * @version: 1.0
 */
public class WXPay implements PayService  {
    @Override
    public void doPay() {
        System.out.println("WX pay...........");
    }
}
