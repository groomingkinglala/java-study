package section12.ex2.daeun;

public class PayStore {
    public static Pay findPay(String option) {
        switch (option) {
            case "kakao":
                return new KakaoPay();
            case "naver":
                return new NaverPay();
            default:
                return new BadPay();
        }
    }
}
