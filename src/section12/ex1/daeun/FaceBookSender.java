package section12.ex1.daeun;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 발송합니다: %s".formatted(message));
    }
}
