package exception1.basic.checked;

/**
 * throw vs throws
 * throw 예외 : 새로운 예외 발생시킬 수 있음. 예외도 객체이므로 new로 객체 생성하고 예외 발생 시켜야 함
 * throws : 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드
 */
public class Client {
    public void call() throws MyCheckedException {

        //예외 발생
        throw new MyCheckedException("ex");
    }
}
