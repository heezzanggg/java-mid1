package nested.test;

public class OuterClass1 {
    //NestedClass 구현하고 hello() 메서드 만들기
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
