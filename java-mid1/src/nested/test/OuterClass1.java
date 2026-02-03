package nested.test;

public class OuterClass1 {

    // Q. 정적 중첩 클래스(NestedClass) 및 hello 메서드를 구현
    static class NestedClass {

        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
