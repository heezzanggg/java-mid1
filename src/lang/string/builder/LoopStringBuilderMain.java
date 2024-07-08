package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< 100000; i++){
            sb.append("Hello Java ");
        }
        String string = sb.toString();
        long endTime = System.currentTimeMillis();

        System.out.println("string = " + string);
        System.out.println(" time= " + (endTime - startTime) +"ms");
    }
}
