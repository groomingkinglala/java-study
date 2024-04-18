package section1.ex3.jinyong;

public class Solution {
    public static void main(String[] args){
        ProductOrder[] orders = new ProductOrder[3];
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

        int totalPrice = 0;
        for(ProductOrder index: orders) {
            System.out.println("상품: " + index.productName + ", 가격: " + index.price + ", 수량: "+ index.quantity);
            totalPrice += index.price * index.quantity;
        }
        
        System.out.println("총 결제 금액 : " + totalPrice);
    }
}
