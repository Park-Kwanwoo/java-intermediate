package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        for (AuthGrade authGrade : AuthGrade.values()) {
            printUserInfo(authGrade);
        }
    }

    private static void printUserInfo(AuthGrade grade) {
        System.out.println("grade=" + grade.name() + ", level=" +  grade.getLevel() + ", 설명=" + grade.getDescription());
    }
}
