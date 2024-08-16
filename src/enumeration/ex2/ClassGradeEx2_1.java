package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 1000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(ClassGrade.BASIC, price);
        System.out.println("BASIC 등급의 할인 금액: " + basic);

        int gold = discountService.discount(ClassGrade.GOLD, price);
        System.out.println("GOLD 등급의 할인 금액: " + gold);

        int diamond = discountService.discount(ClassGrade.DIAMOND, price);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

//        ClassGrade newClassGrade = new ClassGrade();
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println("result = " + result);

    }
}
