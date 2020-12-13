package com.lizhe;
import java.util.ServiceLoader;

/**
 * @Auther: lizhe
 * @Date: 2020/12/13 - 12 - 13 - 14:43
 * @Description:PACKAGE_NAME
 * @version: 1.0
 */
public class TestPay {
    public static void main(String[] args) {
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
//        Iterator<PayService> iterator = load.iterator();
//        while (iterator.hasNext()){
//            PayService next = iterator.next();
//           next.doPay();
//        }
        for (PayService payService : load) {
            payService.doPay();
        }
    }
}
