package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {

        Integer newInteger = new Integer(10);
        // -128 ~ 127까지의 자주 사용되는 값들이 캐싱처리 되어 있음
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        long longValue = longObj.longValue();
        double doubleValue = doubleObj.doubleValue();

        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        // 비교
        System.out.println(newInteger == integerObj);
        System.out.println(integerObj.equals(newInteger));
    }
}
