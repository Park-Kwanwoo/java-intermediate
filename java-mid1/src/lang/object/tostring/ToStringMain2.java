package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("modelY");
        Dog dog1 = new Dog("퍼피", 2);
        Dog dog2 = new Dog("파피", 5);

        System.out.println("1. 단순 toString() 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString() 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String carRefValue = Integer.toHexString(System.identityHashCode(car));
        String dog1RefValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("carRefValue = " + carRefValue);
        System.out.println("dog1RefValue = " + dog1RefValue);;
    }
}
