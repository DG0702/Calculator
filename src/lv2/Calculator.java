package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성 - 필드 (캡슐화)
    private List<Integer> allResult  = new ArrayList<>();

    // setter - 구현하였지만 사용하지 않아 주석처리
//    public void setResult(List<Integer> allResult) {
//        this.allResult = allResult;
//    }

    // getter
    public List<Integer> getAllResult (){
        return allResult;
    }


    // 계산하고 출력하는 메서드
    public void calculator(int firstNum, int secondNum, char operator){
        int res = 0;
        // 사칙연산 기호을 입력 받았을 경우
        switch (operator){
            case '+':
                res = firstNum + secondNum;
                allResult.add(res);
                break;
            case '-':
                res = firstNum - secondNum;
                allResult.add(res);
                break;
            case '*':
                res = firstNum * secondNum;
                allResult.add(res);
                break;
            case '/':
                res = firstNum / secondNum;
                allResult.add(res);
                break;
        }
        System.out.println(firstNum + " " + operator + " " + secondNum + " = " + res );
    }

    // 저장된 값을 가져오는 메서드
    public void showResult(){
        System.out.println("저장된 값 : " + getAllResult());
    }


    // 저장된 값들을 제거하는 메서드
    public void removeResult(){
        allResult.remove(0);
        System.out.println("삭제 후 저장된 값 : " + getAllResult());
    }



}
