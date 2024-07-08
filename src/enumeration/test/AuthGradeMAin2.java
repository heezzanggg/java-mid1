package enumeration.test;

import java.util.Scanner;

public class AuthGradeMAin2 {
    public static void main(String[] args) {
        //인증 등급을 입력 바다서 앞서 만든 AuthGrade 열거형으로 변환
        //인증 등급에 따라 접근할 수 있는 화면 다름
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());

        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
        System.out.println("== 메뉴 목록==");

        if (authGrade.getLevel() >= 1) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() >= 2) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() >= 3) {
            System.out.println("- 관리자 화면");
        }
    }
}
