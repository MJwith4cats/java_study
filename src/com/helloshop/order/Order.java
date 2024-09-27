package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;


public class Order {
    User user;
    Product product;

    //생성자에 public이 붙어있다. public이 붙어 있어야 다른 패키지에서 생성자를 호출할 수 있다.
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
