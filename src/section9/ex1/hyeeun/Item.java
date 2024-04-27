package section9.ex1.hyeeun;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }

    public int getPrice() {
        return price;
    }

    //    이름:JAVA, 가격:10000
//            - 저자:han, isbn:12345 이름:앨범1, 가격:15000
//            - 아티스트:seo
}
