 package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String regex = ",";
        String[] fruitList = fruits.split(regex);
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
        String joinedString = String.join("->",fruitList);
        System.out.println("joinedString = " + joinedString);
    }
}
