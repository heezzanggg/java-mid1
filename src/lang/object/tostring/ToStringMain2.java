package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("멍1", 2);
        Dog dog2 = new Dog("멍2", 5);

        System.out.println("단순 toString 호춣");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("----------------------------");
        System.out.println("println 내부에서 toString 호출");
        System.out.println("car = " + car);
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);

        System.out.println("----------------------------");
        System.out.println("Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);


        String refValue = Integer.toHexString(System.identityHashCode(car));
        System.out.println("refValue = " + refValue);

    }
}
