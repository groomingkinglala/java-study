package section12.ex2.juhwan;

import java.util.HashMap;

public class PayDomain {

    private final HashMap<String, PaySystem> payOption = new HashMap<>(){{
        put("kakao", new KakaoPay());
        put("naver", new NaverPay());

    }};

    public PaySystem getPayPlatform(String platformName) {
        PaySystem payPlatform = payOption.get(platformName);

        if (payPlatform == null) {
            payPlatform = new DefaultPaySystem();
        }

        return payPlatform;
    }

}
