package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            if (count == 0) {
                lottoNumbers[0] = random.nextInt(45) + 1;
                count++;
            } else {
                int lottoNum = random.nextInt(45) + 1;
                if (isUnique(lottoNum)) {
                    lottoNumbers[count] = lottoNum;
                    count++;
                }
            }
        }
        
        return lottoNumbers;
    }

    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number) {

        for (int j = 0; j < count; j++) {
            if (lottoNumbers[j] == number) {
                return false;
            }
        }

        return true;
    }
}
