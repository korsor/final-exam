import java.util.Arrays;

/**
 * Created by tapakorn.w on 8/4/2017.
 */
public class Exam2 {

    public static class Basket {
        public int[] stock = {0, 0, 0, 0, 0};
        private int[] dis = {0, 0, 5, 10, 20, 25};
        public int price = 0;

        public void addItem(String product) {
            if (product == "A") {
                stock[0] += 1;
            }
            if (product == "B") {
                stock[1] += 1;
            }
            if (product == "C") {
                stock[2] += 1;
            }
            if (product == "D") {
                stock[3] += 1;
            }
            if (product == "E") {
                stock[4] += 1;
            }
        }

        public void showBasket() {
            System.out.println("========================\nOrder in Basket");
            for (int i = 0; i < 5; i++) {
                System.out.println(Character.toString((char) (i + 65)) + " : " + stock[i]);
            }
        }

        public int countType() {
            int type = 0;
            for (int i = 0; i < 5; i++) {
                if (stock[i] > 0) type += 1;
            }
            if (type == 5) {
                type = checkSolution();
            }
            return type;
        }

        public void payWithDiscount(int countType) {
            Arrays.sort(stock);
            for (int i = 5 - countType; i < 5; i++) {
                if (stock[i] > 0) {
                    stock[i] -= 1;
                }
            }
            price += 100 * countType * (100 - dis[countType]) / 100.0;
        }

        public int countProduct() {
            int product = 0;
            for (int i = 0; i < 5; i++) {
                product += stock[i];
            }
            return product;
        }

        public int checkSolution() {
            Exam2.Basket basketTemp1 = new Exam2.Basket();
            Exam2.Basket basketTemp2 = new Exam2.Basket();
            basketTemp1.stock = stock.clone();
            basketTemp2.stock = stock.clone();
            while (basketTemp1.countProduct() != 0) {
                basketTemp1.payWithDiscount(4);
            }
            while (basketTemp2.countProduct() != 0) {
                basketTemp2.payWithDiscount(5);
            }
            if (basketTemp1.price < basketTemp2.price) {
                return 4;
            } else return 5;
        }
    }
}
