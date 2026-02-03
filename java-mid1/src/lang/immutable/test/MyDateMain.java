package lang.immutable.test;

public class MyDateMain {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2026, 1, 23);
        MyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2027 -> date1");
        date1.setYear(2027);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
