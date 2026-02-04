package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        System.out.println(integerBox.get());

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        System.out.println(stringBox.get());

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        System.out.println(doubleBox.get());

    }
}
