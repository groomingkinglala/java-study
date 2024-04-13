package section1.ex3.juhwan;

public class ProductOrder {
    private String productName;
    private int price;
    private int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void showProductInfo() {
        System.out.println("상품명: " + productName + ", 가격: " + price + ", 수량: " + quantity);
    }

    public int totalAmount() {
        return price * quantity;
    }




}
