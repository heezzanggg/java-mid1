package nested.test;

public class OuterClass3 {
    //지역클래스 LocalClass 구현, hello() 메서드 호출
    public void myMethod() {
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }
}
