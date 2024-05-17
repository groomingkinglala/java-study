package section12.ex1.hyeeun;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String string) {
        System.out.println("메일을 발송합니다: " + string);
    }
}
