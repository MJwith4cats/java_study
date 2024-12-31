package poly.ex.pay2;

import poly.ex.pay1.Pay;

public class NaverPay implements poly.ex.pay1.Pay {
    private Pay pay;

    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
