package section12.ex1.juhwan;

public class EmailSender implements Sender{
    private static final String platform = "메일";

    @Override
    public void sendMessage(String message) {
        System.out.println(platform + "을 발송합니다: " + message);
    }
}
