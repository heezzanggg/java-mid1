package enumeration.ref1;

public class ClassGrade {
    //상수를 정의할 때 각각의 등급에 따른 할인율 정해짐

    public static ClassGrade BASIC = new ClassGrade(10);
    public static ClassGrade GOLD = new ClassGrade(20);
    public static ClassGrade DIAMOND = new ClassGrade(30);

    int discountPercent;

    private ClassGrade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
