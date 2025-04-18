package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number>{

    // 속성
    private T firstNum;
    private T secondNum;
    private OperatorType operator;
    private List<Number> result ;

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

    public void setResult(List<Number> result){
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

    public List<Number> getResult(){
        return result;
    }



    // 계산 메서드
    public void calculate(T firstNum, T secondNum, OperatorType operator){
        // 입력 받은 값 2개 모두 정수 일경우
        if(firstNum instanceof Integer && secondNum instanceof Integer){
            switch(operator){
                case plus:
                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum.intValue() + secondNum.intValue()));
                    result.add(firstNum.intValue() + secondNum.intValue());
                    break;
                case minus:
                    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum.intValue() - secondNum.intValue()));
                    result.add(firstNum.intValue() - secondNum.intValue());
                    break;
                case mul:
                    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum.intValue() * secondNum.intValue()));
                    result.add(firstNum.intValue() * secondNum.intValue());
                    break;
                case div:
                    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum.doubleValue() / secondNum.doubleValue()));
                    result.add(firstNum.intValue() / secondNum.intValue());
                    break;
            }
        } 
        // 입력 받은 값이 1개는 정수, 1개는 실수 일 때, 모두 실수일 때
        else {
            switch(operator){
                case plus:
                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum.doubleValue() + secondNum.doubleValue()));
                    result.add(firstNum.doubleValue() + secondNum.doubleValue());
                    break;
                case minus:
                    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum.doubleValue() - secondNum.doubleValue()));
                    result.add(firstNum.doubleValue() - secondNum.doubleValue());
                    break;
                case mul:
                    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum.doubleValue() * secondNum.doubleValue()));
                    result.add(firstNum.doubleValue() * secondNum.doubleValue());
                    break;
                case div:
                    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum.doubleValue() / secondNum.doubleValue()));
                    result.add(firstNum.doubleValue() / secondNum.doubleValue());
                    break;
            }
        }
    }

    // 조회 메서드 -> lambda, stream 사용
    public void showResult(){
        System.out.println("저장된 값 : " + getResult());
        List<String> showResult = result.stream()
                // || -> 두 조건 중 하나라도 맞으면 true , && -> 두 조건 모두 만족해야 true
                // ❗❗ 반대로 생각 할 수 있으므로 주의
                .filter(result -> result.doubleValue() > firstNum.doubleValue() && result.doubleValue() > secondNum.doubleValue())
                .map(result -> result.toString())
                .collect(Collectors.toList());
        System.out.println("입력받은 값보다 큰 결과값: " + showResult);
    }





    





}
