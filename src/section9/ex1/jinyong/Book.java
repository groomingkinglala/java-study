package section9.ex1.jinyong;

public class Book extends Item {
    private String author;
    private String isbn;
    public Book(String name, int price, String author, String isbn){
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }


    public void print(){
        System.out.println("이름 : " + name + ", 가격: " + price + ", 저자: " + author + " isbn: " + isbn);
    }
    @Override
    public int getPrice(){
        return price;
    }
}
