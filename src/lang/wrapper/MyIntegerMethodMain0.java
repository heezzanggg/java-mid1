package lang.wrapper;


public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);

        System.out.println("i1 = " + i1); //1
        System.out.println("i2 = " + i2); //0
        System.out.println("i3 = " + i3); //-1

    }

    private static int compareTo(int value, int target) {
        //왼쪽이 작으면 -1, 두 값 같으면 0 왼쪽크면 1
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
