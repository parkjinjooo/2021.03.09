package day0309;
// 로또 게임 3번

// 1-45의 랜덤한 숫자를 크기가 6인 배열에 넣어주고 출력해주는 프로그램 
// + 중복제거 알고리즘 추가 
// + 정렬 알고리즘 추가
import java.util.Random;

public class LottoGame03 {
    static final int size = 6;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("로또게임 ver 0.3");

        int[] lottoNumbers = new int[size];

        int idx = 0;

        while (idx < lottoNumbers.length) {
            int randomNumber = random.nextInt(NUMBER_MAX) + 1;
            boolean numberChecker = true;
            for (int i = 0; i < lottoNumbers.length; i++) {
                if (randomNumber == lottoNumbers[i]) {
                    numberChecker = false;
                    break;
                }
            }

            if (numberChecker) {
                lottoNumbers[idx] = randomNumber;
                idx++;
            }
        }
        System.out.println();
        System.out.println("정렬 전");
        System.out.println();

        for (int i = 0; i < lottoNumbers.length; i++) {

            System.out.printf("lottoNumbers[%d]: [%2d]\n", i, lottoNumbers[i]);

        }
        // lottoNumber의 숫자를 정렬해주는 i for 문

        for (int i = 0; i < lottoNumbers.length - 1; i++) {
            if (lottoNumbers[i] > lottoNumbers[i + 1]) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i + 1];
                lottoNumbers[i + 1] = temp;

                i = -1;
            }
        }

        System.out.println();
        System.out.println("정렬 후");
        System.out.println();

        for (int i = 0; i < lottoNumbers.length; i++) {

            System.out.printf("lottoNumbers[%d]: [%2d]\n", i, lottoNumbers[i]);

        }

    }
}
