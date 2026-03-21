package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {

        Box<Object> box = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("냐옹이", 200));

        System.out.println("======= <T> printGenericV1 (Box<T> box) =======");
        WildcardEx.printGenericV1(dogBox);
        System.out.println();
        System.out.println("======= printWildcardV1 (Box<?> box) =======");
        WildcardEx.printWildcardV1(dogBox);
        System.out.println();
        System.out.println("======= <T extends Animal> printGenericV2 (Box<T> box) =======");
        WildcardEx.printGenericV2(dogBox);
        System.out.println();
        System.out.println("======= printWildcardV1 (Box<? extends Animal> box) =======");
        WildcardEx.printWildcardV2(dogBox);
        System.out.println();
        System.out.println("======= printAndReturn (Box<T> box) =======");
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);
        System.out.println();
        // Wildcard의 한계, 구체적인 타입 반환이 불가능
        System.out.println("======= printAndReturnWildcard (Box<? extends Animal> box) =======");
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
