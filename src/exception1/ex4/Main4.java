package exception1.ex4;

import exception1.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
        }

    }

    //공통 예외 처리
    public static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);

        //필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getMessage());
        }
    }
}
