package section12.ex1.jinyong;

public class SmsSender implements Sender{
    
    @Override
    public void sendMessage(String message){
        System.err.println("SMS을 발송합니다 : " + message);
    }
}
