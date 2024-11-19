package lv3;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultStorage {
    private Stack<Integer> stack = new Stack<>();

    // 결과 추가
    public void addResult(int result) {
        stack.push(result);
    }

    // 결과 내역 조회
    public void getResult() {
        System.out.println("결과 내역을 조회합니다." + stack);
    }


    // 결과 내역 중 최근 1건 삭제
    public void removeResult() {
        if (!stack.isEmpty()) {
            stack.pop();
            System.out.println("삭제가 완료 되었습니다.");
        } else {
            System.out.println("결과 내역이 존재하지 않습니다.");
        }
    }

    // 과거 결과 값 변경 코드
    public void setResult(Stack<Integer> resultStack) {
        this.stack = resultStack;
    }

    // 특정 값 보다 큰 값들 나열
    public void getLargestNumbers(Scanner scanner) {
        System.out.print("특정 값을 입력해주세요 : ");
        int specificValue = scanner.nextInt();
        scanner.nextLine();

        System.out.println("특정 값보다 큰 수들을 나열하겠습니다.");
        List<Integer> filterNumbers = stack.stream()
                .filter(numbers -> numbers > specificValue)
                .collect(Collectors.toList());

        if (filterNumbers.isEmpty()) {
            System.out.println("특정 값보다 큰 수가 없습니다.");
        } else {
            System.out.println( specificValue +" 값보다 큰 수 : " + filterNumbers);
        }
    }

    //결과 내역 중 중복 값들 제외
    public void getDistinctResults() {
        List<Integer> distinctNumbers =stack.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("중복 값 제외 결과 내역입니다." + distinctNumbers);
    }

    //결과 내역들을 전부 더하는 기능
    public void getResultSum() {
        int sum = stack.stream()
                .reduce(0, Integer::sum);
        System.out.println("결과 내역들의 총 합입니다 : " + sum);
    }

    //결과 내역 중 중복을 제거하고 전부 더하기
    public void getDistinctResultSum() {
        Integer sum = stack.stream()
                .distinct()
                .reduce(0, Integer::sum);

        System.out.println("결과 내역 중 중복을 제외한 총 합입니다 : " + sum);
    }

    //결과 내역 중 중복을 제거하고 정렬하기
    public void getDistinctSort() {
        List<Integer> sorted = stack.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("결과 내역 중 중복을 제외한 정렬입니다. " + sorted);
    }

    //결과 내역 중 중복을 제거하고 짝수만 출력
    public void getDistinctEven() {
        List<Integer> distinctEven = stack.stream()
                .distinct()
                .filter(result -> result % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("결과 내역 중 중복을 제거하고 짝수만 출력합니다. " + distinctEven);
    }



}
