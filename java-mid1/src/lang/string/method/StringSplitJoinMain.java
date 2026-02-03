package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {

        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);

        // 문자열 배열 변경
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
