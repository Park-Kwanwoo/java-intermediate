package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {

        MyArrayListV4<String> list = new MyArrayListV4();

        // 마지막에 추가 O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("#### addLast ####");
        list.add(3, "addLast"); // O(1)
        System.out.println(list);

        System.out.println("#### addFirst ####");
        list.add(0, "addFirst"); // O(n)
        System.out.println(list);

        // 삭제
        System.out.println("#### remove ####");
        Object removed1 = list.remove(4);// remove Last O(1)
        System.out.println("removed(4)= " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);// remove First O(n)
        System.out.println("removed(0)= " + removed2);
        System.out.println(list );
    }
}
