package exception1.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {

//        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
