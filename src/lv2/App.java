package lv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 입력 받은 값을 활용하기 위해 Scanner 사용
        Scanner sc  = new Scanner(System.in);

        // 인스턴스(객체) 생성
        Calculator calculator = new Calculator();

        while(true){
            try{
                // 양의 정수(0포함) 입력받기
                System.out.print("1번째 숫자를 입력해주세요");
                int firstNum = sc.nextInt();
                System.out.print("2번째 숫자를 입력해주세요");
                int secondNum = sc.nextInt();


                // 입력 받은 숫자가 0보다 작을 경우 (getter 활용)
                if (firstNum < 0 || secondNum < 0) {
                    System.out.println("숫자를 0이상 입력해주세요!!");
                    continue;
                }

                char operator;

                while(true){
                    // 사칙연산 기호 입력 받기
                    System.out.print("사칙연산 기호를 입력해주세요");
                    operator = sc.next().charAt(0);

                    // 사칙연산 기호 : 나눗셈, 분모가 0 일 경우 (getter 활용)
                    if(operator == '/' && secondNum == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력 될 수없습니다.");
                        System.out.println("사칙연산 기호를 다시 입력해주세요");
                        continue;
                    }
                    // 사칙연산 기호 외에 입력 받았을 경우
                    else if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                        System.out.println("사칙연산 기호를 잘못 입력하셨습니다 다시 입력해주세요");
                        continue;
                    }
                    break;
                }

                // 사칙연산 메서드 사용 -> 핵심 기능 -> while문 밖에서 수행
                calculator.calculator(firstNum, secondNum, operator);

                // 저장된 값 확인
                calculator.showResult();

                // 삭제 메서드 사용 유무
                System.out.println("저장된 값을 삭제 하시겠습니까? (Y 입력 시 삭제)");
                String remove = sc.next();
                if(remove.equals("Y")){
                    calculator.removeResult();
                }else{
                    System.out.println("삭제하지 않습니다");
                }


                // 입력 받은 값을 사칙 연산 후
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, exit 외 입력 시 반복)");
                if("exit".equals(sc.next())){
                    break;
                }
            }
            // 예외 발생 시 (정수 외에 입력 하였을 경우)
            catch (InputMismatchException e){
                System.out.println("정수를 입력해주세요");
                sc.nextLine(); // 버퍼 지우기
            }
        }
    }
}
