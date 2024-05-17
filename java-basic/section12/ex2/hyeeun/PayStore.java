package section12.ex2.hyeeun;

public abstract class PayStore {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("samsung")) {
            return new SamsungPay();
        } else {
            return new DefaultPay();
        }
    }

   /* public static Pay findPay(String option) {
        return switch (option) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "samsung" -> new SamsungPay();
            default -> new DefaultPay();
        };
    }*/
}
