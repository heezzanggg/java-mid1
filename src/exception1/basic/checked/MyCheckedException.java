package exception1.basic.checked;

/**
 * 예외 클래스 만들기
 * 예외 상속 받아서 만들기
 * Exception 상속받은 예외는 '체크예외'가 됨
 * 체크예외의 장,단점
 * 장점 : 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해 문제를 잡아주는 훌륭한 안전장치
 * 단점: 개발자가 모든 체크예외를 반드시 잡거나 던지도록 처리해야 하므로 번거로움 크게 신경쓰고 싶지 않은 예외까지 모두 챙겨야함
 * 체크예외는 잡아서 직접 처리하거나, 밖으로 던지거나 둘중 하나를 개발자가 직접 명시적으로 처리해야함. 그렇지 않으면 컴파일러 오류 발생함
 */
public class MyCheckedException extends Exception{
    public MyCheckedException(String message){
        super(message);
    }
}
