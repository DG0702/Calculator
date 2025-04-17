package lv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator <T extends Number>{

    // 속성
    private T firstNum;
    private T secondNum;
    private OperatorType operator;
    private List<T> result ;

    // 생성자
    public ArithmeticCalculator(){
        result = new ArrayList<>();
    }

    // setter
    public void setFirstNum(T firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(T secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperator(OperatorType operator) {
        this.operator = operator;
    }

    public void setResult(List<T> result){
        this.result = result;
    }

    // getter
    public T getFirstNum() {
        return firstNum;
    }

    public T getSecondNum() {
        return secondNum;
    }

    public OperatorType getOperator() {
        return operator;
    }

    public List<T> getResult(){
        return result;
    }

    // 사칙 연산 기호 가져오기 (enum 통해)
    OperatorType plus = OperatorType.plus;
    OperatorType minus = OperatorType.minus;
    OperatorType mul = OperatorType.mul;
    OperatorType div = OperatorType.div;




    // 계산 메서드
    public void calculate(T firstNum, T secondNum, OperatorType operator){
        // 입력 받은 값 2개 모두 정수 일경우
        if(firstNum instanceof Integer && secondNum instanceof Integer){
            switch(operator){
                case plus:
                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum.intValue() + secondNum.intValue()));
                    break;
                case minus:
                    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum.intValue() - secondNum.intValue()));
                    break;
                case mul:
                    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum.intValue() * secondNum.intValue()));
                    break;
                case div:
                    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum.doubleValue() / secondNum.doubleValue()));
                    break;
            }
        } 
        // 입력 받은 값이 1개는 정수, 1개는 실수 일 때, 모두 실수일 때
        else {
            switch(operator){
                case plus:
                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum.doubleValue() + secondNum.doubleValue()));
                    break;
                case minus:
                    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum.doubleValue() - secondNum.doubleValue()));
                    break;
                case mul:
                    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum.doubleValue() * secondNum.doubleValue()));
                    break;
                case div:
                    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum.doubleValue() / secondNum.doubleValue()));
                    break;
            }
        }
    }


    // 조회 메서드 -> lambda, stream 사용

    





}
