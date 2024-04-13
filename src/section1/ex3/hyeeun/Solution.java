package section1.ex3.hyeeun;

public class Solution {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder("두부", 2000, 2);
        orders[0] = productOrder1;


        ProductOrder productOrder2 = new ProductOrder("김치", 5000, 1);
        orders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder("콜라", 1500, 2);
        orders[2] = productOrder3;

        int totalAmount = 0;

        for (ProductOrder productOrder : orders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " +productOrder.price + ", 수량: " + productOrder.quantity);
            totalAmount += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}

// 상품명: 두부, 가격: 2000, 수량: 2 상품명: 김치, 가격: 5000, 수량: 1 상품명: 콜라, 가격: 1500, 수량: 2 총 결제 금액: 12000
