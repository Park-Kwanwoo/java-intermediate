package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {

        // 타입에 제한이 없어 모든 참조형이 들어갈 수 있다
        AnimalHospitalV2<Dog> dogHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<String> stringHospital = new AnimalHospitalV2<>();
    }
}
