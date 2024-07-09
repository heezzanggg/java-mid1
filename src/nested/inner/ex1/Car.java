package nested.inner.ex1;

public class Car {

    private String model1;
    private int chargeLevel;
    private Engine engine;

    public Car(String model1, int chargeLevel) {
        System.out.println("Car.Car");
        this.model1 = model1;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드
    public String getModel1() {
        return model1;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model1 + " 시작 완료");
    }


}
