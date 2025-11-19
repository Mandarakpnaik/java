package com.xworkz.things.external;

import com.xworkz.things.internal.Things;

public class ThingsRunner {
    public static void main(String[] args) {
        Things product = new Things();
//        product.checkProduct("Soap");
        product.checkProduct("body soap");
//        product.checkExpire(2025);
        product.checkExpire(2045);
//        product.checkFound("ToothPaste");
        product.checkFound("toothpaste");
//        product.checkStock(99);
        product.checkStock(220);
//        product.checkPrice(199);
        product.checkPrice(300);
    }
}
