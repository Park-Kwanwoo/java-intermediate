package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {

        // 숫자, 래퍼 객체 반환
        Integer i1 = Integer.valueOf(10);
        // 문자열, 래퍼 객체 반환
        Integer i2 = Integer.valueOf("10");
        // 문자열 전용, 기본형 반환
        int intValue = Integer.parseInt("10");

        // 비교
        System.out.println("result = " + i1.compareTo(i2));

        // 산술 연산
        System.out.println("sum = " + Integer.sum(10, 20));
        System.out.println("min = " + Integer.min(10, 20));
        System.out.println("max = " + Integer.max(10, 20));

    }
}
