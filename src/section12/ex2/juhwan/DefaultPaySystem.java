package section12.ex2.juhwan;

public class DefaultPaySystem extends PaySystem {


    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
