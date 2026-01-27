package nested.local;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 지역 변수
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        Printer printer = new LocalPrinter();

        // localVar의 값을 변경하는 경우
        // localVar = 10; // 컴파일 오류
        // paramVar = 20; // 컴파일 오류
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV4 = new LocalOuterV4();
        Printer printer = localOuterV4.process(2);
        printer.print();
    }
}
