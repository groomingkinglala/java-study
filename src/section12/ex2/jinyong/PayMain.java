package section12.ex2.jinyong;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("결제 수단을 입력하세요. quit을 입력하면 프로그램이 종료됩니다.");
            String payOption = scanner.nextLine();
            if(payOption.equals("quit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.println("결제 금액을 입력하세요.");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }
    }
}
