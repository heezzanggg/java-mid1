package nested.inner.ex1;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Model Y", 100);
        myCar.start();

        System.out.println("----");
        Engine engine = new Engine(new Car("eee", 1000));
    }
}
