package lv3;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class CalculatorClass {
    private final Stack<Integer> resultStack = new Stack<>(); //재할당 방지

    public void procedure(Scanner scanner) {
        try {
            System.out.print("첫 번째 값을 입력해주세요 : ");
            int x = scanner.nextInt();
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력해주세요 : ");
            String operator = scanner.nextLine();

            System.out.print("두 번째 값을 입력해주세요 : ");
            int y = scanner.nextInt();

            calculate(x, operator, y);
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 값 입니다.");
        }
    }

    public void calculate(int x, String operator, int y) {
        int result;
        OperatorType operatorType = OperatorType.fromStringToOperatorType(operator);

        if (operatorType != null) { // fromStringToOperatorType 메서드에 반환값이 null도 있으니 null 체크
            switch (operatorType) {
                case PLUS -> {
                    result = x + y;
                    resultStack.add(result);
                    System.out.println(result);
                }
                case SUB -> {
                    result = x - y;
                    resultStack.add(result);
                    System.out.println(result);
                }
                case MULTI -> {
                    result = x * y;
                    resultStack.add(result);
                    System.out.println(result);
                }
                case DIVIDE -> {
                    if (y == 0) {
                        System.out.println("두 번째 수는 0이 될 수 없습니다.");
                    }
                    result = x / y;
                    resultStack.add(result);
                    System.out.println(result);
                }
            }
        }


    }

    // 계산 종료 여부 코드
    public void endProgram(String recheck) {
        if (recheck.equals("exit")){
            System.out.println("프로그램을 종료합니다.");
        }
    }


    // 과거 결과 값 조회 코드
    public Stack<Integer> getResult() {
        return resultStack;
    }

//    // 과거 결과 값 변경 코드
//    public void setResult(Stack<Integer> resultStack) {
//        this.resultStack = resultStack;
//    }

    // 제일 최근 결과 값 1개 삭제 코드
    public void removeResult() {
        resultStack.pop();
        System.out.println("최근 한 건 내역이 삭제 되었습니다." + getResult());
    }
}
