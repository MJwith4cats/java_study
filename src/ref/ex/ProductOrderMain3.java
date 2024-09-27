package ref.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOrderMain3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력할 주문의 개수를 입력하세요");
        int n = Integer.parseInt(br.readLine());
        ProductOrder[] productOrders = new ProductOrder[n];
        for(int i=0; i<n; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = br.readLine();
            System.out.print("가격 : ");
            int price = Integer.parseInt(br.readLine());
            System.out.print("수량 : ");
            int quantity = Integer.parseInt(br.readLine());

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);

        System.out.println("총 결제 금액 : "+getTotalAmount(productOrders));

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : "+order.price+", 수량 : "+order.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
