package section12.ex1.jinyong;

public class FacebookSender implements Sender{
    
    @Override
    public void sendMessage(String message){
        System.err.println("Facebook 메세지를 발송합니다 : " + message);
    }
}
