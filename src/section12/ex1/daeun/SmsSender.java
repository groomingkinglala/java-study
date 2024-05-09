package section12.ex1.daeun;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다: %s".formatted(message));
    }
}