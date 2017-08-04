import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class Exam2Test {
    Exam2.Basket basket;

    @Test
    public void case10000() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(100, basket.price);
    }

    @Test
    public void case11000() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("B");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(190, basket.price);
    }

    @Test
    public void case11100() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("B");
        basket.addItem("C");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(270, basket.price);
    }

    @Test
    public void case11110() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("B");
        basket.addItem("C");
        basket.addItem("D");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(320, basket.price);
    }

    @Test
    public void case11111() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("B");
        basket.addItem("C");
        basket.addItem("D");
        basket.addItem("E");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
            System.out.println("Price is : " + basket.price);
            basket.showBasket();
        }
        assertEquals(375, basket.price);
    }

    @Test
    public void case20000() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("A");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(200, basket.price);
    }

    @Test
    public void case21000() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("A");
        basket.addItem("B");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(290, basket.price);
    }

    @Test
    public void case21100() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("A");
        basket.addItem("B");
        basket.addItem("C");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(370, basket.price);
    }

    @Test
    public void case21110() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("A");
        basket.addItem("B");
        basket.addItem("C");
        basket.addItem("D");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(420, basket.price);
    }

    @Test
    public void case22211() {
        basket = new Exam2.Basket();
        basket.addItem("A");
        basket.addItem("A");
        basket.addItem("B");
        basket.addItem("C");
        basket.addItem("B");
        basket.addItem("C");
        basket.addItem("D");
        basket.addItem("E");
        basket.showBasket();
        while (basket.countProduct() != 0) {
            basket.payWithDiscount(basket.countType());
        }
        assertEquals(640, basket.price);
    }
}