package day0309;
// 로또 게임

// 사용자로부터 1부터 45까지 로또 숫자 6개를 입력 받아서 
// 정렬하여 출력하시오

// 단, 사용자가 잘못된 숫자 혹은 중복된 숫자를 입력하면 
// 올바른 숫자를 입력할 때 까지 다시 입력을 받도록 하세요. (40분)

import java.util.Scanner;

public class LottoGame04 {
    static final int size = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lottoNumbers = new int[size];

        int idx = 0;
        while (idx < lottoNumbers.length) {
            System.out.println("1~45까지의 숫자를 입력하시오.");
            System.out.print("> ");

            int userNumber = sc.nextInt();
            while (userNumber < NUMBER_MIN || userNumber > NUMBER_MAX) {

                System.out.println("숫자가 범위 밖입니다.");
                System.out.println("다시 입력해주세요.");
                System.out.print("> ");
                userNumber = sc.nextInt();

            }

            boolean numberChecker = true;

            for (int i = 0; i < lottoNumbers.length; i++) {
                if (userNumber == lottoNumbers[i]) {
                    numberChecker = false;
                    break;
                }
            }

            if (numberChecker) {
                lottoNumbers[idx] = userNumber;
                idx++;
            }

        }

        for (int i = 0; i < lottoNumbers.length - 1; i++) {
            if (lottoNumbers[i] > lottoNumbers[i + 1]) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i + 1];
                lottoNumbers[i + 1] = temp;
                i = -1;
            }
        }

        for (int i = 0; i < lottoNumbers.length; i++) {

            System.out.printf("lottoNumbers[%d]: [%2d]\n", i, lottoNumbers[i]);

        }

        sc.close();
    }
}
