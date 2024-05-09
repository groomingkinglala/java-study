package section12.ex1.daeun;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다: %s".formatted(message));
    }
}
