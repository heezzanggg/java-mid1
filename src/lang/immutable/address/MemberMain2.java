package lang.immutable.address;

public class MemberMain2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소 변경
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
