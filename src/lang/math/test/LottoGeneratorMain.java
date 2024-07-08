package lang.math.test;

import java.util.Random;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int[] lottoNumbers = new int[6];

        while (count < 6) {
            int num = random.nextInt(45) + 1;
            //lottoNumbers 배열에 num 있는지 확인
            if (num == lottoNumbers[count]) {
                //num 있으면 count 증가x
                return;
            } else {
                lottoNumbers[count] = num;
                //num 없으면 배열에 추가하고 count 증가
                count++;
            }
        }

        System.out.println("로또 번호:");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(" " + lottoNumber);
        }

    }
}
