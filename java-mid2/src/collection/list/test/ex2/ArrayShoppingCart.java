package collection.list.test.ex2;

public class ArrayShoppingCart {

    private final Item[] items = new Item[10];
    private int itemCnt = 0;

    public void addItem(Item item) {
        if (itemCnt >= 10) {
            throw new IllegalArgumentException("장바구니가 가득 찼습니다.");
        }
        items[itemCnt++] = item;
    }

    public void displayItems() {

        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCnt; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }

        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCnt; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }
}
