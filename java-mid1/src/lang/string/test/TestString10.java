package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {

        String fruitString = "apple,banana,mango";

        // 코드 작성
        String[] fruits = fruitString.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String joinedString = String.join("->", fruits);
        System.out.println("joinedString = " + joinedString);
    }
}
