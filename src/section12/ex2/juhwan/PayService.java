package section12.ex2.juhwan;

public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        boolean result;
        PayDomain payDomain = new PayDomain();
        PaySystem payPlatform = payDomain.getPayPlatform(option);
        result = payPlatform.pay(amount);

        showResult(result);
    }

    private void showResult(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
            return;
        }
        System.out.println("결제가 실패했습니다.");
    }


}
