package lv1;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 연산 | 2. 종료 중 하나를 선택해주세요.");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼에 남아있는 줄바꿈 문자 없애주기.

            if (choice == 1) {
                System.out.println("연산을 진행합니다.");
                procedure(scanner);
            } else if (choice == 2) {
                System.out.print("종료를 선택하셨습니다. 정말로 종료하시겠습니까?(exit를 입력하시면 종료됩니다) ");
                String recheck = scanner.nextLine();
                endProgram(recheck);
                return;
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    private static void procedure(Scanner scanner) {
        System.out.print("첫 번째 정수 값을 입력해주세요 : ");
        int x = scanner.nextInt();

        scanner.nextLine(); //개행 문자 제거
        System.out.print("사칙연산 기호를 입력해주세요 : ");
        String operator = scanner.nextLine();

        System.out.print("두 번째 정수 값을 입력해주세요 : ");
        int y = scanner.nextInt();

        calculate(x, operator, y);
    }

    private static void calculate(int x, String operator, int y) {
        switch (operator) {
            case "+":
                System.out.println("결과 : " + (x + y));
                break;
            case "-":
                System.out.println("결과 : " + (x - y));
                break;
            case "*":
                System.out.println("결과 : " + (x * y));
                break;
            case "/":
                if (y == 0) {
                    System.out.println("분모가 0일 수 없습니다! 선택창으로 돌아갑니다.");
                    break;
                }
                System.out.println("결과 : " + (x / y));
                break;
            default:
                System.out.println("잘못된 연산 기호입니다. 선택창으로 돌아갑니다.");
        }
    }

    // 계산 종료 여부 코드
    private static void endProgram(String recheck) {
        if (recheck.equals("exit")){
            System.out.println("프로그램을 종료합니다.");
        }
    }
}