package enumeration.ex2;

// 타입 안전 열거형 패턴
public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade() {

    }
}
