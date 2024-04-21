package section6.ex2.minkuk;

public class ShoppingCart {
    private int MAX_ITEM_COUNT = 10;
    private Item[] items = new Item[MAX_ITEM_COUNT];
    private int itemCount = 0;

    void addItem(Item item) {
        if (isFull()) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    void displayItems() {
        System.out.println("장바구니 상품 출력");

        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            item.displayItem();
            totalPrice += item.getTotalPrice();
        }

        System.out.println("전체 가격 합: " + totalPrice);
    }

    private boolean isFull() {
        return itemCount == MAX_ITEM_COUNT;
    }
}
