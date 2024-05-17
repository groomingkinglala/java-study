package section12.ex2.hyeeun;

public class SamsungPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("삼성페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
