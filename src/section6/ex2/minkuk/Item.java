package section6.ex2.minkuk;

public class Item {
    private String name;
    private int price;
    private int quantity;

    Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    int getTotalPrice() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println("상품명: " + name + ", 합계: " + getTotalPrice());
    }
}
