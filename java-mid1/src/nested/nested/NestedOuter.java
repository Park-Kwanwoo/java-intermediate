package nested.nested;

public class NestedOuter {
    
    // 정적 중첩 클래스
    // 정적 변수와 선언 위치가 같음
    // static이 붙음
    // 바깥 클래스의 인스턴스에 소속되지 않음

    // 정적 변수
    private static int outClassValue = 3;
    
    // 인스턴스 변수
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        
        // 정적 중첩 클래스의 인스턴스 변수
        private int nestedInstanceValue = 1;
        
        public void print() {

            System.out.println("nestedInstanceValue = " + nestedInstanceValue);
            
            // 바깥 클래스의 인스턴스 변수는 접근 불가
//            System.out.println("outInstanceValue = " + outInstanceValue);
            
            // 바깥 클래스의 클래스 멤버에는 접근 가능 (private도 가능)
            System.out.println("outClassValue = " + outClassValue);
        }
    }
}
