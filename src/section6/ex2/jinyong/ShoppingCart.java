package section6.ex2.jinyong;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }


    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            System.out.println("상품명 : " + items[i].getName() + "합계 : " + items[i].getPrice() * items[i].getQuantity());
            totalPrice += items[i].getPrice() * items[i].getQuantity();
        }
        System.out.println("상품 합계 : " + totalPrice);
    }

}
