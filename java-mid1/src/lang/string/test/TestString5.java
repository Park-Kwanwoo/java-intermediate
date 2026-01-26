package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {

        String str = "hello.txt";
        String ext = ".txt";

        // 코드 작성
        String fileName = str.substring(0, 5);
        String extName = str.substring(str.indexOf(ext));

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
