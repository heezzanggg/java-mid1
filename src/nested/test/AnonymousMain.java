package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        //Hello의 익명클래스 생성하고  hello() 호출

        Hello hello = new Hello(){
          @Override
          public void hello(){
              System.out.println("Hello.hello");
          }
        };
    }


}
