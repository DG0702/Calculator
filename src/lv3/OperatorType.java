package lv3;

public enum OperatorType {
    // enum 상수이름(생성자 매개값)
    plus("+"),
    minus("-"),
    mul("*"),
    div("/");

    // [OperatorType.plus, OperatorType.minus, OperatorType.mul, OperatorType.div]

    // 속성
    private final String operator;

    // 생성자
    OperatorType (String operator){
        this.operator = operator;
    }

    // getter
    public String getOperator(){
        return operator;
    }

    // operator 내부값 표현 -> (+,-,*,/)
    public String toString(){
        return String.valueOf(operator);
    }

    // 입력값 커스텀 메서드 -> op.operator -> (+,-,*,/)
    public static OperatorType getOperatorType(String symbol){
        for(OperatorType op : OperatorType.values()){
            if(op.operator.equals(symbol)){
                return op;
            }
        }
        // 오류 발생 시 즉시 종료
        throw new IllegalArgumentException("지원하지 않는 기호입니다" + symbol);
    }



}
