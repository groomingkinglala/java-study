package section12.ex1.jinyong;

public class EmailSender implements Sender {
    
    @Override
    public void sendMessage(String message){
        System.err.println("메일을 발송합니다 : " + message);
    }
}
