package lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        ResultStorage resultStorage = new ResultStorage();
        CalculatorClass calculatorClass = new CalculatorClass(resultStorage);

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("1. 연산 | 2. 조회 | 3. 삭제 | 4. 종료 중 하나를 선택해주세요.");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("연산을 진행합니다.");
                    calculatorClass.procedure(scanner);
                } else if (choice == 2) {
                    resultStorage.getResult();
                } else if (choice == 3) {
                    System.out.println("최근 1건의 내역을 삭제합니다. ");
                    resultStorage.removeResult();
                } else if (choice == 4) {
                    System.out.print("종료를 선택하셨습니다. 정말로 종료하시겠습니까?(exit를 입력하시면 종료됩니다.)");
                    String recheck = scanner.nextLine();
                    calculatorClass.endProgram(recheck);
                    break;
                } else {
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 값 입니다. 프로그램을 다시 실행해주세요");
        }

    }
}
