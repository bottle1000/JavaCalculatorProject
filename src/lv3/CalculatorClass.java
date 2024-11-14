package lv3;

// 조회할 때 제일 큰 수? 1개만 보여주면 되나 lv 2에서는 추가할 때마다 전부 보여줬는데
// 정수, 실수 입력 받을 때, String을 써서 유연하게 바꾸는 것이 좋나

import java.util.Scanner;
import java.util.Stack;

public class CalculatorClass {
    private Stack<String> resultStack = new Stack<>();

    public void procedure(Scanner scanner) {
        System.out.print("첫 번째 값을 입력해주세요 : ");
        String x = scanner.nextLine();

        System.out.print("사칙연산 기호를 입력해주세요 : ");
        String operator = scanner.nextLine();

        System.out.print("두 번째 값을 입력해주세요 : ");
        String y = scanner.nextLine();

        calculate(x, operator, y);
    }

    public void calculate(String x, String operator, String y) {
        int result;

        switch (operator) {
            case "+":
                result = Integer.px + y;
                Integer.parseInt(x);
                System.out.println("결과 : " + result);
                resultStack.add(result);
                break;
            case "-":
                result = x - y;
                System.out.println("결과 : " + result);
                resultStack.add(result);
                break;
            case "*":
                result = x * y;
                System.out.println("결과 : " + result);
                resultStack.add(result);
                break;
            case "/":
                if (y == 0) {
                    System.out.println("분모가 0일 수 없습니다! 선택창으로 돌아갑니다.");
                    break;
                }
                result = x / y;
                System.out.println("결과 : " + result);
                resultStack.add(result);
                break;
            default:
                System.out.println("잘못된 연산 기호입니다. 선택창으로 돌아갑니다.");
        }
    }

    // 계산 종료 여부 코드
    public void endProgram(String recheck) {
        if (recheck.equals("exit")){
            System.out.println("프로그램을 종료합니다.");
        }
    }


    // 과거 결과 값 조회 코드
    public Stack<String> getResult() {
        return resultStack;
    }

    // 과거 결과 값 변경 코드
    public void setResult(Stack<String> resultStack) {
        this.resultStack = resultStack;
    }

    // 제일 최근 결과 값 1개 삭제 코드
    public void removeResult() {
        resultStack.pop();
        System.out.println("최근 한 건 내역이 삭제 되었습니다." + getResult());
    }
}
