package lv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator <T>{


    // 속성
    private List<Number> result = new ArrayList<>();


    // setter - 구현은 하였지만 사용하지 않아 주석처리
//    public void setResult(List<Number> result){
//        this.result = result;
//    }

    // getter - 구현은 하였지만 사용하지 않아 주석처리
//    public List<Number> getResult(){
//        return result;
//    }


    public void intCalculate(Integer firstNum, Integer secondNum, OperatorType operator){
        int resultNum = 0;

        if(firstNum != null && secondNum != null){
            switch(operator){
                case PLUS:
                    resultNum = firstNum + secondNum;
                    result.add(resultNum);
                    break;
                case MINUS:
                    resultNum = firstNum - secondNum;
                    result.add(resultNum);
                    break;
                case MUL:
                    resultNum = firstNum * secondNum;
                    result.add(resultNum);
                    break;
                case DIV:
                    resultNum = firstNum / secondNum;
                    result.add(resultNum);
                    break;
            }

            System.out.println(firstNum + " " + operator.getOperator() + " " + secondNum
                    + " = " + resultNum);
        }
    }




    public void doubleCalculate(Double firstNum, Double secondNum, OperatorType operator){
        double resultNum = 0.0;

        if(firstNum != null && secondNum != null){
            switch(operator){
                case PLUS:
                    resultNum = firstNum + secondNum;
                    result.add(resultNum);
                    break;
                case MINUS:
                    resultNum = firstNum - secondNum;
                    result.add(resultNum);
                    break;
                case MUL:
                    resultNum = firstNum * secondNum;
                    result.add(resultNum);
                    break;
                case DIV:
                    resultNum = firstNum / secondNum;
                    result.add(resultNum);
                    break;
            }

            System.out.println(firstNum + " " + operator.getOperator() + " " + secondNum
                    + " = " + resultNum);
        }
    }



    // 조회 메서드 -> lambda, stream 사용
    public void showResult(double firstNum, double secondNum){
        System.out.println("저장된 값 : " + result);
        List<String> showResult = result.stream()
                // || -> 두 조건 중 하나라도 맞으면 true , && -> 두 조건 모두 만족해야 true
                // ❗❗ 반대로 생각 할 수 있으므로 주의
                .filter(result -> (result.doubleValue() > firstNum) && (result.doubleValue() > secondNum))
                .map(Object::toString)
                .toList();
        System.out.println("입력받은 값보다 큰 결과값: " + showResult);
    }



}

