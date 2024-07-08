package lang.object;

public class Child extends Parent{

    public void childMethod(){
        System.out.println("Child.childMethod");
    }

    public Child() {
        System.out.println("Child.Child construct");
    }
}
