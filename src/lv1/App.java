package lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 입력 받은 값을 활용하기 위해 Scanner 사용
        Scanner sc  = new Scanner(System.in);

        while(true){
            try{
                // 양의 정수(0포함) 입력받기
                System.out.print("1번째 숫자를 입력해주세요");
                int firstNum = sc.nextInt();
                System.out.print("2번째 숫자를 입력해주세요");
                int secondNum = sc.nextInt();

                // 입력 받은 숫자가 0보다 작을 경우
                if (firstNum < 0 || secondNum < 0) {
                    System.out.println("숫자를 0이상 입력해주세요!!");
                }


                while(true){
                    // 사칙연산 기호 입력 받기
                    System.out.print("사칙연산 기호를 입력해주세요");
                    char operator = sc.next().charAt(0);

                    // 사칙연산 기호을 입력 받았을 경우
                    int result = 0;
                    if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                        switch (operator){
                            case '+':
                                result = firstNum + secondNum;
                                break;
                            case '-':
                                result = firstNum - secondNum;
                                break;
                            case '*':
                                result = firstNum * secondNum;
                                break;
                            case '/':
                                if(secondNum ==0){
                                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력 될 수없습니다.");
                                    System.out.println("사칙연산 기호를 다시 입력해주세요");
                                    // while문 건너뜀
                                    continue;
                                }else{
                                    result = firstNum / secondNum;
                                    break;
                                }
                        }
                        System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result );
                        break;
                    }
                    // 사칙연산 기호를 입력받지 못하였을 경우
                    System.out.println("사칙연산 기호를 잘못 입력하셨습니다 다시 입력해주세요");
                }
                // 입력 받은 값을 사칙 연산 후
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, exit 외 입력 시 반복)");
                if("exit".equals(sc.next())){
                    break;
                }
            }
            // 예외 발생 시 (정수 외에 입력 하였을 경우)
            catch(InputMismatchException e){
                System.out.println("정수를 입력해주세요");
                sc.nextLine(); // 버퍼 지우기
            }
        }
    }
}
