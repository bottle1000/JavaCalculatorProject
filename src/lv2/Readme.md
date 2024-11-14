이 프로젝트는 Java 기반의 콘솔 계산기 프로그램입니다.

사용자는 다음 기능을 수행할 수 있습니다:

	- 두 정수와 사칙연산(+, -, *, /)을 입력받아 계산 수행
	- 이전 계산 결과 조회 및 삭제
	- 프로그램 종료
----
기능

	1.연산 (Addition, Subtraction, Multiplication, Division)
	사용자가 입력한 두 숫자와 연산 기호를 통해 결과를 계산하고 저장합니다.
	    + : 덧셈
	    - : 뺄셈
	    * : 곱셈
	    / : 나눗셈 (분모가 0인 경우 에러 처리)
	2. 결과 조회
	이전 연산 결과를 Stack을 사용하여 조회합니다.
 
	3. 결과 삭제
	Stack에서 가장 최근 결과를 삭제합니다.
 
	4.프로그램 종료
	exit 입력 시 프로그램이 종료됩니다.
 
----
코드 구조

	1. CalculatorMain
	프로그램의 진입점으로, 사용자 입력을 받아 CalculatorClass의 기능을 호출합니다.
	 기능:
	   - 사용자가 선택한 메뉴(1~4)에 따라 연산, 결과 조회, 삭제, 종료 기능 실행
	   - Scanner를 통해 사용자 입력 처리

	2. CalculatorClass
	계산 로직과 데이터 관리 기능을 수행하는 클래스입니다.
	- procedure(Scanner scanner):
	사용자 입력을 받아 두 숫자와 연산 기호를 전달합니다.
 
	- calculate(int x, String operator, int y):
	사칙연산을 수행하고 결과를 resultStack에 저장합니다.
 
	- getResult():
	 Stack에 저장된 계산 결과를 반환합니다.
 
	- removeResult():
	최근 저장된 계산 결과를 삭제합니다.
 
	- endProgram(String recheck):
	사용자가 프로그램 종료 여부를 다시 확인하도록 합니다.
