package nested.test;

public class OuterClass3 {
    public void myMethod() {
        // Q. 지역 클래스 LocalClass 및 hello() 메서드 구현

        class LocalClass {

            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
