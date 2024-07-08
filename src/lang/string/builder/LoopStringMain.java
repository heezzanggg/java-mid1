package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();

        String result1 = "";
        for (int i = 0; i < 10000; i++) {
            result1 += "Hello Java";
        }

        long endTime1 = System.currentTimeMillis();

        System.out.println("result1 = " + result1);
        System.out.println("time = " + (endTime1 - startTime1) + "ms");

        long startTime2 = System.currentTimeMillis();
        String result2 = "";
        for(int i =0; i<10000; i++){
            result2 = new StringBuilder().append(result2).append("Hello Java").toString();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("result2 = " + result2);
        System.out.println("time = " + (endTime2 - startTime2) + "ms");

    }
}
