package enumeration.test2;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        //grade=GUEST, level=1, 설명=손님

        for (AuthGrade value : AuthGrade.values()) {
            System.out.println("grade="+value+", level="+value.getLevel()+", 설명="+value.getDescription());
        }


    }
}
