package de.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountServiceTest {

    @Test
    public void testApplyDiscountValid() {
        DiscountService service = new DiscountService();
        assertEquals(95, service.applyDiscount(100)); // korrekt
    }

    @Test
    public void testApplyDiscountTooLow() {
        DiscountService service = new DiscountService();
        assertEquals(90, service.applyDiscount(90)); // falsch: sollte 90 bleiben
    }
}
