package section9.ex1.jinyong;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor){
        this.name = name;
        this.price = price;
        this.director = director;
        this.actor = actor;
    }

    public void print(){
        System.out.println("이름 : " + name + ", 가격: " + price + ", 감독: " + director + " 배우: " + actor);
    }
    @Override
    public int getPrice(){
        return price;
    }
}
