package lang.math.test;

import java.util.HashSet;
import java.util.Set;

public class LottoGeneratorMain {

    public static void main(String[] args) {

        LottoGenerator lottoGenerator = new LottoGenerator();
        for (int i = 0; i < 1000; i++) {
            int[] result = lottoGenerator.generate();
            Set<Integer> set = new HashSet<>();
            for (int j : result) {
                set.add(j);
            }
            if (set.size() != 6) {
                throw new IllegalArgumentException("로직 에러");
            }
        }
        System.out.println("SUCCESS");
    }
}
