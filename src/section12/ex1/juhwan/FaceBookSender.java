package section12.ex1.juhwan;

public class FaceBookSender implements Sender{

    private static final String platform = "페이스북";

    @Override
    public void sendMessage(String message) {
        System.out.println(platform + "에 발송합니다: " + message);
    }
}
