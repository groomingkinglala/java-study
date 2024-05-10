package section12.ex3.juhwan;

import java.util.Scanner;
import section12.ex2.juhwan.PayService;

public class PayMain2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        System.out.print("결제 수단을 입력하세요: ");
        String option = scanner.nextLine();

        System.out.print("결제 금액을 입력하세요: ");
        int amount = scanner.nextInt();
        payService.processPay(option, amount);

    }

}
