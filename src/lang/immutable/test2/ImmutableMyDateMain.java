package lang.immutable.test2;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1 ");
        date1 = date1.withYear(2025);
        /**
         *  withXxx 수정사항을 포함하는 객체의 새 인스턴스 반환함!! 따라서 반환값을 꼭 받아야함
         * date1.withYear(2025); 이렇게만 하면 안됨
         * 꼭!!! date1 = date1.withYear(2025);
         */

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }

}
