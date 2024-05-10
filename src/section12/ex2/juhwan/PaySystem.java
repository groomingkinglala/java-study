package section12.ex2.juhwan;

public class PaySystem {

    protected String platform;

    public boolean pay(int amount) {
        System.out.println(platform + " 시스템과 연결 합니다.");
        System.out.println(amount + "원 결제를 시도합니다");
        return true;
    }

}
