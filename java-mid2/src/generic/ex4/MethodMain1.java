package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {

        Integer i = 10;
        String s = "String";
        System.out.println("======= 기본 Object 파라미터 메소드 =======");
        Object integerObject = GenericMethod.objMethod(i);
        Object stringObject = GenericMethod.objMethod(s);
        System.out.println();


        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("======= 제네릭 메소드 (명시적 타입 인자 전달) =======");
        System.out.print("GenericMethod.<Integer>genericMethod() => ");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.print("GenericMethod.<Double>genericMethod() => ");
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        System.out.print("GenericMethod.<Double>genericMethod() => ");
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        System.out.println();

        // 타입 추론, 타입 인자 생략
        System.out.println("======= 제네릭 메소드 (타입 추론) =======");
        System.out.print("GenericMethod.genericMethod() => ");
        Integer result2 = GenericMethod.genericMethod(i);
        System.out.print("GenericMethod.genericMethod() => ");
        Integer integerValue2 = GenericMethod.numberMethod(10);
        System.out.print("GenericMethod.genericMethod() => ");
        Double doubleValue2 = GenericMethod.numberMethod(20.0);

    }
}
