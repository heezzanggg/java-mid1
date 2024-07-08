package enumeration.ex2;


public class DiscountService {
    //    BASIC` 10% 할인 `GOLD` 20% 할인 `DIAMOND` 30% 할인
//    예) `GOLD` 유저가 10000원을 구매하면 할인 대상 금액은 2000원이다.
//    회원등급, 가격 입력하면 할인 금액 계산해주는 클래스 작성

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
