package poly.ex.pay2;

import poly.ex.pay1.DefaultPay;
import poly.ex.pay1.KakaoPay;
import poly.ex.pay1.NaverPay;
import poly.ex.pay1.Pay;

public abstract class PayStore {

    //결제 수단 추가시 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
