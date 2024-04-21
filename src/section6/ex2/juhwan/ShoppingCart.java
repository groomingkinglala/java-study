package section6.ex2.juhwan;

public class ShoppingCart {
    private static final int cartLimit = 10;
    private Item[] items = new Item[cartLimit];
    private int itemCount;

    public void addItem(Item item) {
        if (isFull()) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    private boolean isFull() {
        return itemCount >= cartLimit;
    }

    public void displayItems() {
        int totalAmount = 0;
        System.out.println("장바구니 상품 출력");

        for (int idx = 0; idx < itemCount; idx++) {
            System.out.print(idx+1 + ". ");
            items[idx].dispalyItemInfo();

            totalAmount += items[idx].totalPrice();
        }
        System.out.println("전체 가격 합: " + totalAmount);
    }

}
