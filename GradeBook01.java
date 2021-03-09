package day0309;
// 학생 관리 프로그램 

// 5명의 학생을 관리하는 프로그램을 작성하시오.
// 단, 모든 변수로 만드는 것이 아니라
// 번호 배열, 이름 배열, 국어점수 배열, 영어점수 배열, 수학점수 배열
// 로 만들어서 
// 각 배열의 같은 인덱스는 같은 학생의 정보가 될 수 있도록 하시오.
// 또한 메뉴를 만들어
// 입력, 출력, 종료를 분리하고
// 입력 시에는 0번, 1번, 2번 ...  순으로 들어갈 수 있게 만드시오.
// 입력시에 잘못된 점수는 입력되지 않도록 만들어 주세요.

// 심화단계: 출력시, 만약 입력 학생이 없으면 "입력된 학생이 없습니다" 라고 출력 되고 
//         입력된 학생이 존재할 시에는 입력된 학생들만 출력 되고 아직 입력 되지 않은 칸의 정보는 
//         출력되지 않도록 프로그램을 작성하시오.

import java.util.Scanner;

public class GradeBook01 {
    static final int size = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[size];
        String[] name = new String[size];
        int[] kor = new int[size];
        int[] eng = new int[size];
        int[] math = new int[size];
        int userInput = 0;

        boolean inputChecker = false;

        while (true) {
            System.out.println("1. [입력]  2.[출력]  3.[종료]");
            System.out.print("> ");
            int userChoice = sc.nextInt();
            if (userChoice == 1) {

                // 전체 정보를 입력할 i for 문
                for (int i = 0; i < number.length; i++) {
                    System.out.println();
                    System.out.println(i + "번");
                    System.out.println();

                    System.out.println("이름을 입력하세요.");
                    System.out.print("> ");
                    String inputName = sc.next();
                    name[i] = inputName;

                    System.out.println("국어 점수를 입력하세요.");
                    System.out.print("> ");
                    userInput = sc.nextInt();

                    while (!(userInput >= 0 && userInput <= 100)) {
                        System.out.println("점수를 잘못입력하셨습니다.");
                        System.out.println("점수를 다시 입력하세요.");
                        System.out.print("> ");
                        userInput = sc.nextInt();
                    }
                    kor[i] = userInput;

                    System.out.println("영어 점수를 입력하시오.");
                    System.out.print("> ");
                    userInput = sc.nextInt();

                    while (!(userInput >= 0 && userInput <= 100)) {
                        System.out.println("점수를 잘못입력하셨습니다.");
                        System.out.println("점수를 다시 입력하세요.");
                        System.out.print("> ");
                        userInput = sc.nextInt();
                    }
                    eng[i] = userInput;

                    System.out.println("수학 점수를 입력하시오.");
                    System.out.print("> ");
                    userInput = sc.nextInt();

                    while (!(userInput >= 0 && userInput <= 100)) {
                        System.out.println("점수를 잘못입력하셨습니다.");
                        System.out.println("점수를 다시 입력하세요.");
                        System.out.print("> ");
                        userInput = sc.nextInt();

                    }
                    math[i] = userInput;

                    inputChecker = true;
                  

                }

            } else if (userChoice == 2) {
                if (inputChecker) {
                    for (int i = 0; i < number.length; i++) {
                        System.out.println(i + "번");
                        System.out.println("이름 : " + name[i]);
                        System.out.println("국어점수 : " + kor[i]);
                        System.out.println("영어점수 : " + eng[i]);
                        System.out.println("수학점수 : " + math[i]);
                    }

                } else {
                    System.out.println("입력된 학생이 없습니다.");
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
    }
}
