package section1.ex3.juhwan;

public class Solution {
    public static void main(String[] args) {

        ProductOrder tofu = new ProductOrder("두부", 2000, 2);
        ProductOrder kimchi = new ProductOrder("김치", 5000, 1);
        ProductOrder coke = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] products = {tofu, kimchi, coke};

        int totalAmount = 0;
        for (ProductOrder product: products) {
            product.showProductInfo();
            totalAmount += product.totalAmount();
        }
        System.out.println("총 결제 금액: "+ totalAmount);
    }
}
