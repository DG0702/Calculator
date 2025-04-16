package lv2;

public class Calculator {
    
    // 속성 - 필드 (캡슐화)

    private int firstNum; // 입력 받을 숫자 1
    private int secondNum; // 입력 받을 숫자 2
    private char operator; // 사칙 연산 기호



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


    // 계산하고 출력하는 메서드
    public void calculator(int firstNum, int secondNum , char operator){
        // 사칙연산 기호을 입력 받았을 경우
        switch (operator){
            case '+':
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum) );
                break;
            case '-':
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum) );
                break;
            case '*':
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum) );
                break;
            case '/':
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum) );
                break;

        }


    }



}
