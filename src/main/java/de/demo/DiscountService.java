package de.demo;

public class DiscountService {
    public int applyDiscount(int price) {
        if (price >= 100) {
            return price - 5;
        } else {
            return price;
        }
    }
}
