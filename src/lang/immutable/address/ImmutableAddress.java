package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

//    public void setValue(String value) {
//        this.value = value;
//    } //=> value final 이므로 한번 값 정해지면 변경 불가

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
