package nested.nested.ex1;

//NetworkMessage : Network 객체 안에서만 사용될 객체임
public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }
    
    public void print(){
        System.out.println(content);
    }
}
