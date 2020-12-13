package com.lizhe;

/**
 * @Auther: lizhe
 * @Date: 2020/12/13 - 12 - 13 - 14:49
 * @Description:com.lizhe
 * @version: 1.0
 */
public class AliPay implements PayService {
    @Override
    public void doPay() {
        System.out.println("ali pay..........");
    }
}
