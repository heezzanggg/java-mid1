package enumeration.ex0;

public class DiscountService {
//    BASIC` 10% 할인 `GOLD` 20% 할인 `DIAMOND` 30% 할인
//    예) `GOLD` 유저가 10000원을 구매하면 할인 대상 금액은 2000원이다.
//    회원등급, 가격 입력하면 할인 금액 계산해주는 클래스 작성

    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " is not a valid discount grade");
        }

        return price * discountPercent / 100;
    }
}
