package section9.ex1.jinyong;

public class Album extends Item{
    private String artist;

    public Album(String name, int price, String artist){
        this.name = name;
        this.price = price;
        this.artist = artist;
    }

    public void print(){
        System.out.println("이름 : " + name + ", 가격: " + price + ", 아티스트: " + artist);
    }

    @Override
    public int getPrice(){
        return price;
    }
}
