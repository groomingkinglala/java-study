package section12.ex3.daeun;

import section12.ex2.daeun.PayService;
import java.util.Scanner;

public class PayMain2 {
    static String option;
    static int amount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();
        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            option = sc.nextLine();
            if (option.equals("exit")) {
                System.out.print("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            amount = Integer.parseInt(sc.nextLine());
            payService.processPay(option, amount);
        }
    }
}
