package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    
    // 속성 - 필드 (캡슐화)
    private int firstNum; // 입력 받을 숫자 1
    private int secondNum; // 입력 받을 숫자 2
    private char operator; // 사칙 연산 기호
    private List<Integer> result;

    public Calculator() {
        result = new ArrayList<>();
    }



    // setter
    public void setFirstNum (int firstNum){
        this.firstNum = firstNum;
    }

    public void setSecondNum (int secondNum){
        this.secondNum = secondNum;
    }

    public void setOperator(char operator){
        this.operator = operator;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }

    // getter
    public int getFirstNum (){
        return firstNum;
    }

    public int getSecondNum (){
        return secondNum;
    }

    public char getOperator (){
        return operator;
    }

    public List<Integer> getResult (){
        return result;
    }


    // 계산하고 출력하는 메서드
    public void calculator(int firstNum, int secondNum, char operator){
        // 사칙연산 기호을 입력 받았을 경우
        switch (operator){
            case '+':
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum) );
                result.add(firstNum + secondNum);
                break;
            case '-':
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum) );
                result.add(firstNum - secondNum);
                break;
            case '*':
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum) );
                result.add(firstNum * secondNum);
                break;
            case '/':
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum) );
                result.add(firstNum / secondNum);
                break;
        }
    }

    // 저장된 값들을 제거하는 메서드
    public void removeResult(){
        System.out.println("저장된 값 : " + getResult());
        result.remove(0);
        System.out.println("삭제 후 저장된 값 : " + getResult());
    }



}
