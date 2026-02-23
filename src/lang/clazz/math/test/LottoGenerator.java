package lang.clazz.math.test;

import java.util.Random;

public class LottoGenerator {
    private int[] lottoNumbers;
    private Random random = new Random();
    private int count;

    public int[] getLottoNumbers() {
        lottoNumbers = new int[6];

        System.out.print("로또 번호 : ");

        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if(isUnique(number)) {
                    lottoNumbers[count++] = number;
                    System.out.print(number + " ");
            }
        }
        return lottoNumbers;
    }

    public boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (number == lottoNumbers[i]) {
                return false;
            }
        }
        return true;
    }
}
