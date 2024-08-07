package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.BASIC, price);
        System.out.println("BASIC 등급의 할인 금액: " + basic);

        int gold = discountService.discount(StringGrade.GOLD, price);
        System.out.println("GOLD 등급의 할인 금액: " + gold);

        int diamond = discountService.discount(StringGrade.DIAMOND, price);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
