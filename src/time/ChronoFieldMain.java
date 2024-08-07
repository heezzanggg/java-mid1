package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        // ChronoField : 날짜 및 시간을 나타내는데 사용되는 열거형
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range() );
        }

        System.out.println("MONTH_OF_YEAR.range() = "+ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() = "+ChronoField.DAY_OF_MONTH.range());
    }
}
