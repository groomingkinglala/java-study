package section9.ex1.juhwan;

public class Solution {

    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000,"seo");
        Movie movie = new Movie("영화1", 18000,"감독1", "배우1");

        Item[] products = {book, album, movie};

        int sum = 0;
        for (Item product : products) {
            product.print();
            sum += product.getPrice();
        }

        System.out.println("상품 가격의 합: " + sum);
    }
}
