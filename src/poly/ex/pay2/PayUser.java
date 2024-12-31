package poly.ex.pay2;

import poly.ex.pay1.Pay;

import java.util.Scanner;

public class PayUser {
    private Pay pay;
    private String payOption;
    private int amount;


    public void setPay() {
        System.out.print("결제 수단을 입력하세요 : ");
        System.out.print("결제 금액을 입력하세요 : ");
    }
}
