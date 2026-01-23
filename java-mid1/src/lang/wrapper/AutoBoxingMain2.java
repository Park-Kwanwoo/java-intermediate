package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {

        // Primitive -> Wrapper (Auto)
        int value = 7;
        Integer boxedValue = value;

        // Wrapper -> Primitive (Auto)
        int unBoxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);
    }
}
