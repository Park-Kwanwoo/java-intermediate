package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {

        // 불변 객체
        String str = "hello";

        // 생성 이후 절대로 내부 문자열 값을 변경할 수 없음
        str.concat("java");
        System.out.println("str = " + str);
    }
}
