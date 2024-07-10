package exception.ex0.basic.checked;

public class Client {
    //throws 발생시킨 예외를 메서드 밖으로 던질 때 사용
    public void call() throws MyCheckedException {
        //새로운 예외 발생 throw 사용
        throw new MyCheckedException("ex");
    }
}
