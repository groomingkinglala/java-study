package section12.ex2.hyeeun;

public class DefaultPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제수단이 없습니다");
        return false;
    }
}
