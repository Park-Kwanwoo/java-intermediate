package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // enum switch 가능
        switch (grade) {
            case BASIC:
                discountPercent = 10;
                break;
            case GOLD:
                discountPercent = 20;
                break;
            case DIAMOND:
                discountPercent = 30;
                break;
            default:
                System.out.println("할인 X");
        }
        return price * discountPercent / 100;
    }
}
