#  📑 Calculator

📗 **계산기 프로젝트**

- **이번 과제의 목표 : 자바 문법 실습과 객체 지향 개념의 적용**

## 🖥️ 개발 프로세스(환경)

### ⛏️IDE :
- `Intellij`

### 📌 Java :
- **JDK 17버전 사용**

### 🔁 Version Control :
- `GitHub`

<br>
<hr>

## ✅ 요구사항

### [LV 1️⃣] : 클래스 없이 기본적인 연산을 수행 할 수 있는 계산기 만들기

- 🍭 2개의 숫자와 연산자(+,-,*,/)를 입력받아 계산


- 🍭 exit 입력 전까지 반복적으로 실행

<br>
<hr>

### LV 2️⃣ : 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

- 🍭 Calculator 클래스 생성 -> 연산 기능 분리


- 🍭 계산 결과를 저장하는 리스트 생성 , 저장된 결과 중 강자 먼저 저장된 데이터 삭제 하는 기능
<br>
<hr>

### LV 3️⃣ : Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기

- 🍭 Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 계산기 클래스에서 활용


- 🍭 입력 받는 값을 정수가 아닌 실수도 가능하도록 만들기 -> **제네릭** 활용


- 🍭 저장된 연산 결과들 중 Scanner로 입력받는 값보다 큰 결과값 들을 출력

  - **단 Lambda & Stream 활용**



<br>
<hr>

## 🌟 주요기능

- 값을 입력 받아 사칙 연산 수행


- 객체지향 설계 (입력, 연산, 타입에 따라 분리)


- 계산 결과 저장


- 계산 결과가 가정 오래된 값 삭제


- 입력값보다 큰 결과값 출력

## 📜 디렉토리 구조

CalculatorProject/
├── .idea/                        # IntelliJ 설정 파일들
├── out/                          # 컴파일 결과물 (자동 생성됨)
├── src/                          # 소스 코드 디렉토리
│   ├── lv1/
│   │   └── App.java              # 클래스 없이 계산기 구현
│   ├── lv2/
│   │   ├── App.java              # 클래스 기반 계산기
│   │   └── Calculator.java
│   └── lv3/
│       ├── App.java              # OOP 적용한 계산기
│       ├── ArithmeticCalculator.java
│       └── OperatorType.java
├── .gitignore                    # Git 추적 제외 파일 목록
├── CalculatorProject.iml         # IntelliJ 모듈 파일
└── README.md                     # 프로젝트 설명

 