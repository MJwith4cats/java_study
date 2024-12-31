package poly.ex.pay2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {

        PayService payService = new PayService();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payOption = sc.nextLine();
            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
            }
            System.out.println("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();

            payService.processPay(payOption, amount);
        }
    }
}
