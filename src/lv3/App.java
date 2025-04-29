package lv3;

import java.util.Scanner;

public class App {

    static double doubleFirstNum ;
    static double doubleSecondNum ;
    static int intFirstNum;
    static int intSecondNum;
    static String firstInput;
    static String secondInput;

    public static void main(String[] args) {

        // 입력 받은 값을 활용하기 위해 Scanner 사용
        Scanner sc  = new Scanner(System.in);

        // 인스턴스(객체) 생성 -> <제네릭 타입 지정 해줘야 한다>
        ArithmeticCalculator<Number> numberCalculator = new ArithmeticCalculator<>();


        OperatorType operator;


        while(true){
            try{
                // 양수(0포함) 입력받기
                askQuestion();
                firstInput = sc.next();

                doubleFirstNum = Double.parseDouble(firstInput);
                intFirstNum = (int) Double.parseDouble(firstInput);


                askQuestion();
                secondInput = sc.next();


                doubleSecondNum = Double.parseDouble(secondInput);
                intSecondNum = (int) Double.parseDouble(secondInput);


                // 입력 받은 숫자가 0보다 작을 경우
                if (doubleFirstNum < 0 || doubleSecondNum < 0) {
                    System.out.println("숫자를 0이상 입력해주세요!!");
                    continue;
                }// 예외 발생 시 (숫자 외에 입력 하였을 경우)
            }
            catch (NumberFormatException e){
                System.out.println("다른 문자가 아닌 숫자를 입력해주세요");
                sc.nextLine(); // 버퍼 지우기
                continue;
            }
            // 사칙 연산 기호
            operator = operation(sc,doubleSecondNum);

            // 핵심 기능 -> 실수, 정수 나누어 계산
            if ((firstInput.contains(".")) || (secondInput.contains("."))) {
                numberCalculator.doubleCalculate(doubleFirstNum,doubleSecondNum,operator);
            }else{
                numberCalculator.intCalculate(intFirstNum,intSecondNum,operator);
            }


            // 입력값보다 결과값이 큰 경우 조회
            numberCalculator.showResult(doubleFirstNum,doubleSecondNum);

            // 입력 받은 값을 사칙 연산 후
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, exit 외 입력 시 반복)");
            if("exit".equals(sc.next())){
                break;
            }

        }
    }


    // 숫자를 입력 받는 메서드
    public static void askQuestion (){
        System.out.print("숫자를 입력해주세요");
    }

    // 사칙연산 기호 메서드
    public static OperatorType operation (Scanner sc, double doubleSecondNum){
        OperatorType operator;
        while(true) {
            try{
                // 사칙연산 기호 입력 받기
                System.out.print("사칙연산 기호를 입력해주세요");
                String strOperator = sc.next();

                // String -> OperatorType
                operator = OperatorType.getOperatorType(strOperator);

                // 사칙연산 기호 정상적인 경우
                if (!operator.getOperator().equals("/") || doubleSecondNum != 0.0) {
                    break;
                }

                // 나눗셈, 분모(0)인 경우
                System.out.println("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력 될 수없습니다.");
                System.out.println("사칙연산 기호를 다시 입력해주세요");
            }
            // 사칙연산 기호 외에 입력 받았을 경우
            catch(IllegalArgumentException e){
                System.out.println("기호를 입력해주세요");
                sc.nextLine(); // 버퍼 지우기
            }
        }
        return operator;
    }
}
