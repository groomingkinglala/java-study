package section12.ex2.juhwan;

import java.util.HashMap;

public class PayDomain {

    private HashMap<String, PaySystem> payOption = new HashMap<String, PaySystem>(){{
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
