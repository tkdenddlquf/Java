# 자바
## 언어의 이해
- 컴퓨터와 인간 사이를 연결할 수 있는 매개체이며 컴퓨터에 작업을 시키기 위한 도구
- 기계어인 저급 언어부터 자연어에 가까운 고급 언어까지 다양
- 보통 프로그래밍 언어라고 하면 고급 언어를 의미하는데 C, C++, 자바(Java) 등
- 고급 언어로 작성한 소스 코드는 컴파일러(Compiler)라는 시스템 소프트웨어를 이용해 먼저 기계어로 구성된 실행 코드로 변환

## 역사
- 선마이크로시스템즈(Sun Microsystems)의 제임스 고슬링(James Gosling)이 개발
- 자바의 전신은 1991년 그린 프로젝트(Green Project)로 탄생한 객체 지향 언어인 오크(Oak)
- 1993년 인터넷과 웹이 엄청난 속도로 발전
- 인터넷 환경에 적합하도록 오크를 새롭게 설계한 후 1995년 Java라는 이름으로 발표
- 1996년 자바 1.0을 발표
- 자바 1.2~1.4를 자바 2라고도 하는데, 자바 1.5부터는 1을 빼고 단순하게 자바 5로, 자바 1.6은 자바 6 등으로 지칭

## 특징
- 단순, 견고, 안전, 이식성
- 객체 지향, 함수형 코딩, 독립적 플랫폼, 분산처리 지원, 멀티스레딩 지원

## 활동 분야
- 웹 애플리케이션은 물론 CRM, ERP, SCM 등 기업용 애플리케이션
- 빅데이터, 클라우드, 소셜, 모바일, 사물인터넷 등 혁신 기술에서 커넥티드 카, 스마트폰 및 비디오 게임까지 일상생활과 업무 환경 전반에 밀접하게 연관
- 심지어 전 세계 해양 정보 수집, 인간 두뇌와 근골격계 연구 등에도 다양하게 활용

## 필요성
다른 프로그래밍 언어는 플랫폼 종속되어 있어 프로그램을 실행하려면 운영체제가 제어하는 메모리를 사용해야 하는데, 운영체제마다 메모리를 관리하는 방식이 다르지만, 자바는 자바 가상 머신(JVM)을 사용하기 때문에 플랫폼 독립되어 있다

## 개발 환경 (이클립스 사용)
- 매우 간단한 자바 프로그램은 메모장에서 .java 파일로 작성한 후 컴파일할 수 있으며, 통합 개발 환경(IDE, Integrated Development Environment)을 이용하면 효율적으로 관리할 수 있다
- 대표적인 자바 통합 개발 환경은 이클립스, 넷빈즈(NetBeans), 인텔리J 아이디어(IntelliJ IDEA) 등이 있다

## 유용한 단축키
|단축키|기능|
|-|-|
|Ctrl + 1|코드를 문맥에 맞게 빠르게 교정|
|Ctrl + Shift + O|자동으로 import 문 추가|
|Ctrl + Space Bar|주어진 단어나 문장으로 시작하는 메서드나 변수 표시|
|Ctrl + /|주석 처리, 해체|
|Ctrl + Shift + F|코드의 내용을 보기 좋겍 포맷팅|
|Ctrl + F11|에디터 뷰에 있는 클래스 실행|
|Alt + Shift + R|선택한 이름을 일괄 변경|
|Alt + Shift + Z|선택한 블록을 try~catch, for, while 문 등으로 자동 완성|
|F3|메서드, 변수를 선택하고 누으면 해당 메서드가 선언된 곳으로 이동|
|'sysout' + Ctrl + Space Bar|System.out.println() 삽입|
|Ctrl + Shift + X / Ctrl + Shift + Y|소문자를 대문자로, 대문자를 소문자로 치환|
|Ctrl + D|한 행 삭제|

## 구조
파일 → 클래스 → 메서드 → 실행문
- 클래스 : 객체 지향 언어에서 프로그램을 개발하는 단위
- 메서드 : 수행할 작업을 나열한 코드의 모임
- 실행문 : 작업을 지시하는 변수 선언, 값 저장, 메서드 호출 등의 코드
- 주석문 : 행 주석(//), 범위 주석(/*   \*/), 문서 주석(/**  */)

## 식별자
- 규칙
  - 문자, 언더바(_), $로 시작해야 한다. 한글도 가능하며, 영문자는 대·소문자를 구분
  - +, - 등 연산자를 포함하면 안 된다
  - 자바 키워드를 사용하면 안 된다
  - 길이에 제한이 없음
- 자바 키워드
  |분류|키워드|
  |-|-|
  |데이터 타입|byte, char, short, int, long, float, double, boolean|
  |접근 지정자|private, protected, public|
  |제어문|if, else, for, while, do, break, continue, switch, case|
  |클래스와 객체|class, interface, enum, extends, implements, new, this, super, instanceof, null|
  |예외 처리|try, catch, finally, throw, throws|
  |기타|abstract, assert, const, default, false, final, import, native, package, return, static, strictfp, synchronized, transient, true, void, volatile|
- 관례
  - 변수와 메서드는 모두 소문자로 표기하지만, 복합 단어일 때는 두 번째 단어부터 단어의 첫 자만 대문자로 표기
  - 클래스와 인터페이스는 첫 자만 대문자로 표기하고 나머지는 소문자로 표기하지만, 복합 단어일 때는 두 번째 단어부터 단어의 첫 자만 대문자로 표기
  - 상수는 전체를 대문자로 표기하지만, 복합 단어일 때는 단어를 언더바(_)로 연결

## 데이터 타입
- 정수
  |타입|크기|기본값|값의 범위|
  |-|-|-|-|
  |byte|8비트|0|-128 ~ 127|
  |short|16비트|0|-32,768 ~ 32,767|
  |int|32비트|0|-2,147,483,648 ~ 2,147,483,647|
  |long|64비트|0L|-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807|
- 문자
  |타입|크기|기본값|값의 범위|
  |-|-|-|-|
  |char|16비트|null|0('\u0000') ~ 65,535('\uFFFF')|
- 실수
  |타입|크기|기본값|값의 범위|
  |-|-|-|-|
  |float|32비트|0.0f|약 -3.4E + 38 ~ 3.4E + 38|
  |double|64비트|0.0d|약 -1.7E + 308 ~ 1.7E + 308|
- 논리
  |타입|크기|기본값|값의 범위|
  |-|-|-|-|
  |boolean|8비트|false|true와 false|

## 변수
- 의미
  - 프로그램은 기억 공간에 데이터를 보관하고, 각 기억 공간을 변수(Variable)로 구분
  - 변수는 데이터를 담는 상자와 같은 것으로 종류가 다양한데, 이를 구분하려고 데이터 타입을 사용
- 리터럴
  - 프로그램 내부에서 값을 정의해 변수를 초기화할 수 있는데, 그 값을 리터럴이라 한다
- 사용
  - 선언
    ```java
    int weight; // 정수 타입의 weight라는 이름의 변수 선언
    double x, y, z; // 3개의 변수를 ,로 연결해 선언
    ```
  - 초기화
    ```java
    int weight = 50; // int형 weight 변수를 선언 후 50을 대입(선언과 동시에 초기화)
    weight = 30; // weight 변수에 30을 대입(선언 후 초기화)
    ```
- 상수
  - 프로그램 실행 중 변경할 수 없는 데이터를 담는 변수
    > 원주율 값(3.14159)이나 빛의 속도(3×108m/s) 등
  - 상수 이름은 변수와 구분하기 위해 모두 대문자로 표기
  - 반드시 final 키워드로 지정
    ```java
    final double PI = 3.14; // 상수 선언 및 초기화
    ```
- 타입 변환
  - 자동
    ```javas
    double d1 = 5 * 3.14; // 정수 5를 실수 5.0으로 자동 타입 변환
    double d2 = 1; // 정수 1을 실수 1.0으로 자동 타입 변환
    ```
  - 강제
    ```java
    float f = (float)3.14; // double의 3.14를 float로 강제 타입 변환 후 대입
    byte b = (byte)300; // int의 300을 byte로 강제 타입 변환시 데이터 손실 발생
    byte x = (byte)3.14; // double의 3.14를 byte로 강제 타입 변환시 데이터 손실되어 3만 대입
    ```

## 연산자
- x + y 에서 x, y는 피연산자 +는 연산자를 의미
- 자바 가상 머신은 기본적으로 32비트 단위로 계산
  ```java
  byte b1 = 1;
  byte b2 = 2;
  byte b3 = b1 + b2; // 4byte가 되어버려 오류 발생
  byte b3 = (byte)(b1 + b2); // 강제 타입 변환시 작동
  ```
- 종류
  |연산자 종류|연산자|기능 설명|피연산자 수|
  |-|-|-|-|
  |증감|++, --|1만큼 증가 또는 감소|단항|
  |산술|+, -, *, /, %|사칙 연산과 모듈로 연산|이항|
  |시프트|>>, <<, >>>|비트를 좌우로 이동|이항|
  |부호|+, -|부호를 변환|단항|
  |비교|>, <, >=, <=, ==, !=, instanceof|데이터 값을 비교하거나 데이터 타입을 비교|이항|
  |비트|&, \|, ~, ^|비트 단위의 AND, OR, NOT, XOR|단항, 이항|
  |논리|&&, \|\|, !, ^|논리적 AND, OR, NOT, XOR|단항, 이항|
  |조건|(expr) ? x : y|expr에 따라 x또는 y로 값을 결정|삼항|
  |대입|=, +=, -=, *=, /=, &=, \|=, ^=, >>=, <<=, >>>=|오른쪽 값을 연산해 왼쪽에 대입|이항|
- 산술 연산자
  - 연산할 두 피연산자의 데이터 타입이 다르면 큰 범위의 타입으로 일치시킨 후 연산 수행
  - 논리 타입을 제외한 기초 타입을 피연산자로 사용. 단, % 연산자는 정수 타입만 사용
  - 덧셈 연산자는 문자열을 연결하는 데도 사용. 문자열과 덧셈을 하는 데이터는 먼저 문자열로 변환한 후 서로 연결
- 비교 연산자
  - 비교 연산자는 논리 타입을 제외한 기초 타입에만 사용할 수 있지만 ==와 !=는 모든 기초 타입에 사용
    |연산식|설명|
    |-|-|
    |x == y|x와 y는 같은가?|
    |x != y|x와 y가 다른가?|
    |x > y|x는 y보다 큰가?|
    |x >= y|x는 y보다 크거나 같은가?|
    |x < y|x는 y보다 작은가?|
    |x <= y|x는 y보다 작거나 같은가?|
- 논리 연산자
  - 논리 연산자는 피연산자의 조건을 결합해서 true와 false를 조사하며, 논리 타입에만 사용
    |a|b|!a|a && b|a \|\| b|a ^ b|
    |-|-|-|-|-|-|
    |false|false|true|false|false|false|
    |false|true|true|false|true|true|
    |true|false|false|false|true|true|
    |true|true|false|true|true|false|
  - &&, ||는 연산자의 앞 조건식의 결과에 따라 뒤 조건식의 실행 여부를 결정하며, 이를 쇼트서킷이라 한다.
- 비트, 시프트 연산자
  - 비트 연산자와 시프트 연산자는 정수 타입에만 사용
  - 종류
    |기호|의미|
    |-|-|
    |&|두 비트가 모두 1일 때만 1이며, 나머지는 모두 0이다|
    |\||두 비트가 모두 0일 때만 0이며, 나머지는 모두 1이다|
    |^|두 비트가 서로 다를 때는 1, 동일할 때는 0이다|
    |~|1을 0으로, 0을 1로 바꾼다|
    ```java
    System.out.printf("%x\n", 0b0101 & 0b0011); // 1
    System.out.printf("%x\n", 0b0101 | 0b0011); // 7
    System.out.printf("%x\n", 0b0101 ^ 0b0011); // 6
    System.out.printf("%x\n", (byte) ~0b00000001); // fe
    System.out.printf("%x\n", 0b0110 >> 2); // 1
    System.out.printf("%x\n", 0b0110 << 2); // 18

    int i1 = -10;
    int i2 = i1 >> 1;
    int i3 = i1 >>> 1;
    System.out.printf("%x -> %d\n", i1, i1); // ffffff6 -> -10
    System.out.printf("%x -> %d\n", i2, i2); // ffffffb -> -5
    System.out.printf("%x -> %d\n", i3, i3); // ffffffb -> 2147483643
    ```
- 대입 연산자
  - 오른쪽에 있는 연산식의 결과 값을 왼쪽에 있는 변수에 대입
    ```java
    int weight = 50;
    weight = weight + 10;
    ```
  - 복합 대입 연산자의 종류
    |연산식|설명|
    |-|-|
    |a += b|a = a + b와 동일|
    |a -= b|a = a - b와 동일|
    |a *= b|a = a * b와 동일|
    |a /= b|a = a / b와 동일|
    |a %= b|a = a % b와 동일|
    |a &= b|a = a & b와 동일|
    |a \|= b|a = a | b와 동일|
    |a ^= b|a = a ^ b와 동일|
    |a >>= b|a = a >> b와 동일|
    |a <<= b|a = a << b와 동일|
  - 부호, 증감 연산자
    - 숫자를 나타내는 기초 타입에 사용하며 피연산자의 부호를 그대로 유지하거나 반전
    - 증감 연산자는 변수의 위치에 따라 의미가 다르다
    - 종류
      |종류|설명|비고|
      |-|-|-|
      |+|부호 유지||
      |-|부호 반전||
      |++x|연산 전 x 값 중가|전위 증가|
      |x++|연산 후 x 값 중가|후위 증가|
      |--x|연산 전 x 값 감소|전위 감소|
      |x--|연산 후 x 값 감소|후위 감소|
  - 조건 연산자
    - 조건 연산자는 조건식이 true이면 결과 값은 앞 연산식의 값이 되고 false이면 결과 값은 뒤 연산식의 값이 된다
    - 조건 연산자도 쇼트서킷 로직을 이용하기 때문에 조건식에 따라 앞 연산식과 뒤 연산식 중 하나만 실행
  - 우선 순위
    |종류|설명|
    |-|-|
    |[], ., (), ++, --|배열 접근, 객체 접근, 메서드 호출, 후위 증가, 후위 감소|
    |+x, -x, ++x, --x, ~(비트), !(논리)|부호 +/-, 선위 증가, 선위 감소, 비트 부정, 논리 부정|
    |(), new|타입 변환, 객체 생성|
    |*, /, %|곱셈, 나눗셈, 모듈로|
    |+, -|덧셈, 뺄셈|
    |>>, <<, <<<|시프트|
    |>, <, >=, <=, instanceof|비교|
    |==, !=|동등 여부|
    |&|비트 AND|
    |^|비트 XOR|
    |\||비트 OR|
    |&&|조건 AND|
    |\|\||조건 OR|
    |?:|조건 연산|
    |=, +=, -=, *=, /=, &=, \|=, ^=, >>=, <<=, >>>=|대입|
  - 결합 규칙
    ```java
    x = y = z = 3; // 3을 z, y, x 순으로 대입
    z = x * y / z % 2; // 연산자의 우선순위가 모두 같으므로 순서대로 연산
    z = x++ + --y * x // y에 1을 더한 후 x를 곱한 뒤 x를 더한 값을 대입해 준 뒤 x에 1을 더한다
    ```
    
## 제어문
- 의미
  - 제어문은 실행문의 수행 순서를 변경
- 종류  
  - 조건문 : 조건에 따라 실행문을 선택을 할 때 사용
    - 단순 if 문
      ```
      if(조건식)
      {
       실행문들;
      }
      ```
    - if~else 문
      ```
      if(조건식)
      {
       실행문들;
      }
      else
      {
       실행문들;
      }
      ```
    - 다중 if 문
      ```
      if(조건식)
      {
       실행문들;
      }
      else if(조건식)
      {
       실행문들;
      }
      else if(조건식)
      {
       ...
      }
      else
      {
       실행문들;
      }
      ```
    - 중첩 if 문
      ```
      // if 문에 다른 if 문이 포함되는 것을 중첩 if 문이라고 한다
      // else 문을 사용할때 주의 필요
      if(조건식)
      {
       if(조건식)
       {
        실행문들;
       }
      }
      ```
    - switch 문
      ```
      // 0개 이상의 case 절과 0이나 1개의 default 절로 구성
      switch(연산식)
      {
       case 값:
        실행문들;
       case 값:
        실행문들;
       ...
       default:
        실행문들;
      }
      ```
  - 반복문 : 조건에 따라 같은 처리를 반복
    - 반복할 조건을 아는 경우 while 문, do~while 문 사용
      - while 문
        ```
        // 조건문이 거짓인 경우에는 작동하지 않는다
        while(조건식)
        {
         반복 실행문들;
        }
        // 조건문이 항상 참인 경우 반복문을 탈출할 실행문 필요
        // 조건문이 항상 거짓인 경우 도달하지 않는 코드라는 오류 발생
        ```
      - do~while 문
        ```
        // 조건문이 거짓인 경우에도 한번은 작동한다
        do
        {
         반복 실행문들;
        } while(조건식);
        ```
    - 반복할 횟수를 아는 경우 for 문 사용
      - for문
        ```
        // 조건문이 거짓인 경우 실행문과 증감식이 작동하지 않는다
        // 초기식, 조건식, 증감식에 아무것도 넣지 않은 경우 무한반복
        for(초기식; 조건식; 증감식)
        {
         반복 실행문들;
        }
        ```
        ```java
        for(int i = 0; i < 2; i ++)
        {
         System.out.println(i); // 0, 1을 출력한다
        }
        ```
  - 분기문
    - break 문
      ```
      while(조건식)
      {
       while(조건식)
       {
        break; // 가장 안쪽의 while 문 만 탈출한다
       }
      }
      
      out : while(조건식)
      {
       while(조건식)
       {
        break out; // out 레이블의 while 문을 탈출한다
       }
      }
      ```
    - continue 문
      ```
      while(조건식)
      {
       continue; // continue 다음의 실행문들을 건너뛴다
      }
      ```

## 문자열
- 문자열의 선언과 생성
  - 문자열 리터럴은 내부적으로 new String()을 호출해 생성한 객체
    ```
    String 변수; // String 타입의 변수 선언
    변수 = "문자열";
    // String 변수 = new String("문자열");과 같다
    ```
  - 내용이 같은 문자열 리터럴이라면 더 이상 새로운 String 객체를 생성하지 않은 채 기존 리터털을 공유
    ```java
    String s1 = "hello";
    String s2 = "hello";
    // s1과 s2는 동일한 String 객체를 가리킨다
    ```
- 문자열의 비교
  - ==와 != 연산자는 두 문자열의 내용을 비교하는 것이 아니라 동일한 객체인지 검사
  - String 클래스에서 제공하는 문자열 비교 메서드
    |메서드|설명|
    |-|-|
    |int compareTo(String s)|문자열을 사전 순으로 비교해 정수 값을 반환|
    |int compareToIgnoreCase(String s)|대소문자를 무시하고, 문자열을 사전 순으로 비교|
    |boolean equals(String s)|주어진 문자열 s와 현재 문자열을 비교한 후 true/false를 반환|
    |boolean equalsIgnoreCase(String s)|주어진 문자열 s와 현재 문자열을 대소문자 구분 없이 비교한 후 true/false를 반환|
    |char charAt(int index)|index가 지정한 문자를 반환|
    |String concat(String s)|주어진 문자열 s를 현재 문자열 뒤에 붙인다|
    |boolean contains(String s)|문자열 s를 포함하는지 조사|
    |boolean endsWith(String s)|끝나는 문자열이 s인지 조사|
    |boolean isEmpty()|문자열의 길이가 0이면 true를 반환|
    |int length()|문자열의 길이를 반환|
    |boolean startsWith(String s)|시작하는 문자열이 s인지 조사|
    |String substring(int index)|index부터 시작하는 문자열의 일부를 반환|
    |String toLowerCase()|문자열을 모두 소문자로 변환|
    |String toUpperCase()|문자열을 모두 대문자로 변환|
    |String trim()|문자열 앞뒤에 있는 공백을 제거한 후 반환|

## 배열
- 원리
  - 변수들을 연속된 집합체로 모아 놓은 것으로 동일한 이름을 사용하여 인덱스로 각 항목을 구분
  - 연속된 메모리 공간에 존재하기 때문에 관리하기 편리
- 선언과 생성
  - 배열의 선언 (실제는 배열 변수의 선언)
    ```java
    int[] scores; // 혹은 int scores[];로 선언
    // int scores[5];와 같은 선언은 불가
    ```
  - 배열의 선언과 생성 (실제는 배열 변수의 선언과 초기화)
    ```java
    int[] scores1 = new int[5]; // 5는 배열의 크기
    int[] scores2 = new int[] { 100, 90, 50, 95, 85 }; // 이처럼 선언 가능
    
    // 잘못된 방식
    int[] scores;
    scores = { 100, 90, 50, 95, 85 };
    ```
- 원소의 접근
  ```
  배열이름[인덱스];
  ```
- 배열의 크기
  - 배열이 생성될 때 배열의 크기가 결정
  - 배열의 length 필드가 배열의 크기를 나타낸다
- 다차원 배열
  - 배열의 배열
    ```java
    int[][] scores = new int[3][5]; // 2개의 대괄호는 2차원 배열을 표시
    // 3은 행의 개수, 5는 열의 개수
    ```
  - 선언과 초기화
    ```java
    int[][] scores = {{ 100, 90, 50, 95, 85 }, { 70, 60, 80, 75, 40 }, { 60, 30, 10, 80, 90 }};
    ```
- 동적 배열
  - 처리할 데이터의 개수가 고정된 경우가 아니라면 정적 배열은 자원을 낭비하거나 프로그램을 다시 컴파일
  - 자바는 크기가 유동적인 배열을 지원하기 위하여 ArrayList 클래스를 제공
  - ArrayList 객체 생성
    ```
    // 참조타입이 기초 타입이라면 integer, Long, Short, Float, Double 등을 사용
    ArrayList<참조타입> 참조변수 = new ArrayList<>();
    ```
  - ArrayList 원소 접근
    ```
    참조변수.add(데이터);
    참조변수.remove(인덱스번호);
    참조변수.get(인덱스번호);
    참조변수.size();
    ```
- 응용
  - 배열을 위한 반복문
    - for~each 반복문 : JDK 5부터 도입된 것으로 for 문을 개선한 방식. 특정 원소를 나타내기 위한 인덱스를 사용하지 않음
      ```
      // 배열_혹은_컬렉션에서 가져올 항목이 있다면 변수에 대입
      // 배열_혹은_컬렉션에서 가져올 항목이 없다면 for 문 탈출
      for (데이터타입 변수 : 배열_혹은_컬렉션)
      {
        // 실행문
      }
      ```
  - 배열 전달
    ```java
    int[] x = new int[] { 0, 1, 2, 3, 4 };

    public increment(int[] n)
    {
      n[0] = 1;
    }

    increment(x); // x[0]의 값이 1로 변경
    ```
  - 가변 개수 인수
    - JDK 5부터는 메서드에도 데이터 타입이 같은 가변 개수(variable length)의 인수를 전달 가능
    - 한 개의 가변 개수 매개변수만 사용 가능하며 가변 개수 매개변수는 마지막에 위치
    - 가변 개수 인수를 가진 메서드를 호출하면 내부적으로 배열을 생성하여 처리
    ```java
    int[] x = new int[] { 0, 1, 2, 3, 4 };
  
    void printN(int... n)
    {
      for(int a : n) System.out.println(a);
    }

    printN(x); // x값을 순서대로 출력
    ```
  - 객체의 배열
    - 객체 배열은 객체를 참조하는 주소를 원소로 구성
      ```java
      Ball[] balls = new Ball[5]; // 5개의 Ball 객체를 생성하는 것이 아닌 참조할 변수를 준비
      ```
    - 생성자를 호출하여 Ball 객체를 생성해야 함
      ```java
      Ball[] balls = new Ball[5];

      for (int i = 0; i < 3; i++) balls[i] = new Ball();
      ```
  - 매개변수로 객체 전달
    - 메서드의 인자로 객체를 받는 경우에도 전달 가능

## 객체 지향
- 객체의 개념
  - 소프트웨어 객체는 현실 세계의 객체를 필드와 메서드로 모델링한 것
  - 소프트웨어 객체는 상태를 필드(Field)로 정의하고, 동작을 메서드(Method)로 정의.
  - 필드는 객체 내부에 선언된 변수를 의미하고, 메서드는 객체 내부에 정의된 동작
- 절차 지향 프로그래밍
  - 일련의 동작을 순서에 맞추어 단계적으로 실행하도록 명령어를 나열
  - 데이터를 정의하는 방법보다는 명령어의 순서와 흐름에 중점
  - 수행할 작업을 예상할 수 있어 직관적인데, 규모가 작을 때는 프로그래밍과 이해하기가 용이
  - 소프트웨어는 계산 위주이므로 절차 지향 프로그래밍이 적합
- 객체 지향 프로그래밍
  - 프로그램 구현에 필요한 객체를 파악하고 각각의 객체들의 역할이 무엇인지를 정의하여 객체들 간의 상호작용을 통해 프로그램을 만드는 것
  - 현실 세계를 객체 단위로 프로그래밍하며, 객체는 필드(데이터)와 메서드(코드)를 하나로 묶어 표현
- 특징
  - 캡슐화(정보 은닉) : 관련된 필드와 메서드를 하나의 캡슐처럼 포장해 세부 내용을 외부에서 알 수 없도록 감추는 것
  - 상속 : 자녀가 부모 재산을 상속받아 사용하듯이 상위 객체를 상속받은 하위 객체가 상위 객체의 메서드와 필드를 사용하는 것
  - 다형성 : 대입되는 객체에 따라서 메서드를 다르게 동작하도록 구현, 실행 도중 동일한 이름의 다양한 구현체 중에서 메서드를 선택 가능
      
## 메서드
- 필요성
  - 중복 코드를 줄이고 코드를 재사용할 수 있다
  - 코드를 모듈화해 가독성을 높이므로 프로그램의 품질을 향상시킨다
- 구조
  ```java
  // public : 접근 지정자
  // static : 객체를 생성하지 않고 실행할 수 있다
  // int : 반환 타입
  // sum : 메서드 이름
  // int i1, int i2 : 매개변수 목록
  public static int sum(int i1, int i2)
  {
    return i1 + i2; // i1 + i2의 타입과 반환 타입이 일치해야 한다.
  }
  ```
  - 메서드의 호출과 반환
    - 메서드를 호출하면 제어가 호출된 메서드(callee)로 넘어갔다가 실행을 마친 후 호출한 메서드(caller)로 다시 돌아온다.
    - return 문을 사용하면 메서드의 실행 도중에도 호출한 메서드로 제어를 넘길 수 있다.
  - 값 전달
    ```java
    int x = 0;
    increment(x);

    public static void increment(int n)
    {
      n++;
    }
    // increment() 메서드 호출 전 x는 0
    // increment() 메서드 시작할 때 n은 0
    // increment() 메서드 끝날 때 n은 1
    // increment() 메서드 호출 후 x는 0
    ```
  - 메서드 시그너처
    - 메서드 이름과 매개변수의 개수, 데이터 타입, 순서를 의미
    - 메서드 이름은 같지만 메서드 시그니처가 다른 메서드를 정의하는 것을 메서드 오버로딩(Method Overloading)이라고 한다.

## 클래스
- 선언과 객체 생성
  - 추상화
    - 현실 세계의 객체는 수많은 상태가 있고 다양한 동작을 하지만, 클래스에 모두 포함하기는 어렵기에 추상화(Abstraction)하는 과정이 필요
    - 추상화는 현실 세계의 객체에서 불필요한 속성을 제거하고 중요한 정보만 클래스로 표현하는 일종의 모델링 기법
    - 사람마다 추상화하는 기법이 같지 않으므로 각 개발자는 클래스를 다르게 정의 가능
  - 선언
    ```java
    // class : 클래스 키워드
    // ReturnN : 클래스 이름으로 소스 파일 이름과 동일해야 한다
    // 필드 : 객체의 속성을 나타낸다
    // 메서드 : 객체의 동작을 나타낸다
    public class ReturnN
    {
      int n = 0; // 필드
  
      int getN() // 메서드
      {
        return n;
      }
    }
    ```
    - 보통 소스 파일마다 하나의 클래스를 선언하지만, 2개 이상의 클래스를 하나의 파일로 선언 가능
    - 하나의 파일에 클래스가 둘 이상 있다면 하나만 public으로 선언할 수 있고, 해당 클래스 이름은 소스 파일 이름과 동일해야 함
  - 객체 생성과 참조 변수
    ```
    클래스이름 변수; // 클래스는 참조 타입이므로 참조 변수 또는 참조 타입 변수라고 한다
    변수 = new 클래스이름(); // 클래스이름()을 생성자라고 한다
    // 변수를 생략하거나 한 문장으로 변수 선언과 객체 생성 또한 가능하다
    ```
- 구성 요소와 멤버 접근
  - 구성 요소
    - 멤버(필드, 메서드)
    - 생성자
    > 지역 변수는 메서드 내부에 선언된 변수. 매개 변수도 일종의 지역 변수이다
  - 필드와 지역 변수의 차이
    - 필드는 기본 값이 있지만, 지역 변수는 기본 값이 없어 반드시 초기화
    - 필드는 클래스 전체에서 사용할 수 있지만, 지역 변수는 선언된 블록 내부의 선언된 후에서만 사용 가능
    - 필드와 달리 지역 변수는 final로만 지정 가능
  - 클래스 내부에서 멤버 접근
    ```
    this.필드 // 또는 필드로 사용
    this.메서드 // 또는 메서드로 사용
    ```
  - 외부에서 멤버 접근
    ```java
    // myCircle : 사용하려는 외부 객체 이름
    // . : 객체와 객체 멤버를 연결하는 연산자
    // radius : 필드 이름
    // findArea : 메서드 이름
    myCircle.radius; // 인스턴스 변수
    myCircle.findArea(); // 인스턴스 메서드
    ```
- 자식 클래스와 부모 생성자
  - 자식 생성자를 호출하면 부모 생성자도 자동으로 호출
    > 부모 생성자가 없는 경우 에러 발생
  - 자식 생성자는 첫 행에 부모 생성자 호출 코드가 있음
    > 없다면 컴파일러가 super(); 코드를 추가
  - 자식 생성자의 첫 행에 인위적 부모 생성자 호출
    > 반드시 첫행에 나타나야 한다
  - 상속과 접근 제어
    - 접근 지정자의 접근 범위
      |접근 지정자|동일 클래스|다른 패키지|자식 클래스|전체|
      |-|-|-|-|-|
      |public|접근 가능|접근 가능|접근 가능|접근 가능|
      |protected|접근 가능|접근 가능|접근 가능|접근 불가|
      |default|접근 가능|접근 가능|접근 불가|접근 불가|
      |private|접근 가능|접근 불가|접근 불가|접근 불가|
    - 접근 지정자 사용 시 주의 사항
      - private 멤버는 자식 클래스에 상속되지 않는다
      - 클래스 멤버는 어떤 접근 지정자로도 지정할 수 있지만, 클래스는 protected와 private로 지정할 수 없다
      - 메서드를 오버라이딩할 때 부모 클래스의 메서드보다 가시성을 더 좁게 할 수는 없다
     
## 클래스와 메서드
- final 클래스와 메서드
  - final 클래스
    - 더 이상 상속될 수 없는 클래스
    - 대표적인 final 클래스로는 String 클래스
  - final 메서드
    - final 클래스는 내부의 모든 메서드를 오버라이딩할 수 없으므로, 특정 메서드만 오버라이딩하지 않도록 하려면 final 메서드로 선언
- 추상 클래스와 메서드
  - 추상 메서드
    - 메서드 본체를 완성하지 못한 메서드로 무엇을 할지는 선언할 수 있지만, 어떻게 할지는 정의할 수 없음
  - 추상 클래스
    - 보통 하나 이상의 추상 메서드를 포함하지만 없을 수도 있음
    - 주로 상속 계층에서 자식 멤버의 이름을 통일하기 위하여 사용
    - 인스턴스를 생성할 수 없음
  - 추상 클래스 선언
    ```
    // abstract : 추상 클래스라는 것을 나타냄
    abstract class 클래스이름
    {
      // 필드
      // 생성자
      // 메서드 (일반적으로 하나 이상의 추상 메서드를 포함)
    }
    ```
  - 추상 메서드 선언
    ```
    // abstract : 추상 메서드라는 것을 나타냄
    abstract 반환타입 클래스이름(); // 메서드 본체가 없으며 세미콜론으로 끝나야 함
    ```

## 정적 멤버
- 인스턴스 멤버와 정적 멤버
  - 자바는 static 키워드로 클래스의 필드를 공유할 수 있도록 지원
  - 인스턴스 변수 : static 키워드로 지정되지 않아 공유되지 않은 필드로 인스턴스마다 자신의 필드를 생성
  - 정적 변수 혹은 클래스 변수 : static 키워드로 지정하여 모든 인스턴스가 공유하는 필드
  - 인스턴스 변수는 객체별로 관리. 객체를 생성할 때 인스턴스 변수도 객체가 소멸될 때는 자동으로 소멸
  - 정적 변수는 클래스 로더가 클래스를 메서드 영역에 적재할 때 생성
  - 정적 메서드의 유의 사항
    - 객체와 관련된 인스턴스 변수를 사용할 수 없다.
    - 객체와 관련된 인스턴스 메서드를 호출할 수 없다.
    - 객체 자신을 가리키는 this 키워드를 사용할 수 없다.
- 정적 멤버의 활용
  ```
  // 정적 멤버는 일반적으로 클래스 이름과 연결해서 사용한다
  클래스이름.정적변수이름;
  클래스이름.정적메서드이름();
  ```
  - 상수는 변경되지 않는 변수이기 때문에 final 키워드로 지정하지만 final로만 지정하면 객체마다 자신의 기억 공간을 차지
  - 상수는 값이 변경되지 않으므로 객체마다 따로 기억 공간을 할당할 필요가 없다. 따라서 static final로 지정해서 선언
  ```
  // static : 모든 객체가 공유한다
  // final : 초깃값이 대입되면 더 이상 수정할 수 없다
  static final 데이터형 상수 = 초깃값;
  ```
- 정적 블록  
  정적 변수의 초기화 과정이 for 문이나 오류 처리처럼 복잡하다면 과정이 간단하지 않다. 대신에 정적 변수의 초기화가 복잡할 때는 다음과 같이 정적 블록을 사용할 수 있다.
  ```
  static String name = "민국";
  static
  {
    name = "만국";
  }
  // name을 호출할 경우 "만국"이 호출된다
  ```
    
## 타입 변환과 다형성
- 객체의 타입 변환
  - 참조 타입인 객체도 기초 타입 데이터처럼 타입 변환 가능
  - 상속 관계일 경우만 타입 변환 가능
  - 객체 타입 변환도 자동 타입 변환과 강제 타입 변환이 있다
- 타입 변환
  ```java
  public class Person
  {
    String name = "사람";

    void whoami()
    {
      System.out.println("나는 사람이다");
    }
  }
  ```
  ```java
  public class Student extends Person
  {
    int number = 7;

    void work()
    {
      System.out.println("나는 공부한다");
    }
  }
  ```
  - 자동 타입 변환
    ```java
    Student s = new Student();
    Person p = s; // 자동으로 타입 변환 p = (Person)s와 동일
    // p.number = 1;
    // p.work();
    // number와 work()는 부모 타입에 없는 멤버이므로 부모 타입 변수에서 볼 수 없다
    p.whoami(); // Person 타입 멤버이므로 호출 가능
    ```
  - 강제 타입 변환
    ```java
    // 오류 발생
    Person p = new Person();
    Student s = (Student)p;
    
    // 강제 타입 변환 가능
    Student s1 = new Student();
    Person p1 = s1;
    Student s2 = (Student)p1; // 부모 타입 변수지만 자식 객체를 가리킨다
    ```
- 타입 변환된 객체의 구별
  ```
  // 변수 : 객체를 참조하는 변수
  // instanceof : boolean 값을 반환
  // 타입 : 클래스 이름 혹은 인터페이스 이름
  변수 instanceof 타입
  ```
- 타입 변환을 이용한 다형성
  ```java
  static void downcast1(Person p) { } // 인자로 Person 타입과 Student 타입 모두 받는 게 가능
  static void downcast2(Student t) { } // 인자로 Student 타입만 받는 게 가능
  ```
    
## 접근자와 설정자와 생성자
- 접근자와 설정자
  - 클래스 내부에 캡슐화된 멤버를 외부에서 사용하기 위해 사용
  - private으로 지정된 필드에 값을 반환하는 접근자와 값을 변경하는 설정자는 공개된 메서드
  - 일반적으로 접근자는 get, 설정자는 set으로 시작하는 이름을 사용
  - 필드 이름을 외부와 차단해서 독립시키기 때문에 필드 이름 변경이나 데이터 검증도 가능
- 생성자의 의미와 선언
  - 역할
    - 객체를 생성하는 시점에서 필드를 다양하게 초기화
  - 선언 방식
    ```
    클래스이름(...) {...} // 일반적으로 public으로 선언하지만 아닐 수도 있다
    ```
    - 생성자 이름은 클래스 이름과 같다.
    - 생성자의 반환 타입은 없다.
    - 생성자는 new 연산자와 함께 사용하며, 객체를 생성할 때 호출한다.
    - 생성자도 오버로딩할 수 있다
  - 사용 방식
    ```
    클래스이름 변수 = new 클래스이름(); // 클래스이름()을 생성자라고 한다
    ```
- 기본 생성자
  - 모든 클래스는 최소한 하나의 생성자가 있음
  - 만약 생성자를 선언하지 않으면 컴파일러가 자동으로 기본 생성자(Default Constructor)를 추가
  - 기본 생성자는 매개변수도 없고 본체에서 실행할 내용도 없는 생성자
- 생성자 오버로딩
  - 생성자도 메서드처럼 오버로딩(Overloading) 가능
- this와 this()
  - this
    ```java
    class Square
    {
      private double side; // 멤버 필드

      public void setRadius(double side)
      {
        this.side = side; // 매개변수 = 멤버 필드의 형식이다
      }
    }
    ```
  - this()
    ```java
    class Circle
    {
      private double radius; // 멤버 필드

      public Circle(double radius)
      {
        this.radius = radius; // 매개변수 = 멤버 필드의 형식이다
      }

      public Circle()
      {
        this(2.0); // 같은 클래스의 다른 Circle() 생성자를 호출해 매개변수로 2.0을 넣는다
      }
    }
    ```
- 연속 호출
  ```java
  // 반환 타입이 void인 setName(String name), setAge(), sayHello()라는 메서드를 가진 Person 클래스가 있다고 가정
  Person person = new Person();
  person.setName("민국");
  person.setAge(21);
  person.sayHello();
  // 메서드를 호출할 때마다 새로운 실행문을 사용해야 하므로 번거롭고 가독성도 떨어진다

  // setName()과 setAge()의 반환 타입이 this라면
  person.setName("민국").setAge(21).sayHello(); // 한번에 호출이 가능하다
  ```
  
## 입출력
- 화면에 데이터 출력
  - println() : () 내부의 내용을 출력한 후 행을 바꾼다
  - print() : () 내부의 내용을 출력만 하고 행은 바꾸지 않는다
  - printf() : 포맷을 지정해서 출력
    - 정수
      |포맷 명시자|형식|비고|
      |-|-|-|
      |%d|10진수||
      |%o|8진수||
      |%x|16진수||
      |%c|문자||
      |%5d|5자리|빈자리는 공백 처리|
      |%-5d|5자리|빈자리는 공백 처리, 왼쪽 정렬|
      |%05d|5자리|빈자리는 0으로 채운다|
    - 문자열
      |포맷 명시자|형식|비고|
      |-|-|-|
      |%s|문자열||
      |%5s|5자리|빈자리는 공백 처리|
      |%-5s|5자리|빈자리는 공백 처리, 왼쪽 정렬|
    - 실수
      |포맷 명시자|형식|비고|
      |-|-|-|
      |%f|10진수||
      |%e|지수||
      |%4.1f|4자리|소수점 이하 1자리|
      |%-4.1f|4자리|소수점 이하 1자리, 왼쪽 정렬|
      |%04.1f|4자리|소수점 이하 1자리, 빈자리는 0으로 채운다|
    ```java
    // 기본 형식
    // System.out.printf("포맷 명시자", 데이터, 데이터, ...);

    int x = 5;
    double pi = 3.14;

    System.out.printf("x = %d and pi = %f\n", x, pi); // %d와 %f는 포맷 명시자이며, 각각 x와 pi가 대응
    ```
- 키보드로 데이터 입력
  - 프로그램의 첫 행에 다음을 추가해 Scanner 클래스의 경로 이름을 컴파일러에 알림
    ```java
    import java.util.Scanner;
    ```
  - 키보드로 데이터를 입력받기 위해 System.in 객체와 연결된 Scanner 객체를 생성
    ```java
    Scanner in = new Scanner(System.in);
    ```
  - Scanner 클래스가 제공하는 다양한 메서드를 이용해 키보드로 데이터를 입력받음
    ```java
    int x = in.nextInt(); // 정수를 읽어 변수 x에 대입
    ```
  - Scanner 클래스가 제공하는 데이터 입력 메서드
    |메서드|타입|
    |-|-|
    |next()|String|
    |nextByte()|byte|
    |nextShort()|short|
    |nextInt()|int|
    |nextLong()|long|
    |nextFloat()|float|
    |nextDouble()|double|
    |nextLine()|String|
- 파일 입출력
  - 스트림(stream)
    - 스트림은 데이터를 송수신하기 위한 통로의 개념
    - 입력 혹은 출력, 한쪽 방향으로만 진행
    - 스트림은 1바이트를 처리하는 바이트 스트림과 2바이트를 처리하는 문자 스트림으로 나뉜다
      - 바이트 스트림
        |종류|클래스|
        |-|-|
        |InputStream|FileInputStream, PipedInputStream, FilterInputStream, ByteArrayInputStream, SequenceInputStream, StringBufferInputStream, ObjectInputStream, BufferedInputStream, DataInputStream, LintNumberInputStream, PushbackInputStream|
        |OutputStream|FileOutputStream, PipedOutputStream, FilterOutputStream, ByteArrayOutputStream, ObjectOutputStream, BufferedOutputStream, DataOutputStream, PrintStream|
        - FileInputStream및 FileOutputStream
          - 시스템에 있는 모든 파일을 읽거나 쓸 수 있는 기능 제공
          - 생성자로 스트림 객체를 생성할 때는 FileNotFoundException 예외 가능성이 있기 때문에 반드시 예외 처리 필요
        - BufferedInputStream및 BufferedOutputStream
          - 버퍼는 스트림과 프로그램 간에 데이터를 효율적으로 전송하려고 사용하는 메모리
          - 입출력 장치와 프로그램 간 동작 속도가 크게 차이가 날 때 버퍼를 사용하면 매우 효율적
        - DataInputStream및 DataOutputStream
          - 각각 기초 타입 데이터를 읽는 메서드와 기초 타입 데이터를 기록하는 메서드를 사용할 수 있는 스트림
          - 직접 키보드에서 데이터를 입력받거나 콘솔 뷰에 데이터를 출력하기에는 부적합
          - FileInputStream및 FileOutputStream등 다른 스트림과 연결해서 파이프라인을 구성해 사용
        - PrintStream
          - 다양한 데이터 값을 편리하게 표현할 수 있도록 출력 스트림에 기능을 추가한 스트림
          - IOException을 발생하지 않음
          - 자동 플러시 기능을 제공해 flush() 메서드를 호출하지 않고도 버퍼를 비울 수 있음
          - System.out객체의 println(), print(), printf() 메서드는 PrintStream으로 출력
        - 주요 메서드
          - InputStream
            |메서드|설명|
            |-|-|
            |int avaliable()|읽을 수 있는 바이트의 개수를 반환|
            |void close()|입력 스트림을 닫음|
            |abstract int read()|1바이트를 읽음|
            |int read(byte b[])|1바이트씩 읽어 b[]에 저장한 후 읽은 개수를 반환|
            |int read(byte b[], int off, int len)|len만큼 읽어 b[]의 off 위치에 저장한 후 읽은 개수 반환|
            |long skip(long n)|입력 스트림을 n바이트 만큼 건너뜀|
          - OutputStream
            |메서드|설명|
            |-|-|
            |void close()|출력 스트림을 닫음|
            |void flush()|출력하기 위해 버퍼를 비움|
            |abstract void write(int b)|b 값을 바이트로 변환해서 씀|
            |void write(byte b[])|b[] 값을 바이트로 변환해서 씀|
            |void write(byte b[], int off, int len)|b[] 값을 바이트로 변환해서 off 위치부터 len 만큼 씀|
          - InputStream과 OutputStream
            - read() 메서드의 반환 값은 0~255의 ASCII 값이며, 더 이상 읽을 데이터가 없을 때는 -1을 반환
            - read() 메서드는 int 타입을 반환
            - write() 메서드에서 인수가 배열일 때는 byte[], 배열이 아닐 때는 int 타입
            - 대부분의  운영체제나 JVM은 표준 출력 장치를 효율적으로 관리하려고 버퍼를 사용
            - BufferedStream이 아니지만 System.out은 표준 출력이므로 버퍼를 사용
            - System.out을 사용해 출력할 때는 버퍼를 비우기 위하여 flush() 호출 필요
      - 문자 스트림
        |종류|클래스|
        |-|-|
        |InputStream|BufferedReader, CharArrayReader, InputStreamReader, FilterReader, PipedReader, StringReader, FileReader, LintNumberReader, PushbackReader|
        |OutputStream|BufferedWriter, CharArrayWriter, OutputStreamWriter, FilterWriter, PipedWriter, StringWriter, FileWriter|
        - 기초
          - Reader와 Writer는 객체를 생성할 수 없는 추상 클래스이기 때문에 Reader와 Writer의 자식인 구현 클래스를 사용
          - FileReader와 FileWriter는 파일 입출력 클래스로, 파일에서 문자 데이터를 읽거나 파일에 문자 데이터를 저장할 때 사용
          - InputStreamReader및 OutputStreamWriter는 바이트 스트림과 문자 스트림을 연결하는 브리지 스트림으로 사용
          - BufferedReader와 BufferedWriter는 데이터를 효율적으로 전송하려고 버퍼로 처리할 때 사용
        - Reader와 Writer
          - 추상 메서드인 read(), close()와 write(), flush(), close()를 각각 포함하는 추상 클래스
          - 문자 스트림 클래스가 제공하는 주요 메서드
          - Reader
            |메서드|설명|
            |-|-|
            |abstract void close()|입력 스트림을 닫음|
            |int read()|1개의 문자를 읽음|
            |int read(char[] cbuf)|문자 단위로 읽어 cbuf[]에 저장한 후 읽은 개수 반환|
            |abstract int read(char cbuf[], int off, int len)|len만큼 읽어 cbuf[]의 off 위치에 저장한 후 읽은 개수를 반환|
            |long skip(long n)|입력 스트림을 닫고 관련된 모든 지원을 반납|
          - Writer
            |메서드|설명|
            |-|-|
            |abstract void close()|스트림을 닫고 관련된 모든 자원 반납|
            |abstract void flush()|버퍼의 내용 비움|
            |void write(int c)|c값을 char로 변환해 출력 스트림에 씀|
            |void write(char cbuf[])|cbuf[] 값을 char로 변환해 출력 스트림에 씀|
            |abstract void write(char cbuf[], int off, int len)|cbuf[] 값을 char로 변환해 off부터 len만큼 출력 스트림에 씀|
            |void wrute(String str)|문자열 str을 출력 스트림에 씀|
      - FileReader와 FileWriter
        - 시스템에 있는 모든 문자 파일을 읽거나 파일에 쓸 수 있는 기능을 제공
        - 생성자로 스트림 객체를 생성할 때는 FileNotFoundException 예외 처리 필요
      - BufferedReader및 BufferedWriter
        - 스트림의 효율을 높이려고 버퍼를 사용
        - 추가된 주요 메서드
          |메서드|설명|
          |-|-|
          |Stream(String) lines()|읽은 행을 스트림으로 반환|
          |String readLine()|한 행을 읽어 문자열로 반환|
      - InputStreamReader및 OutputStreamReader
        - 바이트 기반의 InputStream과 OutputStream을 포장해 문자 기반의 Reader와 Writer로 변환하는 클래스
      - PrintWriter
        - PrintStream처럼 다양한 데이터 값을 편리하게 표현할 수 있도록 출력 스트림에 기능을 추가한 Writer의 자식 클래스
    - 한글은 2바이트이므로 문자 스트림을 사용하는 것이 더 편리
  - 파일 관리
    - 입출력 스트림은 파일이나 장치를 읽거나 쓰기 위해 사용
    - 입출력 스트림으로 파일을 생성하거나 삭제하거나 이름을 변경하는 등 관리 기능은 없음
    - 자바는 파일을 관리하기 위해 File 클래스, Path 인터페이스, Files 클래스, Paths 클래스를 제공
      - File 클래스
        - 파일이나 폴더의 경로를 추상화한 클래스로 java.io 패키지에 포함
        - 파일 유무, 삭제, 접근 권한 조사 등을 수행
        - 생성자
          |생성자|설명|
          |-|-|
          |File(File parent, String child)|parent 객체 폴더의 child라는 File 객체 생성|
          |File(String pathname)|pathname에 해단하는 File 객체 생성|
          |File(String parent, String child)|parent 폴더에 child라는 File 객체 생성|
          |File(URI uri)|uri 경로에서 File 객체 생성|
        - 주요 메서드
          |메서드|설명|
          |-|-|
          |boolean canExecute()|실행 하능한 파일인지 여부 반환|
          |boolean canRead()|읽을 수 있는 파일인지 여부 반환|
          |boolean canWrite()|쓸 수 있는 파일인지 여부 반환|
          |boolean createNewFile()|파일을 새로 생성하면 true, 아니면 false 반환|
          |boolean delete()|파일을 삭제하면 true, 아니면 false 반환|
          |boolean exists()|파일의 존재 유무 반환|
          |String getAbsolutePath()|파일의 절대 경로 반환|
          |String getName()|파일의 이름 반환|
          |String getPath()|파일의 경로 반환|
          |boolean isDirectory()|폴더 존재 유무 반환|
          |boolean isFile()|파일 존재 유무 반환|
          |long lastModified()|파일의 마지막 수정 시간 반환|
          |long length()|파일의 크기 반환|
          |String[] list()|모든 자식 파일과 폴더를 문자열 배열로 반환|
          |File[] listFiles()|모든 자식 파일과 폴더를 File 배열로 반환|
          |boolean mkdir()|폴더를 생성하면 true, 아니면 false 반환|
          |Path toPath()|파일 경로에서 구성한 Path 객체 반환|
      - Path 인터페이스
        - 운영체제에 따라 일관성 없이 동작하는 File클래스를 대체
        - 기존 File 객체도 File 클래스의 toPath() 메서드를 이용해 Path 객체로 변환 가능
        - Path 인터페이스의 구현 객체는 파일 시스템에서 경로를 의미
        - java.nio.file 패키지에 포함
        - 주요 메서드
          |메서드|설명|
          |-|-|
          |Path getFileName()|객체가 가리키는 파일(폴더) 이름 반환|
          |FileSystem getFileSystem()|객체를 생성한 파일 시스템 반환|
          |int getNameCount()|객체가 가리키는 경로의 구성 요소 개수 반환|
          |Path getParent()|부모 경로를 반환하며, 없으면 null 반환|
          |Path getRoot()|루트를 반환하며, 없으면 null 반환|
          |boolean isAbsolute()|절대 경로 여부 반환|
          |Path isAbsolutePath()|절대 경로를 나타내는 객체 반환|
          |URI toUri()|객체가 가리키는 경로에서 URI 반환|
      - Paths 클래스
        - 정적 메서드
          ```
          Path get(String first, String... more);
          ```
      - Files 클래스
        - 파일 연산을 수행하는 정적 메서드로 구성된 클래스
        - java.nio.file 패키지에 포함
        - 주요 메서드
          |메서드|설명|
          |-|-|
          |long copy()|파일을 복사한 후 복사된 바이트 개수 반환|
          |Path copy()|파일을 복사한 후 복사된 경로 반환|
          |Path createDirectory()|폴더 생성|
          |Path createFile()|파일 생성|
          |void delete()|파일 삭제|
          |boolean deleteIfExists()|파일이 있으면 삭제|
          |boolean exists()|파일의 존재 유무 조사|
          |boolean isDirectory()|폴더인지 조사|
          |boolean isExecutable()|실행 가능한 파일인지 조사|
          |boolean isHidden()|숨김 파일인지 조사|
          |boolean isReadable()|읽기 가능한 파일인지 조사|
          |boolean isWritable()|쓰기 가능한 파일인지 조사|
          |Path move()|파일 이동|
          |boolean notExists()|파일(폴더)의 부재 조사|
          |byte[] readAllBytes()|파일의 모든 바이트를 읽어 배열로 반환|
          |List(String) readAllLines()|파일의 모든 행을 읽어 리스트로 반환|
          |long size()|파일의 크기 반환|
          |Path write()|파일에 데이터를 씀|
        - 주요 정적 메서드
          - JDK 1.8부터 사용 가능하며 IOException을 던질 수 있음
          - 입출력 스트림을 생성하기 위한 메서드
            - InputStream newInputStream(Path path, OpenOption... options)
            - OutputStream newOutputStream(Path path, OpenOption... options)
            - BufferedReader newBufferedReader(Path path)
            - BufferedReader newBufferedReader(Path path, Charset cs)
            - BufferedWriter newBufferedWriter(Path path, OpenOption... options)
            - BufferedWriter newBufferedWriter(Path path, Charset cs, OpenOption... options)
          - 기타
            - List<String> readAllLines(Path path)
    - 스트림 얻기
      - BufferedReader 클래스의 lines() 메서드를 이용하여 스트림을 생성
      - Files 클래스의 정적 메서드를 사용해 파일이나 폴더의 내용을 행 단위로 읽을 수 있는 스트림 생성
      - Files 클래스가 스트림을 반환하는 제공하는 정적 메서드
        |메서드|설명|
        |-|-|
        |Stream(String) lines(Path path)|기본 문자집합을 이용해 파일의 모든 행을 스트림으로 반환|
        |Stream(String) lines(Path path, Charset cs)|주어진 문자집합을 이용해 파일의 모든 행을 스트림으로 반환|
        |Stream(Path) list(Path dir)|서브 폴더를 제외한 폴더에 들어 있는 모든 원소를 스트림으로 반환|
        |Stream(Path) walk(Path start)|서브 폴더를 포함한 폴더에 들어 있는 모든 원소를 스트림으로 반환|

## 디버깅
- 오류의 종류
  - 문법 오류
    > 실행문을 세미콜론으로 마쳐야 한다
  - 내용 오류
    > n의 2배를 구하려 할때 n * n을 진행한 경우
  - 연산이 불가능한 경우
    > n / 0의 경우 n을 0으로 나눌수 없다
- 이클립스를 이용한 디버깅 과정
  - 이클립스는 에디터 뷰에 문법 오류는 알려주지만 논리 오류는 알려주지 않는다.
  - 논리 오류는 프로그램 실행 도중에 변수 상태를 추적하는 것이 가장 기본적인 오류 점검 방식
- 디버깅 명령어와 이클립스 단축키
  |명령어|단축키|설명|
  |-|-|-|
  |Step Into|F5|한 행씩 실행하며, 메서드를 만나면 내부로 진입|
  |Step Over|F6|한 행씩 실행하며, 메서드를 만나도 내부로 진입하지 않음|
  |Run to Line|Ctrl + R|다음 중단점까지 프로그램을 실행|
  |Resume|F8|중단된 프로그램을 다시 실행|
  |Terminate|Ctrl + F2|프로그램 종료|

## 상속
- 필요성
  - 공통적인 성분을 부모 클래스에서 한번만 정의하기 때문에 코드가 간결하고 편리
- 상속과 클래스 멤버
  - 자식 클래스는 부모 클래스에서 물려받은 멤버를 그대로 사용하거나 변경할 수 있고, 새로운 멤버 추가 가능
  - 자식 클래스는 대체로 부모 클래스보다 속성이나 동작이 더 많음
- 클래스 상속
  - 부모· 자식 클래스의 관계
    - is-a (상속 관계)
      > a는 b이다
    - has-a (소유 관계)
      > a는 b가 있다
  - 상속의 선언
    extends 키워드 사용하며, 다중 상속 불가
    ```java
    // 부모 클래스
    class SuperClass
    {
      // 필드
      // 메서드
    }
    ```
    ```java
    // 자식 클래스
    class SubClass extends SuperClass // extends SuperClass, SuperClass2와 같이 다중 상속 불가
    {
      // 필드
      // 메서드
    }
    ```
  
## 메서드 오버라이딩
- 의미  
  - 물려받은 메서드를 자식 클래스에게 맞도록 수정하는 것
- 규칙
  - 부모 클래스의 메서드와 동일한 시그너처를 사용, 반환 타입까지 동일해야 한다
  - 부모 클래스의 메서드보다 접근 범위를 더 좁게 수정할 수 없다
  - 추가적인 예외(Exception)가 발생할 수 있음을 나타낼 수 없다
- 오버라이딩 불가
  - private 메서드 : 부모 클래스 전용이므로 자식 클래스에 상속되지 않는다
  - 정적 메서드 : 클래스 소속이므로 자식 클래스에 상속되지 않는다
  - final 메서드 : final 메서드는 더 이상 수정할 수 없으므로 자식 클래스가 오버라이딩할 수 없다
- 부모 클래스의 멤버 접근
  - 자식 클래스가 메서드를 오버라이딩하면 자식 객체는 부모 클래스의 오버라이딩된 메서드를 숨김
  - 숨겨진 메서드를 호출하려면 super 키워드를 사용한다.
  - super는 현재 객체에서 부모 클래스의 참조를 의미
- 오버라이딩과 오버로딩의 차이
  |비교 요소|메서드 오버라이딩|메서드 오버로딩|
  |-|-|-|
  |메서드 이름|동일|동일|
  |매개변수|동일|다름|
  |반환 타입|동일|무관|
  |상속 관계|필요|필요 없음|
  |예외와 접근 범위|제약|제약 없음|
  |바인딩|호출할 메서드를 실행 중 결정하는 동적 바인딩|호출할 메서드를 컴파일할 때 결정하는 정적 바인딩|

## 패키지
- 의미
  - 파일 시스템의 폴더를 이용하며 클래스 파일을 묶어서 관리하기 위한 수단
- 장점
  - 패키지마다 별도의 이름 공간(Namespace)이 생기기 때문에 클래스 이름의 유일성을 보장
  - 클래스를 패키지 단위로도 제어할 수 있기 때문에 좀 더 세밀하게 접근 제어
- 대표적인 패키지
  - java.lang 패키지는 import 문을 선언하지 않아도 자동으로 임포트되는 자바의 기본 클래스를 모아 둔 것
  - java.awt 패키지는 그래픽 프로그래밍에 관련된 클래스를 모아 둔 것
  - java.io 패키지는 입출력과 관련된 클래스를 모아 둔 것
- 선언
  - 주석문을 제외하고 반드시 첫 라인에 위치
  - 패키지 이름은 모두 소문자로 명명하는 것이 관례
  - 일반적으로 패키지 이름이 중복되지 않도록 회사의 도메인 이름을 역순으로 사용
    > package com.hankuk.people;의 형식으로 선언 및 명명
- 사용
  다른 패키지에 있는 공개된 클래스를 사용하려면 패키지 경로를 컴파일러에게 알려줘야 한다
  > 패키지이름.클래스의 형태로 사용
- import 문
  - 패키지의 경로를 미리 컴파일러에게 알려주는 문장
    > import 패키지이름.클래스와 같이 사용
  - import 문은 소스 파일에서 package 문과 첫 번째 클래스 선언부 사이에 위치
    > import 패키지이름.*을 사용한 경우 패키지이름에 포함된 모든 클래스를 뜻한다
- 정적 import 문
  - 패지키 단위로 임포트하지 않고 패키지 경로와 정적 메서드를 함께 임포트
  - import static 을 사용하여 클래스명 없이 바로 사용, 클래스 내에 동일한 이름의 메소드가 있으면 클래스의 메소드가 우선

## 인터페이스
- 장점
  - 인터페이스만 준수하면 통합에 신경 쓰지 않고 다양한 형태로 새로운 클래스 개발 가능
  - 클래스의 다중 상속을 지원하지 않지만, 인터페이스로 다중 상속 효과를 간접적으로 얻을 수 있음
- 인터페이스와 추상 클래스의 차이
  |분류|인터페이스|추상 클래스|
  |-|-|-|
  |구현 메서드|포함 불가(단, 디폴트 메서드와 정적 메서드는 예외)|포함 가능|
  |인스턴스 변수|포함 불가능|포함 가능|
  |다중 상속|가능|불가능|
  |디폴트 메서드|선언 가능|선언 불가능|
  |생성자와 main()|선언 불가능|선언 가능|
  |상속에서의 부모|인터페이스|인터페이스, 추상 클래스|
  |접근 범위|모든 멤버를 공개|추상 메서드를 최소한 자식에게 공개|
- 인터페이스 수정이 기존 구현 클래스에 미치는 영향
  - 인터페이스에 추상 메서드를 추가한 경우 클래스에서 메서드를 구현하지 않은 채로 실행할 수 없음
  - 인터페이스에 디폴트 메서드를 추가한 경우 추상 메서드가 아니므로 구현하지 않아도 작동
- 디폴트 메서드와 정적 메서드
  - 디폴트 메서드는 오버라이딩될 수 있지만, 정적 메서드는 오버라이딩될 수 없음
  - 디폴트 메서드는 인스턴스 메서드이므로 객체를 생성한 후 호출하지만, 정적 메서드는 인터페이스로 직접 호출
- 구조
  ```
  // interface : 인터페이스라는 것을 나타냄
  interface 인터페이스이름
  {
    // 상수 필드 (상수만 가능하기 때문에 public static final 생략 가능)
    // abstract 메서드 (인터페이스에서 아래 3종류를 제외한 모든 메서드가 public abstract이므로 public abstract 생략 가능)
    // default 메서드 (JDK 8부터 가능)
    // static 메서드 (JDK 8부터 가능)
    // private 메서드 (JDK 9부터 가능)
  }
  ```
- 상속
  - 기능을 미리 구현하여 필요할 때 사용할 수 있음
  - 자식 클래스에서 오버라이딩할 수 있음
  ```
  // 상속의 경우 extends를 사용
  interface 자식인터페이스 extends 부모인터페이스
  {
  }

  // 구현의 경우 implements를 사용
  class 자식클래스 implements 부모인터페이스
  {
  }
  ```
- 인터페이스와 상수
  - 인터페이스는 ​컴파일 할 때 자동으로 public static final​이 붙기 때문에 어디에서나 접근 가능
  - 하나의 클래스에 여러 개의 인터페이스를 Implement 할 수 있음
  - 인터페이스의 클래스 명을 네임스페이스로 붙이지 않고 바로 사용 가능
- Comparable 인터페이스
  - compareTo() 메서드를 통해 객체 간의 순서를 비교할 수 있도록 함
  - Comparable 인터페이스를 구현한 클래스는 그 인스턴스들에게 순서가 존재한다는 뜻
  ```java
  public interface Comparable
  {
    int compareTo(Object other); // 다른 객체보다 큰 경우 양수, 동일한 경우 0, 작으면 음수 반환
  }
  ```
- 다형성
  - 인터페이스 타입
    - 인터페이스도 클래스처럼 하나의 타입이므로 변수를 인터페이스 타입으로 선언 가능
    - 인터페이스의 구현 클래스는 그 인터페이스의 자식 타입
    - 인터페이스 타입 변수가 구현 객체를 참조한다면 강제 타입 변환 가능
  - 타입 변환과 다형성
    ```java
    interface Movable
    {
      void move();
    }

    class Car implements Movable
    {
      public void move() {}
      public void show() {}
    }
    ```
    ```java
    Movable m = new Car();
    m.move();
    m.show(); // 오류 발생
    // Movable 타입에는 move() 메서드만 있고 show() 메서드는 없음

    Car c (Car)m; // 강제 타입 변환
    c.move();
    c.show();
    // 정상 작동
    ```
    
## 예외 처리
- 의미
  - 오류가 발생할 경우 프로그래머가 작성한 부분이 실행되도록 try~catch로 준비하는 것
- 오류
  - 구문 오류 발생 시 콘솔 창에 오류 내용이 출력된다
  - 오류가 발생하면 오류의 원인과 행 번호가 표시되며, 클릭하면 오류가 발생한 행으로 커서 이동
- 형식
  ```
  try
  {
    // 실행문
  } catch (예외타입 e) {
    // e : 오류 내용
    // 예외 발생시 실행문
  } finally {
    // 마지막에 반드시 실행
  }
  ```
  - try 구문 안에서 오류가 발생하고 그 오류가 예외타입 오류에 해당한다면 catch 구문 내부를 수행
  - catch 구문을 여러번 사용하여 예외타입을 여러개 지정 가능
  - finally 구문은 오류 발생 여부와 관계없이 실행
  - e.getMessage( ) 메소드로 오류 내용을 추출해서 출력 가능
- 종류
  - 예외 타입은 클래스로서 서로 상속 관계
    > 예외타입을 부모로 설정한 경우 자식 모두가 예외타입에 해당한다 
  - Exception
    - ClassNotFoundException
    - IllegalAccessException
    - RunTimeException
      - ArithmeticException
      - NullPointerException
      - IndexOutOfBoundsException
        - ArrayIndexOutOfBoundsException
        - StringIndexOutOfBoundsException
  - IOException
    - EOFException
    - FileNotFoundException
- 오류 메시지 직접 만들기
  ```java
  throw new Exception("오류 메시지");
  // 예외타입을 Exception으로 설정후 에러 발생시 "오류 메시지" 문장 출력
  ```

## GUI
- 소개
  - Graphic User Interface의 약자로 TUI(Text User Interface)와 반대 개념
  - GUI 응용 프로그램은 키보드뿐 아니라 마우스 사용 지원, 화려하고 다양한 화면과 더불어 사용자가 자유롭게 화면 작동 가능
  - 그래픽의 사전적 의미는 상품화, 정보 제공, 엔터테인먼트 등을 벽, 캔버스, 컴퓨터 화면, 종이 같은 표면에 나타내는 시각적 표현
  - 그래픽은 문자나 숫자보다 더 빠르고 쉽게 정보를 전달할 수 있기 때문에 컴퓨터 분야에서 매우 중요
  - 비교적 최근에 출시된 자바는 초기 버전부터 그래픽을 고려해서 설계
- 기본 GUI 화면
  - AWT
    - 운영체제가 제공하는 네이티브 UI컴포넌트를 이용하는 자바 라이브러리
    - 중량 컴포넌트라고 하며, 운영체제에 따라 외형이 다름
  - 스윙
    - 운영체제의 도움을 받지 않고 순수하게 자바로 작성되어 있기 때문에 스윙 컴포넌트를 경량 컴포넌트라고 함
    - 모든 스윙 컴포넌트는 AWT컴포넌트와 완전히 호환
  - JavaFX
    - RIA 시장을 장악하고 있던 어도비의 플래시와 MS의 실버라이트에 대항
    - 처음에는 JavaFX스크립트라는 별도의 언어로 개발되어서 불편
    - 2011년 JavaFX 2.0은 순수한 자바로 개발되었고 JavaFX 2.2는 JDK와 JRE에 포함
    - JavaFX의 장점을 포함하려면 밑바닥부터 다시 설계해야 한다는 부담감 때문에 현재는 스윙과 JavaFX가 양존
- 스윙을 이용한 GUI
  - 컴포넌트와 컨테이너
    - 개념
      - 컴포넌트
        - 버튼,  레이블,  텍스트  필드  등 GUI를  작성하는  기본적인  빌딩  블록을 의미
        - 사용자 인터페이스를 생성하는 객체로, 윈도우 시스템에서는 컨트롤에 해당
      - 컨테이너
        - 컴포넌트를  부착하는  특수한  컴포넌트를  의미
        - 컴포넌트를 부착할 수 있는 프레임이나 패널 등이 대표적인 컨테이너  클래스
    - 생성과 추가
      - 컨테이너는 내부의 배치 관리자를 사용해 컴포넌트 위치를 결정하고 자신에게 부착
      - 스윙 애플리케이션을 작성하려면 스윙 애플리케이션의 최상위 컨테이너인 프레임을 생성 필요
    - JFrame
      - 복잡한 구조로 구성되어 있지만, 개발자가 자주 접하는 부분은 메뉴바와 컨텐트페인
      - 생성자
        ```java
        JFrame(); // 타이틀이 없는 JFrame 객체 생성
        JFrame(String title) // title이라는 타이틀의 JFrame 객체 생성
        ```
      - 주요 메서드
        |메서드|설명|
        |-|-|
        |Container getContentPane()|프레임의 컨텐트페인 객체 반환|
        |void pack()|컴포넌트를 부착하기에 적절한 윈도우 크기로 조절|
        |void setDefaultCloseOperation(int operation)|닫기 버튼을 클릭할 때 기본 작동 결정|
        |void setIconImage(Image image)|윈도우 아이콘 설정|
        |void setLayout(LayoutManager manager)|윈도우의 배치 관리자 설정|
        |void setJMenuBar(JMenuBar menubar)|프레임의 메뉴바를 주어진 메뉴바로 지정|
        - 이외에도 Component 클래스가 제공하는 add(), Window 클래스가 제공하는 setVisible(), Frame 클래스가 제공하는 setResizable() 등도 자주 사용
      - 사용 가능한 상수
        |상수|설명|
        |-|-|
        |DISPOSE_ON_CLOSE|종료할 때 모든 자원 반납|
        |DO_NOTHING_ON_CLOSE|종료할 때 아무 일도 하지 않음|
        |EXIT_ON_CLOSE|종료할 때 애플리케이션도 강제 종료|
        |HIDE_ON_CLOSE|종료할 때 창을 숨김|
      - 프레임에 컴포넌트 추가
        - 스윙 컴포넌트를 프레임에 부착하려면 Container 클래스가 제공하는 add() 메서드를 호출
- 컴포넌트 배치
  - 배치 관리자의 역할
    - 부착할 컴포넌트 위치를 결정해서 적절히 배치하며, 컨테이너의 크기가 변하면 컴포넌트를 재배치
  - 배치 관리자 설정 및 제거
    ```java
    setLayout(new GridLayout()); // GridLayout으로 배치 관리자 변경
    setLayout(null); // 배치 관리자 제거
    ```
  - 컨테이너와 기본 배치 관리자
    - 컨테이너
      - JDiallog
      - JFrame
      - JWindow
      - JApplet
      - JPanel
    - 기본 배치 관리자
      - BorderLayout
        - 영역에 컴포넌트 추가하기 위한 메서드
      - FlowLayout
        - 컴포넌트 정렬을 위한 메서드
  - GridLayout 배치 관리자
    - GridLayout객체를 생성할 때 행과 열의 개수를 0이상의 정수로 명시
    - 행이나 열의 값이 0이면 필요한 만큼의 행이나 열을 생성. 그러나 행과 열의 개수로 동시에 0은 사용 금지
  - CardLayout 배치 관리자
    - 메서드
      |메서드|설명|
      |-|-|
      |void first(Container parent)|첫 번째 컴포넌트 선택|
      |void next(Container parent)|다음 컴포넌트 선택|
      |void previous(Container parent)|이전 컴포넌트 선택|
      |void last(Container parent)|마지막 컴포넌트 선택|
  - 배치 관리자 없이 컴포넌트 배치
    - 배치 관리자가 없을 때는 절대 좌표로 컴포넌트를 배치
    - 플랫폼 환경이 다르거나 프레임의 크기가 변경되는 등 외부 원인으로 컴포넌트 크기와 위치가 의도와는 다르게 나타날 수 있음
    - 컴포넌트의 크기와 위치를 setSize()와 setLocation(), setBounds() 메서드를 이용해 개발자가 지정하는 번거로움을 감수
- 주요 컴포넌트
  - AWT 패키지와 스윙 패키지
    - GUI 프로그래밍을 위한 헬퍼 클래스
      - 그래픽, 색상, 폰트, 레이아웃 배치 관리자 등은 java.awt 패키지의 가족
      - 클래스를 이용하려면 java.awt 패키지 임포트 필요
    - 자주 사용하는 AWT 패키지
      - java.awt : AWT의 GUI 컴포넌트, 색상, 폰트, 그래픽, 레이아웃 배치 관리자 등 관련된 클래스를 포함
      - java.awt.event : AWT와 스윙의 이벤트 클래스, 각종 리스너 인터페이스, 어댑터 클래스를 포함
      - java.awt.color, java.awt.font, java.awt.image 등
    - 스윙 패키지와 하부 패키지
      - javax.swing : 기본적인 GUI 관련 클래스를 포함
      - javax.swing.border : Border 인터페이스와 각종 구현 클래스를 포함
      - javax.swing.event : 스윙에 추가된 각종 이벤트 클래스와 리스너 인터페이스를 포함
      - javax.swing.tree : 스윙의 트리를 지원하는 인터페이스와 각종 구현 클래스를 포함
  - Component 클래스
    - 컴포넌트의 공통 속성과 크기, 모양, 색상, 폰트, 이동, 삭제, 이벤트 처리 등을 수행할 수 있는 메서드를 제공
      |메서드|설명|
      |-|-|
      |Color getBackground()|컴포넌트의 배경색 반환|
      |Color getForeground()|컴포넌트의 전경색 반환|
      |Graphics getGraphics()|컴포넌트의 그래픽 컨텍스트 반환|
      |String getName()|컴포넌트의 이름 반환|
      |Container getParent()|컴포넌트를 포함하는 컨테이너 반환|
      |Dimension getSize()|컴포넌트의 크기 반환|
      |void setBackground(Color c)|컴포넌트의 배경색 설정|
      |void setEnabled(boolean b)|컴포넌트를 활성화 비활성화 함|
      |void setFont(Font f)|컴포넌트의 폰트 설정|
      |void setForeground(Color)|컴포넌트의 전경색 설정|
      |void setLocation(Point p)|컴포넌트의 위치 설정|
      |void setSize(Dimension d)|컴포넌트의 크기 설정|
      |void setVisible(boolean b)|컴포넌트를 화면체 포시하거나 숨김|
  - Container 클래스
    - 다른 컨테이너 내부에 포함될 수 없는 최상위 컨테이너인 프레임, 다이얼로그, 애플릿
    - 다른 컨테이너에 포함될 수 있는 패널 또는 스크롤페인 등
    - 메서드
      |메서드|설명|
      |-|-|
      |Component add(Component comp)|컨테이너에 컴포넌트 부착|
      |Component add(Component comp, int index)|컨테이너에 컴포넌트를 명시한 위치에 부착|
      |void add(Component component, Object constraints)|크기와 위치(Object)를 사용해 컨테이너에 컴포넌트 부착|
      |Insets getInsets()|컨테이너의 여백을 의미하는 인셋 반환|
      |void remove(Component comp)|컴포넌트를 컨테이너에서 제거|
      |void remove(int index)|명시된 위치의 컴포넌트 제거|
      |void setLayout(LayoutManager mgr)|컨테이너의 배치 관리자 설정|
- 주요 스윙 컴포넌트
  - JComponent 클래스
    - 모든  스윙  컴포넌트의  부모  클래스
    - 메서드
      |메서드|설명|
      |-|-|
      |Border getBorder()|보더 반환|
      |Dimension getPreferredSize()|크기 반환|
      |String getToolTipText()|툴팁에 설정된 문자열 반환|
      |void setBorder(Border border)|보더 설정|
      |void setOpaque(boolean isOpaque)|투명 여부 설정|
      |void setPreterredSize(Dimension preferredSize)|크기 설정|
      |void setToolTipText(String text)|툴팁을 문자열로 설정|
  - JLabel
    - 이벤트와 관계없이 단순히 텍스트나 이미지를 표시
    - 메서드
      |메서드|설명|
      |-|-|
      |Icon getIcon()|레이블이 가진 아이콘 반환|
      |String getText()|레이블이 가진 문자열 반환|
      |void setIcon(Icon icon)|레이블에 명시된 아이콘 설정|
      |void setText(String text)|레이블에 명시된 문자열 설정|
  - JButton
    - 사용자가 직접 작동해서 제어할 수 있는 컴포넌트 중 하나
    - 사용자가 클릭하면 ActionEvent를 발생
    - 메서드
      |메서드|설명|
      |-|-|
      |Icon getIcon()|설정된 이미지 반환|
      |String getText()|설정된 문자열 반환|
      |void setIcon(Icon icon)|버튼의 이미지 설정|
      |void setMnemonic(char mnemonic)|단축키 문자 설정|
      |void setText(String text)|버튼의 문자열 설정|
  - JTextField
    - 한 행짜리 문자열 입력 창을 만드는 컴포넌트로, JTextArea 및 JEditPane과 함께 JTextComponent의 자식 클래스
    - 메서드
      |메서드|설명|
      |-|-|
      |int getCaretPosition()|문자열이 삽입될 캐럿의 위치 반환|
      |int getColumns()|텍스트 필드에 설정된 열의 개수 반환|
      |String getText()|텍스트 필드에 포함된 문자열 반환|
      |void setEditable(boolean b)|텍스트 필드의 편집 여부 설정|
      |void setColumns(int columns)|텍스트 필드의 열 개수 설정|
      |void setFont(Font f)|텍스트 필드의 폰트 설정|
      |void setText(String text)|주어진 문자열로 설정|
  - JTextArea
    - 여러 행에 걸쳐 문자열을 입력하거나 편집할 수 있는 스윙 컴포넌트
    - 사용자가 문자열을 입력한 후  엔터 키를 누르면 ActionEvent가 발생
    - 메서드
      |메서드|설명|
      |-|-|
      |void append(String str)|주어진 문자열을 문서 끝에 추가|
      |int getLineCount()|행 개수 반환|
      |String getText()|텍스트 영역에 포함된 문자열 반환|
      |void insert(String str, int pos)|주어진 문자열을 pos 위치에 삽입|
      |void replaceRange(String str, int start, int end)|주어진 문자열로 start와 end 사이의 문자열 교체|
      |void setEditable(boolean b)|텍스트 영역의 편집 여부 설정|
      |void setFont(Font f)|주어진 폰트로 설정|
      |void setRows(int rows)|주어진 행 개수로 설정|
  - JComboBox
    - 다수의 항목 중에 하나를 선택하며, 컴포넌트에 텍스트와 이미지를 추가 가능
    - 항목을 선택하면 ActionEvent 발생, 항목을 변경하면 ItemEvent 발생
    - 메서드
      |메서드|설명|
      |-|-|
      |void addItem(E item)|지정한 항목을 목록에 추가|
      |E getItem(int index)|지정한 인덱스의 항목을 목록에서 반환|
      |void insertItemAt(E item, int index)|지정한 항목을 지정한 인덱스에 추가|
      |void removeItem(Object anObject)|지정한 항목을 목록에서 제거|
      |void removeItemAt(int anIndex)|지정한 인덱스의 항목을 목록에서 제거|

## 이벤트 처리
- 이벤트의 개념과 처리 과정
  - 윈도우 시스템에서 사용자의 움직임을 애플리케이션에 전달하는 일종의 신호
  - GUI 프로그램은 이벤트가 실행 흐름을 결정하는 이벤트 구동 방식
  - 이벤트 리스너는 발생한 이벤트를 처리하는 객체
  - 이벤트 핸들러는 이벤트를 처리하는 이벤트 리스너의 멤버 메서드
- 이벤트 클래스와 이벤트 리스너
  - 이벤트 클래스
    - 이벤트 처리에 필요한 많은 정보를 제공
    - 예를 들어 사용자가 마우스를 클릭하면 클릭 여부, 클릭된 컴포넌트, 클릭된 위치 등과 같은 정보를 제공
    - 종류
      - 의미 이벤트
        - 버튼 클릭처럼 사용자가 의도하는 이벤트를 의미
        - 일부 스윙 컴포넌트에서만 발생
          > ActionEvent, AdjustmentEvent, ItemEvent, TextEvent 등
      - 저수준 이벤트
        - 의미 이벤트를 가능하게 하는 이벤트를 의미
          > 버튼 클릭은 마우스 이동, 마우스 누름, 마우스 놓기 등 여러 단계의 세부적인 이벤트로 구성
        - 모든 스윙 컴포넌트에서 발생
          > ComponentEvent, ContainerEvent, FocusEvent, MouseEvent, KeyEvent 등
    - 주요 이벤트의 메서드와 상수
      - EventObject
        |메서드 또는 상수|설명|
        |-|-|
        |Object getSource()|발생한 이벤트 반환, 반환 타입이 Object이므로 사용 시 타입 변환 필요|
      - AWTEvent
        |메서드 또는 상수|설명|
        |-|-|
        |int getID()|AWT 이벤트의 id 속성을 조사해서 반환|
        |String paramString()|이벤트의 상태를 문자열로 반환|
      - ItemEvent
        |메서드 또는 상수|설명|
        |-|-|
        |static int DESELECTED|항목의 선택 해제|
        |static int ITEM_STATE_CHANGED|항목의 상태 변경|
        |static int SELECTED|항목을 선택|
        |Object getItem()|선택된 항목 반환|
        |int getStateChanged()|변경된 상태 반환|
      - WindowEvent
        |메서드 또는 상수|설명|
        |-|-|
        |static int WINDOW_ACTIVATED|윈도우가 활성화된 상태|
        |static int WINDOW_CLOSED|윈도우가 닫힌 상태|
        |static int WINDOW_DEICONIZED|아이콘에서 윈도우로 변경된 상태|
        |static int WINDOW_ICONIZED|윈도우가 아이콘으로 바뀐 상태|
        |Window getWindow()|이벤트가 발생한 윈도우 반환|
  - 이벤트 리스너
    - 이벤트 소스에 이벤트 리스너 등록
    - 이벤트 리스너는 매우 빠르게 처리되도록 가능한 짧게 작성
    - 이벤트 리스너가 하나의 스레드로 과다한 작업을 수행한다면 프로그램이 반응하지 않을 수도 있음
    - 이벤트 처리 시간이 길다면 별도의 스레드에 맡기는 것이 바람직
    - 이벤트 소스와 이벤트 리스너
      - 버튼, 리스트, 메뉴 아이템, 텍스트 필드
        |이벤트|이벤트 리스너|
        |-|-|
        |ActionEvent|ActionListener|
      - 스크롤바
        |이벤트|이벤트 리스너|
        |-|-|
        |AdjustmentEvent|AdjustmentListener|
      - 체크 박스, 콤보 박스, 리스트
        |이벤트|이벤트 리스너|
        |-|-|
        |ItemEvent|ItemListener|
      - 컨테이너
        |이벤트|이벤트 리스너|
        |-|-|
        |ContainerEvent|ContainerListener|
      - 컴포넌트
        |이벤트|이벤트 리스너|
        |-|-|
        |ComponentEvent|ComponentListener|
        |FocusEvent|FocusListener|
        |KeyEvent|KeyListener|
        |MouseEvent|MouseListener, MouseMotionListener|
      - 윈도우
        |이벤트|이벤트 리스너|
        |-|-|
        |WindowEvent|WindowListener|
    - 주요 리스너 인터페이스와 추상 메서드
      |리스너 인터페이스|추상 메서드|
      |-|-|
      |ActionListener|void actionPerformed(ActionEvent)|
      |ItemListener|void ItemStateChanged(ItemEvent)|
      |AdjustmentListener|void adjustmentValueChanged(AdjustmentEvent)|
      |KeyListener|void keyPressed(KeyEvent) </br>void keyReleased(KeyEvent) </br>void keyTyped(KeyEvent)|
      |MouseListener|void mousePressed(MouseEvent) </br>void mouseReleased(MouseEvent) </br>void mouseClicked(MouseEvent) </br>void mouseEntered(MouseEvent) </br>void mouseExited(MouseEvent)|
      |MouseMotionListener|void mouseDragged(MouseEvent) </br>void mouseMoved(MouseEvent)|
        > 마우스의 움직임을 추적할 때는 시스템에 상당한 부담을 주기 때문에 자바는 MouseListener 인터페이스와 별도로 MouseMotionListener 인터페이스로 구분해 제공
    - 이벤트 클래스와 주요 메서드
      - ActionEvent
        |메서드|설명|
        |-|-|
        |String getActionCommand()|액션과 관련된 명령어 문자열 반환|
        |int getModifiers()|액션이 발생할 때 눌린 변환키의 값 반환|
      - KeyEvent
        |메서드|설명|
        |-|-|
        |char getKeyChar()|키보드로 입력한 문자 반환|
        |int getKeyCode()|키보드로 입력한 문자의 코드 정수 값 반환|
      - MouseEvent
        |메서드|설명|
        |-|-|
        |int getButton()|상태가 변경된 마우스 버튼 반환|
        |int getClickCount()|이벤트와 관련된 마우스의 클릭 횟수 반환|
        |Point getLocationOnScreen()|이벤트가 발생한 위치의 좌표 반환|
        |static String getMouseModifiersText()|마우스 버튼과 함께 누른 변환키의 텍스트 반환|
        |int getX()|이벤트가 발생할 때 마우스의 X 좌표 반환|
        |int getY()|이벤트가 발생할 때 마우스의 Y 좌표 반환|
      - AdjustmentEvent
        |메서드|설명|
        |-|-|
        |int getValue()|이벤트의 현재 값 반환|
- 어댑터 클래스
  - 개발자가 필요한 추상 메서드만 구현하면 되도록 리스너에 대응하는 어댑터 클래스를 제공
  - 어댑터 클래스는 리스너 인터페이스에 포함된 모든 추상 메서드를 빈 본체로 구현한 클래스에 불과
  - 리스너 인터페이스와 대응하는 어댑터 클래스
    |리스너 인터페이스|어댑터 클래스|
    |-|-|
    |ComponentListener|ComponentAdapter|
    |ContainerListener|ContainerAdapter|
    |FocusListener|FocusAdapter|
    |KeyListener|KeyAdapter|
    |MouseListener|MouseAdapter|
    |MouseMotionListener|MouseMotionAdapter|
    |WindowListener|WindowAdapter|
- 이벤트와 메뉴
  - 메뉴 구성 순서
    ```java
    JMenuBar mb = JMenuBar(); // 메뉴 바 생성
    JMenu menu = new JMenu("File");
    mb.add(menu); // 메뉴 바에 메뉴 추가
    JMenuItem item = new JMenuItem("New File");
    menu.add(item); // 메뉴에 메뉴 항목 추가
    frame.setJMenuBar(mb); // 프레임에 메뉴바 부착
    ```
    
# 실습 파일 및 과제 파일
<details>
<summary>기본 데이터(C:\Temp\menu.txt)</summary>
  
```
5
1 물 1500 20
2 밥 1000 30
3 고기 1700 10
4 커피 2000 20
5 된장 3000 5
```
</details>

## 실습 파일
<details>
<summary>Scanner를 이용한 기본 자판기</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 

		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");
		System.out.println("1. 커피      100원");
		System.out.println("2. 우유      200원");
		System.out.println("3. 콜라      200원");
		System.out.println("=====================");
		System.out.println("돈을 입력하세요...");
		
		int money = in.nextInt();
		System.out.printf("입력한 돈은 %d 원 입니다.", money);
	}
}
```
</details>
<details>
<summary>자판기 메뉴선택 if문 활용</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		
		int MENU_1_PRICE = 1500;
		int MENU_2_PRICE = 2000;
		int MENU_3_PRICE = 3000;
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		System.out.println("돈을 입력하세요...");
		
		int money = in.nextInt();
		System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
		
		if(money<MENU_1_PRICE)
		{
			System.out.println("돈이 부족합니다.\n");
		}
		else
		{
			System.out.println("=====================");		
			System.out.printf("1. 커피      %d원\n",MENU_1_PRICE);
			System.out.printf("2. 우유      %d원\n",MENU_2_PRICE);
			System.out.printf("3. 콜라      %d원\n",MENU_3_PRICE);
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.\n");

			int menu = in.nextInt();
			if(menu==1)
			{
				if(money >= MENU_1_PRICE)
				{
					money -= MENU_1_PRICE; // money = money - 100
					System.out.printf("커피를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
			}
			else if(menu==2)
			{
				if(money >= MENU_2_PRICE)
				{
					money -= MENU_2_PRICE; 
					System.out.printf("우유를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
			}
			else if(menu==3)
			{
				if(money >= MENU_2_PRICE)
				{
					money -= MENU_3_PRICE; 
					System.out.printf("콜라를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
			}
		}
	}
}
```
</details>
<details>
<summary>자판기 메뉴선택 switch문 활용</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		
		int MENU_1_PRICE = 1500;
		int MENU_2_PRICE = 2000;
		int MENU_3_PRICE = 3000;
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		System.out.println("돈을 입력하세요...");
		
		int money = in.nextInt();
		System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
		
		if(money<MENU_1_PRICE)
		{
			System.out.println("돈이 부족합니다.\n");
		}
		else
		{
			System.out.println("=====================");		
			System.out.printf("1. 커피      %d원\n",MENU_1_PRICE);
			System.out.printf("2. 우유      %d원\n",MENU_2_PRICE);
			System.out.printf("3. 콜라      %d원\n",MENU_3_PRICE);
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.\n");

			int menu = in.nextInt();
			
			switch(menu)	//			if(menu==1)
			{
			case 1:
				if(money >= MENU_1_PRICE)
				{
					money -= MENU_1_PRICE; // money = money - 100
					System.out.printf("커피를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}				
				break;
			case 2:
				if(money >= MENU_2_PRICE)
				{
					money -= MENU_2_PRICE; 
					System.out.printf("우유를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}				
				break;
			case 3:
				if(money >= MENU_2_PRICE)
				{
					money -= MENU_3_PRICE; 
					System.out.printf("콜라를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}				
				break;
			default:
				break;
			}
		}		
	}
}
```
</details>
<details>
<summary>월별 말일 출력</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("월을 입력하세요..>>");
		int month = in.nextInt();

		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일입니다.", month);
			break;

		case 2:
			System.out.println("2월은 28일입니다.");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 30일입니다.", month);
			break;
		}
	}
}
```
</details>
<details>
<summary>구구단 가로출력</summary>
  
```java
package com.practice;

public class test
{
	public static void main(String[] args)
	{
		int i, j;

		for(i=2;i<=9;i++)
		{
			System.out.printf("%d단\t", i);
		}
    
		System.out.printf("\n");

		for(i=2;i<=9;i++)
		{
			System.out.printf("======\t");
		}
    
		System.out.printf("\n");
		
		for(j=1;j<=9;j++)
		{
			for(i=2;i<=9;i++)
			{
				System.out.printf("%d*%d=%2d\t", i, j, i*j);
			}
      
			System.out.printf("\n");
		}
	}
}
```
</details>
<details>
<summary>단순 계산기</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		int i;
		Scanner in = new Scanner(System.in);
		int a, b, result;
		double fresult;
		char op;
		boolean flag = true;
		
		while(flag)
		{
			System.out.print("a를 입력하세요..");
			a=in.nextInt();
			System.out.print("b를 입력하세요..");
			b=in.nextInt();
			System.out.print("연산자(+-*/)를 입력하세요..");
			op=in.next().charAt(0);
					
			switch(op)
			{
			case '+':
				result = a+b;
				System.out.printf("결과는 %d\n", result);
				break;
          
			case '-':
				result = a-b;
				System.out.printf("결과는 %d\n", result);
				break;
          
			case '*':
				result = a*b;
				System.out.printf("결과는 %d\n", result);
				break;
          
			case '/':
				fresult = (double)a/(double)b;
				System.out.printf("결과는 %f\n", fresult);
				break;
          
			case 'q':
				flag = false;
				System.out.printf("종료\n");
				break;
			}
		}
	}
}
```
</details>
<details>
<summary>자판기 switch, if 문 활용</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		
		int MENU_1_PRICE = 1500;
		int MENU_2_PRICE = 2000;
		int MENU_3_PRICE = 3000;
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		
		boolean moneyflag = true;
		int money=0;
		
		while(moneyflag)
		{
			System.out.println("돈을 입력하세요...");
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
      
			if(money<MENU_1_PRICE)
			{
				System.out.println("돈이 부족합니다.\n");
				System.out.println("더 입력하시겠습니까? (Y or N)\n");
				char val = in.next().charAt(0);
        
				switch(val)
				{
				case 'N':
				case 'n':
					moneyflag = false;
					break;
            
				case 'Y':
				case 'y':
					break;
				}
			}
			else
			{
				moneyflag = false;
			}
		}
		
		if(money<MENU_1_PRICE)
		{
			System.out.println("돈이 부족합니다.\n");
		}
		else
		{
			System.out.println("=====================");		
			System.out.printf("1. 커피      %d원\n",MENU_1_PRICE);
			System.out.printf("2. 우유      %d원\n",MENU_2_PRICE);
			System.out.printf("3. 콜라      %d원\n",MENU_3_PRICE);
			System.out.println("=====================");

			int menu;
      
			do
			{
				System.out.println("메뉴를 선택해주세요.\n");
				menu = in.nextInt();
        
				if(menu==1)
				{
					if(money >= MENU_1_PRICE)
					{
						money -= MENU_1_PRICE; // money = money - 100
						System.out.printf("커피를 고르셨습니다..\n");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
					}
					else
					{
						System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
					}
				}
				else if(menu==2)
				{
					if(money >= MENU_2_PRICE)
					{
						money -= MENU_2_PRICE; 
						System.out.printf("우유를 고르셨습니다..\n");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
					}
					else
					{
						System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
					}
				}
				else if(menu==3)
				{
					if(money >= MENU_3_PRICE)
					{
						money -= MENU_3_PRICE; 
						System.out.printf("콜라를 고르셨습니다..\n");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
					}
					else
					{
						System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
					}
				}
				else
				{
					menu = -1;
					System.out.printf("메뉴를 잘 못 고르셨습니다.\n");
				}
			}
        while(menu == -1);
		}
	}
}
```
</details>
<details>
<summary>성적표 1차원</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		int[] score = new int[4];
		int total = 0;
		double average;
		int i;
		String[] title = new String[] {"국어", "영어", "수학", "과학"};
		
		for(i=0;i<4;i++)
		{
			System.out.println(title[i] + "점수를 입력하세요");
			score[i] = in.nextInt();
			total = total + score[i];
		}

		average = (double)total/4.0;
	
		System.out.println(total);
		System.out.println(average);
	}
}
```
</details>
<details>
<summary>성적표 2차원</summary>
  
```java
package com.practice;

public class test
{
	public static void main(String[] args)
	{
		int[][] score = {
					{100,90,80,70},
					{100,95,80,75},
					{100,90,85,60}
				};
		int[] total = new int[3];
		double[] average = new double[3];
		String[] name = {"JeaWon","JeaTwo","JeaThree"};
		int i, j;
    
		for(i=0;i<3;i++)
		{
			total[i]=0;
			for(j=0;j<4;j++)
			{
				total[i] += score[i][j];
			}
			average[i] = (double)total[i]/4.0;
		}
		
		System.out.printf("이름\t국어\t영어\t수학\t과학\t총점\t평균\n");
		System.out.printf("========================================\n");
		for(i=0;i<3;i++)
		{
			System.out.printf("%s\t",name[i]);
			for(j=0;j<4;j++)
			{
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\t",total[i]);
			System.out.printf("%f\n",average[i]);
		}
	}
}
```
</details>
<details>
<summary>자판기 잔돈처리</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		
		int MENU_1_PRICE = 1500;
		int MENU_2_PRICE = 2000;
		int MENU_3_PRICE = 3000;
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		
		boolean moneyflag = true;
		int money=0;
		
		while(moneyflag)
		{
			System.out.println("돈을 입력하세요...");
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
      
			if(money<MENU_1_PRICE)
			{
				System.out.println("돈이 부족합니다.\n");
				System.out.println("더 입력하시겠습니까? (Y or N)\n");
				char val = in.next().charAt(0);
				switch(val)
				{
				case 'N':
				case 'n':
					moneyflag = false;
					break;
            
				case 'Y':
				case 'y':
					break;
				}
			}
			else
			{
				moneyflag = false;
			}
		}
    
		boolean menuflag = true;
    
		while(menuflag)
		{
			if(money<MENU_1_PRICE)
			{
				System.out.println("돈이 부족합니다.\n");
				break;
				//menuflag = false;
			}
			else
			{
				System.out.println("=====================");		
				System.out.printf("1. 커피      %d원\n",MENU_1_PRICE);
				System.out.printf("2. 우유      %d원\n",MENU_2_PRICE);
				System.out.printf("3. 콜라      %d원\n",MENU_3_PRICE);
				System.out.printf("0. 잔돈반환  \n");
				System.out.println("=====================");

				int menu;
        
				do
				{
					System.out.println("메뉴를 선택해주세요.\n");
					menu = in.nextInt();
					if(menu==1)
					{
						if(money >= MENU_1_PRICE)
						{
							money -= MENU_1_PRICE; // money = money - 100
							System.out.printf("커피를 고르셨습니다..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
						else
						{
							System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
					}
					else if(menu==2)
					{
						if(money >= MENU_2_PRICE)
						{
							money -= MENU_2_PRICE; 
							System.out.printf("우유를 고르셨습니다..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
						else
						{
							System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
					}
					else if(menu==3)
					{
						if(money >= MENU_3_PRICE)
						{
							money -= MENU_3_PRICE; 
							System.out.printf("콜라를 고르셨습니다..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
						else
						{
							System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
					}
					else if(menu==0)
					{
						menuflag = false;
					}
					else
					{
						menu = -1;
						System.out.printf("메뉴를 잘 못 고르셨습니다.\n");
					}
          
					if(money>=MENU_1_PRICE)
					{
						System.out.println("더 구입하시겠습니까? (Y or N)\n");
						char val = in.next().charAt(0);
						switch(val)
						{
						case 'N':
						case 'n':
							menuflag = false;
							break;
                
						case 'Y':
						case 'y':
							break;
						}
					}
					else
					{
						menuflag = false;
					}	
				}while(menu == -1);
			}
		}
		System.out.printf("잔돈은 %d원 입니다.\n", money);
		System.out.printf("안녕히 가세요.\n");
	}
}
```
</details>
<details>
<summary>자판기 배열 사용 1</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		
    	//int MENU_1_PRICE = 1500;
    	//int MENU_2_PRICE = 2000;
    	//int MENU_3_PRICE = 3000;
		
		int[] menu_price = {1000, 2000, 3000};
		String[] menu_title = {"아메리카노","카페라떼","콜라"};
		int i;
		
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		
		boolean moneyflag = true;
		int money=0;
		
		while(moneyflag)
		{
			System.out.println("돈을 입력하세요...");
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
      
			if(money<MENU_1_PRICE)
			{
				System.out.println("돈이 부족합니다.\n");
				System.out.println("더 입력하시겠습니까? (Y or N)\n");
				char val = in.next().charAt(0);
        
				switch(val)
				{
				case 'N':
				case 'n':
					moneyflag = false;
					break;
            
				case 'Y':
				case 'y':
					break;
				}
			}
			else
			{
				moneyflag = false;
			}
		}
    
		boolean menuflag = true;
		
		while(menuflag)
		{
			if(money<MENU_1_PRICE)
			{
				System.out.println("돈이 부족합니다.\n");
				break;
				//menuflag = false;
			}
			else
			{
				System.out.println("=====================");
        
				for(i=0;i<menu_title.length;i++)
				{
					System.out.printf("%d %s   %d원\n",i+1, menu_title[i], menu_price[i]);
				}
        
				System.out.printf("%d. 잔돈반환  \n", i);
				System.out.println("=====================");

				int menu;
        
				do
				{
					System.out.println("메뉴를 선택해주세요.\n");
					menu = in.nextInt();
          
					if(menu==1)
					{
						if(money >= MENU_1_PRICE)
						{
							money -= MENU_1_PRICE; // money = money - 100
							System.out.printf("커피를 고르셨습니다..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
						else
						{
							System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
					}
					else if(menu==2)
					{
						if(money >= MENU_2_PRICE)
						{
							money -= MENU_2_PRICE; 
							System.out.printf("우유를 고르셨습니다..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
						else
						{
							System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
					}
					else if(menu==3)
					{
						if(money >= MENU_3_PRICE)
						{
							money -= MENU_3_PRICE; 
							System.out.printf("콜라를 고르셨습니다..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
						else
						{
							System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
					}
					else if(menu==0)
					{
						menuflag = false;
					}
					else
					{
						menu = -1;
						System.out.printf("메뉴를 잘 못 고르셨습니다.\n");
					}
					
					if(money>=MENU_1_PRICE)
					{
						System.out.println("더 구입하시겠습니까? (Y or N)\n");
						char val = in.next().charAt(0);
            
						switch(val)
						{
						case 'N':
						case 'n':
							menuflag = false;
							break;
                
						case 'Y':
						case 'y':
							break;
						}
					}
					else
					{
						menuflag = false;
					}
				} while(menu == -1);
			}
		}
		System.out.printf("잔돈은 %d원 입니다.\n", money);
		System.out.printf("안녕히 가세요.\n");
	}
}
```
</details>
<details>
<summary>자판기 배열 사용 2</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String[] menu_title = {"아메리카노","카페라떼","콜라"};
		int[] menu_price = {1000, 2000, 3000};
		int i;
	
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		
		boolean moneyflag = true;
		int money=0;
		
		while(moneyflag)
		{
			System.out.println("돈을 입력하세요...");
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
      
			if(money<menu_price[0])
			{
				System.out.println("돈이 부족합니다.\n");
				System.out.println("더 입력하시겠습니까? (Y or N)\n");
				char val = in.next().charAt(0);
        
				switch(val)
				{
				case 'N':
				case 'n':
					moneyflag = false;
					break;
            
				case 'Y':
				case 'y':
					break;
				}
			}
			else
			{
				moneyflag = false;
			}
		}
		
		boolean menuflag = true;
		
		while(menuflag)
		{
			if(money<menu_price[0])
			{
				System.out.println("돈이 부족합니다.\n");
				//break;
				menuflag = false;
			}
			else
			{
				System.out.println("=====================");		
        
				for(i=0;i<menu_title.length;i++)
				{
					System.out.printf("%d %s   %d원\n",i+1, menu_title[i], menu_price[i]);
				}
				System.out.printf("%d. 잔돈반환  \n", i+1);
				System.out.println("=====================");

				int menu;
        
				do
				{
					System.out.println("메뉴를 선택해주세요.\n");
					
					menu = in.nextInt();
					
					if(menu <= menu_title.length)
					{
						if(money >= menu_price[menu-1])
						{
							money -= menu_price[menu-1]; // money = money - 100
							System.out.printf("%s를 고르셨습니다..\n", menu_title[menu-1]);
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
						else
						{
							System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
						}
					}
					else
					{
						if(menu==menu_title.length+1)
						{
							menuflag = false;
						}
						else
						{
							menu = -1;
							System.out.printf("메뉴를 잘 못 고르셨습니다.\n");
						}
					}
				} while(menu == -1);
        
				if(money>=menu_price[0])
				{
					System.out.println("더 구입하시겠습니까? (Y or N)\n");
					char val = in.next().charAt(0);
					switch(val)
					{
					case 'N':
					case 'n':
						menuflag = false;
						break;
              
					case 'Y':
					case 'y':
						break;
					}
				}
				else
				{
					menuflag = false;
				}
			}
		}
		System.out.printf("잔돈은 %d원 입니다.\n", money);
		System.out.printf("안녕히 가세요.\n");
	}
}
```
</details>
<details>
<summary>for문 활용 점수 출력</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		
		int numStudents;
		System.out.print("학생수: ");
		numStudents = in.nextInt();
		int[] score = new int[numStudents];
		int total = 0;
		double average;
		
		for(int i=0; i<numStudents; i++)
		{
			System.out.printf("%d번 학생 점수: ", i);
			score[i]=in.nextInt();
			total += score[i]; 
		}
    
		average = (double)total/(double)numStudents;
		System.out.printf("총점수 %d  평균: %f\n", total, average);
		
		int maxScore = score[0];
		int maxNo = 0;
    
		for(int i=1;i<numStudents;i++)
		{
			if(maxScore < score[i])
			{
				maxScore=score[i];
				maxNo = i;
			}
		}
    
		System.out.printf("%d번  %d가 제일 높은 점수입니다.\n", maxNo,maxScore);
	
		int min;
		int temp;
		
		for(int i=0;i<numStudents;i++)
		{
			min = i;
			for(int j=i+1;j<numStudents;j++)
			{
				if(score[min] < score[j])
				{
					min = j;
				}
			}
			temp = score[min];
			score[min]=score[i];
			score[i]=temp;
		}
		
		for(int i=0;i<numStudents;i++)
		{
			System.out.printf("%d  ", score[i]);		
		}
	}
}
```
</details>
<details>
<summary>예외처리 기초</summary>
  
```java
package com.practice;

public class test
{
	public static void main(String[] args)
	{
		int[] aa = new int[2];
		
		try {
			aa[0] = 10/0;
		} 
      
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 범위를 확인하세요.");
		}
      
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누지 마세요.");
		}
	}
}
```
</details>
<details>
<summary>표준 입력</summary>
  
```java
package com.practice;

import java.io.IOException;

public class test
{
	public static void main(String[] args) throws IOException 
	{
		String userName = "abc";
		String input="";
		int key;
		
		while( (key = System.in.read()) != 13)
		{
			input = input + Character.toString(key);
		}
		
		if(input.equals(userName))
		{
			System.out.println(input + "님 어서오세요");
		}
		else
		{
			System.out.println(input + "님은 등록이 안되어 있습니다.");
		}
	}
}
```
</details>
<details>
<summary>for문 활용 성적 sort</summary>
  
```java
package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		
		int numStudents;
		System.out.print("학생수: ");
		numStudents = in.nextInt();
		
		int[] score = new int[numStudents];
		String[] name = new String[numStudents];
		int[] num = new int[numStudents];
		
		int total = 0;
		double average;
		
		for(int i=0; i<numStudents; i++)
		{
			System.out.printf("%d번 학생 이름: ", i);
			name[i]=in.next() ;
			System.out.printf("%d번 학생 점수: ", i);
			score[i]=in.nextInt();
			total += score[i];
			num[i]=i+1;
		}
    
		average = (double)total/(double)numStudents;
		System.out.printf("총점수 %d  평균: %f\n", total, average);
		
		int maxScore = score[0];
		int maxNo = 0;
    
		for(int i=1;i<numStudents;i++)
		{
			if(maxScore < score[i])
			{
				maxScore=score[i];
				maxNo = i;
			}
		}

		System.out.printf("%d번  %d가 제일 높은 점수입니다.\n", maxNo,maxScore);
		
		int min;
		int temp;
		int tempn;
		String temps;
		
		for(int i=0;i<numStudents;i++)
		{
			min = i;

			for(int j=i+1;j<numStudents;j++)
			{
				if(score[min] < score[j])
				{
					min = j;
				}
			}

			temp = score[min];
			score[min]=score[i];
			score[i]=temp;
			
			temps = name[min];
			name[min]=name[i];
			name[i]=temps;
			
			tempn = num[min];
			num[min]=num[i];
			num[i]=tempn;
		}
		
		for(int i=0;i<numStudents;i++)
		{
			System.out.printf("%d  %s  %d\n",num[i], score[i], name[i], i+1);		
		}
	}
}
```
</details>
<details>
<summary>FileInputStream 1바이트씩 읽기</summary>
  
```java
package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

public class test
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("c:\\Temp\\data.txt");
		int ch;
		
		while ( (ch = fis.read()) != -1  )
		{
			System.out.print( (char)ch );
		}
		
		fis.close();
	}
}
```
</details>
<details>
<summary>FileInputStream String 변환</summary>
  
```java
package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

public class test
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("c:\\Temp\\data.txt");
		
		int ch;
		byte[] bt = new byte[100];
		int i=0;
		
		while ( (ch = fis.read()) != -1  )
		{
			bt[i] =  (byte)ch;
			i++;
		}
    
		System.out.println(new String(bt));
		fis.close();
	}
}
```
</details>
<details>
<summary>readLine 기초</summary>
  
```java
package com.practice;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class test
{
	public static void main(String[] args) throws Exception
	{
		FileReader fReader = new FileReader("c:\\Temp\\data.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		String str = "";

		while ( (str=bReader.readLine()) != null)
		{
			System.out.println(str);
		}

		fReader.close();
		bReader.close();
	}
}
```
</details>
<details>
<summary>파일 Scanner</summary>
  
```java
package com.practice;

import java.io.File;
import java.util.Scanner;

public class test
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(new File("c:\\Temp\\data.txt"));
		int sum=0;
		
		while(in.hasNext())
		{
			sum += in.nextInt();
		}

		System.out.println("합=" + sum);
		in.close();
	}
}
```
</details>
<details>
<summary>FileWriter</summary>
  
```java
package com.practice;

import java.io.FileWriter;
import java.util.Scanner;

public class test
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:\\Temp\\data1.txt");
		String str;
		
		while( (str = in.nextLine()).equals("") == false )
		{
			fw.write(str + "\r\n");
		}

		fw.close();
	}
}
```
</details>
<details>
<summary>성적 파일 입출력</summary>
  
```java
package com.practice;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class test
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(new File("c:\\Temp\\data.txt"));
		FileWriter fw = new FileWriter("c:\\Temp\\data1.txt");
		int numStudents;
		numStudents = in.nextInt();
		int[] num = new int[numStudents];
		String[] name = new String[numStudents];
		int[] score = new int[numStudents];
		
		for(int i=0; i<numStudents; i++)
		{
			num[i] = in.nextInt();
			name[i] = in.next();
			score[i] = in.nextInt();
		}

		String out="";

		for(int i=0; i<numStudents; i++)
		{
			out = String.format("%d -- %s -- %d\r\n", num[i], name[i], score[i] );
			fw.write(out);
		}
    
		in.close();
		fw.close();
	}
}
```
</details>
<details>
<summary>자판기 메뉴 파일 확인</summary>
  
```java
package com.practice;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class test
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		int numItems;		
		
		if(isExists)
		{
			Scanner in = new Scanner(file);			
			numItems = in.nextInt();
			int[] menu_num = new int[numItems];
			String[] menu_title = new String[numItems];
			int[] menu_price = new int[numItems];

			for(int i=0; i<numItems; i++)
			{
				menu_num[i] = in.nextInt();
				menu_title[i] = in.next();
				menu_price[i] = in.nextInt();
			}
      
			in.close();
			
			// select menu

      		// for(int i=0; i<numItems; i++)
      		// {
      		// 	 System.out.printf("%d  %s  %d\n", menu_num[i], menu_title[i], menu_price[i]);
      		// }
		}
		else // create menu
		{
			System.out.println("File Not Found");
			FileWriter fw = new FileWriter("c:\\Temp\\data1.txt");
			fw.close();
		}
	}
}
```
</details>
<details>
<summary>클래스 기초</summary>
  
```java
package com.practice;

public class test
{
	public static void main(String[] args)
	{
		Car myCar1 = new Car("빨강");
		Car myCar2 = new Car(30);
		Car myCar3 = new Car("보라색", 100);
		
    	// myCar1.setColor("빨강");
		
		myCar1.setSpeed(0);
		myCar1.upSpeed(100);
		System.out.printf("Car: %d\n", Car.getCount());
	}
}

class Car
{
	private String color;
	private int speed;
	private static int count = 0;
	
	Car(String color)
	{
		this.color=color;
		this.speed=0;
		count++;
	}
  
	Car(int speed)
	{
		this.color="흰색";
		this.speed=speed;
		count++;
	}
  
	Car(String color, int speed)
	{
		this.color=color;
		this.speed=speed;
		count++;
	}
	
	void upSpeed(int value)
	{
		speed += value;
	}
	
	void downSpeed(int value)
	{
		speed -= value;
	}

	void setColor(String color){this.color = color;}
	String getColor(){return color;}
	
	void setSpeed(int value) {speed = value;}		
	int getSpeed() {return speed;}
	
	static int getCount() {return count;}
}
```
</details>
<details>
<summary>GUI 기초</summary>
  
```java
package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("안녕안녕");
		
		// f.setTitle("안녕 나는 A야");
		f.setSize(400, 300);
		f.setLayout(new GridLayout(3,0));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
				
		JButton bt1 = new JButton("버튼1");
		p1.add(bt1);
	
		JButton bt2 = new JButton("버튼2");
		p1.add(bt2);

		JButton bt3 = new JButton("버튼2");
		bt3.setEnabled(false);
		bt3.setText("버튼3");
		p2.add(bt3);
		
		JLabel lb1 = new JLabel("안녕");
		p2.add(lb1);
		
		JTextField txtf1 = new JTextField(10); 
		p3.add(txtf1);
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.setVisible(true);
    
		System.out.print(txtf1.getText());
	}
}
```
</details>
<details>
<summary>원 넓이 구하기</summary>
  
```java
package com.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("원 넓이 구하기");
		
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		
		// north
		JPanel nPanel = new JPanel(new GridLayout(2,0));
		JPanel np1 = new JPanel();
		JPanel np2 = new JPanel();
		
		JLabel l1 = new JLabel("원의 반지름");
		JTextField t1 = new JTextField(10);
		
		JLabel l2 = new JLabel("원의 넓이");
		JTextField t2 = new JTextField(10);
		
		np1.add(l1);
		np1.add(t1);
		np2.add(l2);
		np2.add(t2);
		
		nPanel.add(np1);
		nPanel.add(np2);
		
		f.add(nPanel, BorderLayout.NORTH);

		// center
		JPanel cPanel = new JPanel();
		JTextArea area = new JTextArea(30,20);
		area.setText("여기는 원 넓이를 \n계산하는 과정이 나타닙니다.");
		area.setEditable(false);
		area.setBackground(Color.RED);

		cPanel.add(area);
		f.add(cPanel, BorderLayout.CENTER);
		
		
		//south
		String[] color = {"red", "blue"};
		JPanel sPanel = new JPanel(new FlowLayout());
		
		JButton cal = new JButton("계산");
		JComboBox<String> cb = new JComboBox<String>(color);
		JButton reset = new JButton("리셋");
		
		sPanel.add(cal);
		sPanel.add(cb);
		sPanel.add(reset);
		
		f.add(sPanel, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
```
</details>
<details>
<summary>원 넓이 구하기 이벤트 처리</summary>
  
```java
package com.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class test
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("원 넓이 구하기");
		
		f.setLayout(new BorderLayout());
		f.setSize(300, 400);
		
		// north
		JPanel nPanel = new JPanel(new GridLayout(3,0));
		JPanel np1 = new JPanel();
		JPanel np2 = new JPanel();
		JPanel np3 = new JPanel();
		
		JLabel l1 = new JLabel("원의 반지름");
		JTextField t1 = new JTextField(10);
		
		JLabel l2 = new JLabel("원의 넓이");
		JTextField t2 = new JTextField(10);
		
		JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
		bar.setValues(50, 10, 0, 100);
				
		np1.add(l1);
		np1.add(t1);
		np2.add(l2);
		np2.add(t2);
		
		np3.add(bar);
		
		nPanel.add(np1);
		nPanel.add(np2);
		nPanel.add(np3);
		
		f.add(nPanel, BorderLayout.NORTH);

		// center
		JPanel cPanel = new JPanel();
		JTextArea area = new JTextArea(30,20);
		area.setText("여기는 원 넓이를 \n계산하는 과정이 나타닙니다.");
		area.setEditable(false);
		area.setBackground(Color.LIGHT_GRAY);

		cPanel.add(area);
		f.add(cPanel, BorderLayout.CENTER);
		
		// south
		String[] color = {"red", "blue"};
		JPanel sPanel = new JPanel(new FlowLayout());
		
		JButton cal = new JButton("계산");
		JComboBox<String> cb = new JComboBox<String>(color);
		JButton reset = new JButton("리셋");
		
		sPanel.add(cal);
		sPanel.add(cb);
		sPanel.add(reset);
		
		f.add(sPanel, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		cal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = t1.getText();
				
				if(str.equals("") == true)
				{
					// error 
					area.setText("반지름을 입력해주세요");
					JOptionPane.showMessageDialog(f, "반지름을 입력해주세요");
				}
				else
				{
					int r;
					r = Integer.parseInt(str);
					double s;
					s = 3.14*r*r;
					str = String.format("%5.3f", s);
					t2.setText(str);	
				}
			}
		});
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				area.setText("");
			}
		});

		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int index = ((JComboBox<String>)cb).getSelectedIndex();
        
				if(index == 0)
				{
					area.setForeground(Color.RED);
				}
				else if(index == 1)
				{
					area.setForeground(Color.BLUE);
				}
			}
		});
		
		
		f.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 클릭");
			}
		});
		
		f.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스이동("+e.getX()+","+e.getY()+")");
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		
		
		bar.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				int v = e.getValue();
				t1.setText(String.valueOf(v));
			}
		});
	}
}
```
</details>
<details>
<summary>GUI 활용 자판기 틀</summary>
  
```java
package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("자판기");
		f.setLayout(new BorderLayout());
		f.setSize(500, 800);

		// north
		JPanel nPanel = new JPanel(new FlowLayout());
		JLabel l1 = new JLabel();
		Font fnt1 = new Font("맑은 고딕", Font.BOLD, 40);
		l1.setFont(fnt1);
		l1.setText("자판기");

		nPanel.add(l1);
		f.add(nPanel, BorderLayout.NORTH);
    
		// center
		JPanel cPanel = new JPanel(new GridLayout(3,3));
		JButton bt1 = new JButton("메뉴1");
		JButton bt2 = new JButton("메뉴2");
		JButton bt3 = new JButton("메뉴3");
		JButton bt4 = new JButton("메뉴4");
		JButton bt5 = new JButton("메뉴5");
		JButton bt6 = new JButton("메뉴6");
		JButton bt7 = new JButton("메뉴7");
		JButton bt8 = new JButton("메뉴8");
		JButton bt9 = new JButton("메뉴9");
    
  		cPanel.add(bt1);
  		cPanel.add(bt2);
  		cPanel.add(bt3);
  		cPanel.add(bt4);
  		cPanel.add(bt5);
  		cPanel.add(bt6);
  		cPanel.add(bt7);
  		cPanel.add(bt8);
  		cPanel.add(bt9);
  	
		f.add(cPanel,BorderLayout.CENTER);
		
		// south
		JPanel sPanel = new JPanel(new GridLayout(2,0));
		JPanel sp1 = new JPanel();
		JPanel sp2 = new JPanel();
		
		JLabel l2 = new JLabel("");
		JTextField t1 = new JTextField(15);
		JButton bt_input = new JButton("입력");
		JButton bt_return = new JButton("반환");
		
		sp1.add(l2);
		sp1.add(t1);
		sp1.add(bt_input);
		sp1.add(bt_return);
		
		JLabel l3 = new JLabel("잔돈");
		JTextField t2 = new JTextField(15);
		sp2.add(l3);
		sp2.add(t2);
		
		sPanel.add(sp1);
		sPanel.add(sp2);
		
		f.add(sPanel,BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
```
</details>
<details>
<summary>GUI 활용 자판기 메뉴 표시</summary>
  
```java
package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class test
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		int numItems;
		int[] menu_num;
		String[] menu_title;
		int[] menu_price;

		Scanner in2 = new Scanner(file);

		// file 확인
		numItems = in2.nextInt();
		menu_num = new int[numItems];
		menu_title = new String[numItems];
		menu_price = new int[numItems];

		for(int i=0; i<numItems; i++)
		{
			menu_num[i] = in2.nextInt();
			menu_title[i] = in2.next();
			menu_price[i] = in2.nextInt();
		}
    
		in2.close();
		
		JFrame f = new JFrame("자판기");
		f.setLayout(new BorderLayout());
		f.setSize(500, 800);

		// north
		JPanel nPanel = new JPanel(new FlowLayout());
		JLabel l1 = new JLabel();
		Font fnt1 = new Font("맑은 고딕", Font.BOLD, 40);
		l1.setFont(fnt1);
		l1.setText("자판기");

		nPanel.add(l1);
		f.add(nPanel, BorderLayout.NORTH);

		// center
		JPanel cPanel = new JPanel(new GridLayout(3,3));

		JButton[] bt = new JButton[9];
		Font fnt2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		for(int i=0; i<9; i++)
		{
			if(numItems > i)
			{
				bt[i] = new JButton(menu_title[i]);
				bt[i].setFont(fnt2);
				bt[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String str = e.getActionCommand();
						str = str + "를 고르셨습니다.";
						JOptionPane.showMessageDialog(f, str);
					}
				});
			}
			else
			{
				bt[i] = new JButton("");
			}
			cPanel.add(bt[i]);
		}

		f.add(cPanel,BorderLayout.CENTER);
		
		// south
		JPanel sPanel = new JPanel(new GridLayout(2,0));
		JPanel sp1 = new JPanel();
		JPanel sp2 = new JPanel();
		
		JLabel l2 = new JLabel("");
		JTextField t1 = new JTextField(15);
		JButton bt_input = new JButton("입력");
		JButton bt_return = new JButton("반환");
		
		sp1.add(l2);
		sp1.add(t1);
		sp1.add(bt_input);
		sp1.add(bt_return);
		
		JLabel l3 = new JLabel("잔돈");
		JTextField t2 = new JTextField(15);
    
		sp2.add(l3);
		sp2.add(t2);
		sPanel.add(sp1);
		sPanel.add(sp2);

		f.add(sPanel,BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
```
</details>
<details>
<summary>GUI 활용 자판기 계산</summary>
  
```java
package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class test
{
	static int sel_bt_no=0;
	static int money=0;
	
	public static void main(String[] args) throws Exception
	{
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		int numItems;
		int[] menu_num;
		String[] menu_title;
		int[] menu_price;

		Scanner in2 = new Scanner(file);

		// file 확인
		numItems = in2.nextInt();
		menu_num = new int[numItems];
		menu_title = new String[numItems];
		menu_price = new int[numItems];

		for(int i=0; i<numItems; i++)
		{
			menu_num[i] = in2.nextInt();
			menu_title[i] = in2.next();
			menu_price[i] = in2.nextInt();
		}
    
		in2.close();
		
		JFrame f = new JFrame("자판기");
		f.setLayout(new BorderLayout());
		f.setSize(500, 800);

		JTextField t2 = new JTextField(15);
		
		// north
		JPanel nPanel = new JPanel(new FlowLayout());
		JLabel l1 = new JLabel();
		Font fnt1 = new Font("맑은 고딕", Font.BOLD, 40);
		l1.setFont(fnt1);
		l1.setText("자판기");

		nPanel.add(l1);
		f.add(nPanel, BorderLayout.NORTH);

		// center
		JPanel cPanel = new JPanel(new GridLayout(3,3));

		JButton[] bt = new JButton[9];
		Font fnt2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		for(int i=0; i<9; i++)
		{
			if(numItems > i)
			{
				bt[i] = new JButton(menu_title[i]);
				bt[i].setFont(fnt2);
				bt[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String str = e.getActionCommand();
						JOptionPane.showMessageDialog(f, str);
            
						for(int j=0; j<numItems;j++)
						{
							if(str.equals(menu_title[j]))
							{
								sel_bt_no = j;
							}
						}
						
						System.out.println(menu_title[sel_bt_no]+"의 가격은"+String.valueOf(menu_price[sel_bt_no])+"원 입니다.");
						money -= menu_price[sel_bt_no];
						t2.setText(String.valueOf(money));
					}
				});
			}
			else
			{
				bt[i] = new JButton("");
			}
			cPanel.add(bt[i]);
			bt[i].setEnabled(false);
		}

		f.add(cPanel,BorderLayout.CENTER);
		
		// south
		JPanel sPanel = new JPanel(new GridLayout(2,0));
		JPanel sp1 = new JPanel();
		JPanel sp2 = new JPanel();
		
		JLabel l2 = new JLabel("");
		JTextField t1 = new JTextField(15);
		JButton bt_input = new JButton("입력");
		JButton bt_return = new JButton("반환");
		
		sp1.add(l2);
		sp1.add(t1);
		sp1.add(bt_input);
		sp1.add(bt_return);
		
		JLabel l3 = new JLabel("잔돈");

		sp2.add(l3);
		sp2.add(t2);
		sPanel.add(sp1);
		sPanel.add(sp2);
		
		f.add(sPanel,BorderLayout.SOUTH);
	
		bt_input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				money += Integer.parseInt(t1.getText());
				
				if(money >= 100)
				{
					for(int i = 0; i<numItems;i++)
					{
						bt[i].setEnabled(true);
					}
				}
				
				t2.setText(String.valueOf(money));
			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
```
</details>
<details>
<summary>자판기 메뉴 수정</summary>
  
```java
package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class test
{
	static int sel_bt_no=0;
	static int money=0;
	static int min_price=0;
	
	public static void main(String[] args) throws Exception
	{
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
    
		int numItems;
		int[] menu_num;
		String[] menu_title;
		int[] menu_price;
    
		Scanner in2 = new Scanner(file);

		// file 확인
		numItems = in2.nextInt();
		menu_num = new int[numItems];
		menu_title = new String[numItems];
		menu_price = new int[numItems];

		for(int i=0; i<numItems; i++)
		{
			menu_num[i] = in2.nextInt();
			menu_title[i] = in2.next();
			menu_price[i] = in2.nextInt();
		}
    
		in2.close();
		min_price = menu_price[0];
    
		for(int i=1; i<numItems; i++)
		{
			if(min_price > menu_price[i])
			{
				min_price = menu_price[i];
			}
		}
		
		JFrame f = new JFrame("자판기");
		f.setLayout(new BorderLayout());
		f.setSize(500, 800);
		JTextField t2 = new JTextField(15);
		
		// north
		JPanel nPanel = new JPanel(new FlowLayout());
		JLabel l1 = new JLabel();
		Font fnt1 = new Font("맑은 고딕", Font.BOLD, 40);
		l1.setFont(fnt1);
		l1.setText("자판기");

		nPanel.add(l1);
		f.add(nPanel, BorderLayout.NORTH);

		// center
		JPanel cPanel = new JPanel(new GridLayout(3,3));

		JButton[] bt = new JButton[9];
		Font fnt2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		for(int i=0; i<9; i++)
		{
			if(numItems > i)
			{
				bt[i] = new JButton(menu_title[i]);
				bt[i].setFont(fnt2);
				bt[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String str = e.getActionCommand();
						JOptionPane.showMessageDialog(f, str);
            
						for(int j=0; j<numItems;j++)
						{
							if(str.equals(menu_title[j]))
							{
								sel_bt_no = j;
							}
						}
						
						System.out.println(menu_title[sel_bt_no]+"의 가격은"+String.valueOf(menu_price[sel_bt_no])+"원 입니다.");
						
						if(money >= menu_price[sel_bt_no])
						{
							money -= menu_price[sel_bt_no];
							t2.setText(String.valueOf(money));
						}
						else
						{
							JOptionPane.showMessageDialog(f,  "돈이 부족합니다.");
						}
					}
				});
			}
			else
			{
				bt[i] = new JButton("");
			}
			cPanel.add(bt[i]);
			bt[i].setEnabled(false);
		}
    
		f.add(cPanel,BorderLayout.CENTER);
    
		// south
		JPanel sPanel = new JPanel(new GridLayout(2,0));
		JPanel sp1 = new JPanel();
		JPanel sp2 = new JPanel();
		
		JLabel l2 = new JLabel("");
		JTextField t1 = new JTextField(15);
		JButton bt_input = new JButton("입력");
		JButton bt_return = new JButton("반환");
		
		sp1.add(l2);
		sp1.add(t1);
		sp1.add(bt_input);
		sp1.add(bt_return);
		
		JLabel l3 = new JLabel("잔돈");

		sp2.add(l3);
		sp2.add(t2);
		sPanel.add(sp1);
		sPanel.add(sp2);
		f.add(sPanel,BorderLayout.SOUTH);
    
		bt_input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				money += Integer.parseInt(t1.getText());
				t1.setText("");
				
				if(money >= min_price)
				{
					for(int i = 0; i<numItems;i++)
					{
						bt[i].setEnabled(true);
					}
				}
				
				t2.setText(String.valueOf(money));
			}
		});
		
		
		bt_return.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		
		JMenuBar mbar = new JMenuBar();
		JMenu menu1 = new JMenu("관리자 메뉴");
		JMenuItem m1_item1 = new JMenuItem("기존 메뉴 수정");
		JMenuItem m1_item2 = new JMenuItem("신규 메뉴 추가");
		JMenuItem m1_item3 = new JMenuItem("종료");
		menu1.add(m1_item1);
		menu1.add(m1_item2);
		menu1.addSeparator();
		menu1.add(m1_item3);
		mbar.add(menu1);

		f.setJMenuBar(mbar);

		JDialog editDialog = new JDialog(f, "기존 메뉴 수정", true);
		editDialog.setSize(400, 300);
		
		JPanel dpanel = new JPanel(new GridLayout(2,0));
		JPanel dp1 = new JPanel(new GridLayout(2,3));
		JPanel dp2 = new JPanel(new FlowLayout());
		
		JLabel dl1 = new JLabel("메뉴");
		JLabel dl2 = new JLabel("이름");
		JLabel dl3 = new JLabel("가격");
		
		dp1.add(dl1);
		dp1.add(dl2);
		dp1.add(dl3);
		
		JComboBox<String> dcb = new JComboBox<String>();
    
		for(int i = 0; i<numItems;i++)
		{
			dcb.addItem( String.valueOf(menu_num[i]) );
		}
		
		dp1.add(dcb);
		
		JTextField dt1 = new JTextField(10);
		JTextField dt2 = new JTextField(10);
				
		dp1.add(dt1);
		dp1.add(dt2);
	
		
		JButton btDialog = new JButton("확인");
		dp2.add(btDialog);
    
		dpanel.add(dp1);
		dpanel.add(dp2);
		
		editDialog.add(dpanel);
		
		m1_item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
        		//JOptionPane.showMessageDialog(f, e.getActionCommand());
				editDialog.setVisible(true);
			}
		});
		
		btDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int dcb_idx = dcb.getSelectedIndex();
				menu_title[dcb_idx] = dt1.getText();
				menu_price[dcb_idx] = Integer.parseInt(dt2.getText());
				
				FileWriter fw;
        
				try {
					fw = new FileWriter("c:\\Temp\\menu.txt");
					String out="";
					out = String.format("%d\r\n", numItems );
					fw.write(out);
					
					for(int i=0;i<numItems;i++)
					{
						out = String.format("%d %s %d\r\n",menu_num[i],menu_title[i], menu_price[i]);
						fw.write(out);
					}
					
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				editDialog.dispose();
			}
		});
    
		dcb.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				int index = ((JComboBox<String>)dcb).getSelectedIndex();
				dt1.setText( menu_title[index]);
				dt2.setText( String.valueOf(menu_price[index]) );
			}
		});;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
```
</details>

## 과제
<details>
<summary>구구단 출력</summary>
  
```java
package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		for (int j = 1; j <= 9; j++)
		{
			for (int i = 2; i <= 9; i++)
			{
				System.out.printf("%d * %d = %2d  ", i, j, j * i);
			}
			System.out.printf("\n");
		}
		
		in.close();
	}
}
```
</details>
<details>
<summary>자판기</summary>
  
```java
package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//int menu_1_Price = 100;
		//int menu_2_Price = 200;
		//int menu_3_Price = 200;
		
		String menu_1_Name = "커피";
		String menu_2_Name = "우유";
		String menu_3_Name = "콜라";
		
		//System.out.println("메뉴를 설정해주세요.\n 1. 이름 : ");
		//String menu_1_Name = in.nextLine();
		System.out.printf("%s의 가격을 설정해주세요.\n 1. 가격 : ", menu_1_Name);
		int menu_1_Price = in.nextInt();

		//System.out.println("메뉴를 설정해주세요.\n 2. 이름 : ");
		//String menu_2_Name = in.nextLine();
		System.out.printf("%s의 가격을 설정해주세요.\n 2. 가격 : " ,menu_2_Name);
		int menu_2_Price = in.nextInt();

		//System.out.println("메뉴를 설정해주세요.\n 3. 이름 : ");
		//String menu_3_Name = in.nextLine();
		System.out.printf("%s의 가격을 설정해주세요.\n 3. 가격 : ", menu_3_Name);
		int menu_3_Price = in.nextInt();
		
		int price = (menu_1_Price < menu_2_Price) ? 
					((menu_1_Price < menu_3_Price) ? menu_1_Price : menu_3_Price) : 
					((menu_2_Price < menu_3_Price) ? menu_2_Price : menu_3_Price);
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");
		System.out.println("돈을 입력하세요...");
		
		boolean moneyFlag = true;
		int money = 0;
		
		while(moneyFlag)
		{
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d원 입니다.\n", money);
      
			if(money < price)
			{
				System.out.println("돈이 부족합니다.\n");
			}
      
			System.out.println("더 입력하시겠습니까? (Y or N)\n");
			char val = in.next().charAt(0);
			
			switch(val)
			{
			case 'N':
			case 'n':
				moneyFlag = false;
				break;
				
			case 'Y':
			case 'y':
				break;
			}
		}
				
		moneyFlag = true;
		boolean missMenu = false;
		
		while(moneyFlag)
		{
			if (money < price)
			{
				System.out.println("돈이 부족합니다.");
				System.out.printf("잔돈은 %d원 입니다.\n", money);
				break;
			}
			
			System.out.println("=====================");
			System.out.printf("1. %s     %d원\n", menu_1_Name, menu_1_Price);
			System.out.printf("2. %s     %d원\n", menu_2_Name, menu_2_Price);
			System.out.printf("3. %s     %d원\n", menu_3_Name, menu_3_Price);
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.");
			
			int menu = in.nextInt();
			
			switch(menu)
			{
			case 1:
				if(money >= menu_1_Price)
				{
					money -= menu_1_Price;
					System.out.printf("%s를 고르셨습니다.\n", menu_1_Name);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
				break;
			
			case 2:
				if(money >= menu_2_Price)
				{
					money -= menu_2_Price;
					System.out.printf("%s를 고르셨습니다.\n", menu_2_Name);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
				break;
			
			case 3:
				if(money >= menu_3_Price)
				{
					money -= menu_3_Price;
					System.out.printf("%s를 고르셨습니다.\n", menu_3_Name);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
				break;
			
			default:
				System.out.println("메뉴를 잘 못 고르셨습니다.");
				missMenu = true;
				break;
			}
			
			if (missMenu)
			{
				System.out.printf("%d원이 남았습니다.\n", money);
				System.out.println("다시 고르시겠습니까? (Y or N)\n");
				char val = in.next().charAt(0);
				
				switch(val)
				{
				case 'N':
				case 'n':
					moneyFlag = false;
					break;
					
				case 'Y':
				case 'y':
					missMenu = false;
					break;
				}
			}
			else
			{
				if (money < price)
				{
					System.out.println("돈이 부족합니다.");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				else
				{
					System.out.printf("%d원이 남았습니다.\n", money);
					System.out.println("더 고르시겠습니까? (Y or N)\n");
					char val = in.next().charAt(0);
					
					switch(val)
					{
					case 'N':
					case 'n':
						moneyFlag = false;
						break;
						
					case 'Y':
					case 'y':
						break;
					}
				}
			}
		}
		in.close();
	}
}
```
</details>
<details>
<summary>배열 활용 자판기</summary>
  
```java
package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String[] menuName = {"커피", "우유", "콜라"};
		int[] menuPrice = {0, 0, 0};
		
		for (int i = 0; i < menuName.length; i++)
		{
			System.out.printf("%s의 가격을 설정해주세요.\n %d. 가격 : ", menuName[i], i + 1);
			menuPrice[i] = in.nextInt();
		}
		
		int price = (menuPrice[0] < menuPrice[1]) ? 
					((menuPrice[0] < menuPrice[2]) ? menuPrice[0] : menuPrice[2]) : 
					((menuPrice[1] < menuPrice[2]) ? menuPrice[1] : menuPrice[2]);
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");
		System.out.println("돈을 입력하세요...");
		
		boolean moneyFlag = true;
		int money = 0;
		
		while(moneyFlag)
		{
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d원 입니다.\n", money);
      
			if(money < price)
			{
				System.out.println("돈이 부족합니다.\n");
			}
      
			System.out.println("더 입력하시겠습니까? (Y or N)\n");
			char val = in.next().charAt(0);
			
			switch(val)
			{
			case 'N':
			case 'n':
				moneyFlag = false;
				break;
				
			case 'Y':
			case 'y':
				break;
			}
		}
		
		moneyFlag = true;
		boolean missMenu = false;
		
		while(moneyFlag)
		{
			if (money < price)
			{
				System.out.println("돈이 부족합니다.");
				System.out.printf("잔돈은 %d원 입니다.\n", money);
				break;
			}
			
			System.out.println("=====================");
      
			for (int i = 0; i < menuName.length; i++)
			{
				System.out.printf("%d. %s     %d원\n", i + 1, menuName[i], menuPrice[i]);
			}
      
			System.out.printf("%d. 잔돈 반환\n", menuName.length + 1);
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.");
			
			int menu = in.nextInt();
			
			if (menu == menuName.length + 1)
			{
				System.out.printf("잔돈은 %d원 입니다.\n", money);
				break;
			}
			else if (menu < menuName.length + 1 && menu > 0)
			{
				if(money >= menuPrice[menu - 1])
				{
					money -= menuPrice[menu - 1];
					System.out.printf("%s를 고르셨습니다.\n", menuName[menu - 1]);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
			}
			else
			{
				System.out.println("메뉴를 잘 못 고르셨습니다.");
				System.out.println("메뉴를 다시 골라주세요.");
				missMenu = true;
			}
			
			if (!missMenu)
			{
				if (money < price)
				{
					System.out.println("돈이 부족합니다.");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				else
				{
					System.out.printf("%d원이 남았습니다.\n", money);
					System.out.println("더 고르시겠습니까? (Y or N)\n");
					char val = in.next().charAt(0);
					
					switch(val)
					{
					case 'N':
					case 'n':
						System.out.printf("잔돈은 %d원 입니다.\n", money);
						moneyFlag = false;
						break;
						
					case 'Y':
					case 'y':
						break;
					}
				}
			}
		}
		in.close();
	}
}
```
</details>
<details>
<summary>성적표 등수 넣기</summary>
  
```java
package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		
		int numStudents;
		System.out.print("학생수: ");
		numStudents = in.nextInt();
		int[] score = new int[numStudents];
		int total = 0;
		double average;
		String[] name = new String[numStudents];
		int[] number = new int[numStudents];

		for(int i = 0; i < numStudents; i++)
		{
			number[i] = i + 1;
		}
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.printf("%d번 학생 이름: ", i + 1);
			name[i] = in.next();
		}
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.printf("%d번 학생 점수: ", i + 1);
			score[i] = in.nextInt();
			total += score[i]; 
		}

		average = (double)total/(double)numStudents;
		System.out.printf("총점수 %d  평균: %f\n", total, average);

		int maxScore = score[0];
		int maxNo = 0;
		
		for(int i = 1; i < numStudents; i++)
		{
			if(maxScore < score[i])
			{
				maxScore=score[i];
				maxNo = i;
			}
		}
    
		System.out.printf("%d번  %d가 제일 높은 점수입니다.\n", maxNo + 1,maxScore);
	
		int min;
		int temp;
		String temp_2;
		
		for(int i = 0; i < numStudents; i++)
		{
			min = i;
      
			for(int j = i + 1; j < numStudents; j++)
			{
				if(score[min] < score[j])
				{
					min = j;
				}
			}
      
			temp = score[min];
			score[min] = score[i];
			score[i] = temp;
			
			temp_2 = name[min];
			name[min] = name[i];
			name[i] = temp_2;
			
			temp = number[min];
			number[min] = number[i];
			number[i] = temp;
		}
		
		System.out.println("===================================");
		System.out.println("번호\t이름\t점수\t석차");
		System.out.println("===================================");
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d \n", number[i], name[i], score[i], i + 1);		
		}
		
		in.close();
	}
}
```
</details>
<details>
<summary>자판기 메뉴파일 처리</summary>
  
```java
package com.test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class test
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		int numItems;	
		
		if(isExists)
		{
			Scanner fileIn = new Scanner(file);
			
			numItems = fileIn.nextInt();
			int[] menuNum = new int[numItems];
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];

			for(int i = 0; i < numItems; i++)
			{
				menuNum[i] = fileIn.nextInt();
				menuName[i] = fileIn.next();
				menuPrice[i] = fileIn.nextInt();
			}
      
			fileIn.close();
			
			int price = 0;
			
			for (int i = 0; i < numItems; i++)
			{
				if (price > menuPrice[i])
				{
					price = menuPrice[i];
				}
			}
					
			System.out.println("돈을 입력하세요...");
			
			boolean moneyFlag = true;
			int money = 0;
			String newMenuName = "";
			int newMenuPrice = 0;
			
			while(moneyFlag)
			{
				money = money + in.nextInt();
        
				if (money == -999)
				{
					FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
					String out = "";
					out = "";
          
					while(true)
					{
						System.out.println("=====================");
						System.out.println("      자판기 편집");
						System.out.println("=====================");
            
						for (int i = 0; i < numItems; i++)
						{
							System.out.printf("%d. %s     %d원\n", menuNum[i], menuName[i], menuPrice[i]);
						}
            
						System.out.printf("%d. 메뉴 추가\n", numItems + 1);
						System.out.printf("%d. 편집 종료\n", numItems + 2);
						System.out.println("=====================");
						System.out.println("편집할 메뉴를 선택해주세요.");
						
						int menu = in.nextInt();
						
						if (menu < numItems + 1 && menu > 0)
						{
							System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", menu);
							menuName[menu - 1] = in.next();
							menuPrice[menu - 1] = in.nextInt();
						}
						else if (menu == numItems + 1)
						{
							System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", numItems + 1);
							newMenuName = in.next();
							newMenuPrice = in.nextInt();
							System.out.println("메뉴가 추가되었습니다.");
							break;
						}
						else
						{
							break;
						}
					}

					if (newMenuName != "")
					{
						out = String.format("%d\r\n", numItems + 1);
						fw.write(out);
					}
					else
					{
						out = String.format("%d\r\n", numItems);
						fw.write(out);
					}
					
					for (int i = 0; i < numItems; i++)
					{
						out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i] );
						fw.write(out);
					}
					
					if (newMenuName != "")
					{
						out = String.format("%d %s %d\r\n", numItems + 1, newMenuName, newMenuPrice);
						fw.write(out);
					}
					
					moneyFlag = false;
					fw.close();
					in.close();
				}
				else
				{
					System.out.printf("입력한 돈은 %d원 입니다.\n", money);
          
					if(money < price)
					{
						System.out.println("돈이 부족합니다.\n");
					}
          
					System.out.println("더 입력하시겠습니까? (Y or N)\n");
					char val = in.next().charAt(0);
					
					switch(val)
					{
					case 'N':
					case 'n':
						moneyFlag = false;
						break;
						
					case 'Y':
					case 'y':
						break;
					}
				}
			}
			
			if (money != -999)
			{
				moneyFlag = true;
			}
			
			boolean missMenu = false;
			
			while(moneyFlag)
			{
				if (money < price)
				{
					System.out.println("돈이 부족합니다.");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				
				System.out.println("=====================");
				System.out.println("      자판기");
				System.out.println("=====================");
        
				for (int i = 0; i < numItems; i++)
				{
					System.out.printf("%d. %s     %d원\n", menuNum[i], menuName[i], menuPrice[i]);
				}
        
				System.out.printf("%d. 잔돈 반환\n", numItems + 1);
				System.out.println("=====================");
				System.out.println("메뉴를 선택해주세요.");
				
				int menu = in.nextInt();
				
				if (menu == menuName.length + 1)
				{
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				else if (menu < numItems + 1 && menu > 0)
				{
					if(money >= menuPrice[menu - 1])
					{
						money -= menuPrice[menu - 1];
						System.out.printf("%s를 고르셨습니다.\n", menuName[menu - 1]);
					}
					else
					{
						System.out.println("돈이 부족합니다.");
					}
				}
				else
				{
					System.out.println("메뉴를 잘 못 고르셨습니다.");
					System.out.println("메뉴를 다시 골라주세요.");
					missMenu = true;
				}
				
				if (!missMenu)
				{
					if (money < price)
					{
						System.out.println("돈이 부족합니다.");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
						break;
					}
					else
					{
						System.out.printf("%d원이 남았습니다.\n", money);
						System.out.println("더 고르시겠습니까? (Y or N)\n");
						char val = in.next().charAt(0);
						
						switch(val)
						{
						case 'N':
						case 'n':
								System.out.printf("잔돈은 %d원 입니다.\n", money);
								moneyFlag = false;
							break;
							
						case 'Y':
						case 'y':
							break;
						}
					}
				}
			}
			
			in.close();
		}
		else
		{
			System.out.println("File Not Found");
			FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
			
			System.out.println("메뉴의 갯수를 입력해주세요.");
			numItems = in.nextInt();
			String out = String.format("%d\r\n", numItems);
			fw.write(out);
			
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];

			out="";
      
			for (int i = 0; i < numItems; i++)
			{
				System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", i + 1);
				menuName[i] = in.next();
				menuPrice[i] = in.nextInt();
				out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i] );
				fw.write(out);
			}
			
			fw.close();
			in.close();
		}
		
	}
}
```
</details>
<details>
<summary>자판기 메뉴 수정</summary>
  
```java
package com.test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class test
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		int numItems;
		
		if(isExists)
		{
			Scanner fileIn = new Scanner(file);
			numItems = fileIn.nextInt();
			int[] menuNum = new int[numItems];
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];

			for(int i = 0; i < numItems; i++)
			{
				menuNum[i] = fileIn.nextInt();
				menuName[i] = fileIn.next();
				menuPrice[i] = fileIn.nextInt();
			}
      
			fileIn.close();
			
			int price = 0;
			
			for (int i = 0; i < numItems; i++)
			{
				if (price > menuPrice[i])
				{
					price = menuPrice[i];
				}
			}
					
			System.out.println("돈을 입력하세요...");
			
			boolean moneyFlag = true;
			int money = 0;
			String newMenuName = "";
			int newMenuPrice = 0;
			
			while(moneyFlag)
			{
				money = money + in.nextInt();
        
				if (money == -999)
				{
					FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
					String out = "";
					out = "";
          
					while(true)
					{
						System.out.println("=====================");
						System.out.println("      자판기 편집");
						System.out.println("=====================");
            
						for (int i = 0; i < numItems; i++)
						{
							System.out.printf("%d. %s     %d원\n", menuNum[i], menuName[i], menuPrice[i]);
						}
						System.out.printf("%d. 메뉴 추가\n", numItems + 1);
						System.out.printf("%d. 편집 종료\n", numItems + 2);
						System.out.println("=====================");
						System.out.println("편집할 메뉴를 선택해주세요.");
						
						int menu = in.nextInt();
						
						if (menu < numItems + 1 && menu > 0)
						{
							System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", menu);
							menuName[menu - 1] = in.next();
							menuPrice[menu - 1] = in.nextInt();
						}
						else if (menu == numItems + 1)
						{
							System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", numItems + 1);
							newMenuName = in.next();
							newMenuPrice = in.nextInt();
							System.out.println("메뉴가 추가되었습니다.");
							break;
						}
						else
						{
							break;
						}
					}

					if (newMenuName != "")
					{
						out = String.format("%d\r\n", numItems + 1);
						fw.write(out);
					}
					else
					{
						out = String.format("%d\r\n", numItems);
						fw.write(out);
					}
					
					for (int i = 0; i < numItems; i++)
					{
						out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i] );
						fw.write(out);
					}
					
					if (newMenuName != "")
					{
						out = String.format("%d %s %d\r\n", numItems + 1, newMenuName, newMenuPrice);
						fw.write(out);
					}
					
					moneyFlag = false;
					fw.close();
					in.close();
				}
				else
				{
					System.out.printf("입력한 돈은 %d원 입니다.\n", money);
          
					if(money < price)
					{
						System.out.println("돈이 부족합니다.\n");
					}
          
					System.out.println("더 입력하시겠습니까? (Y or N)\n");
					char val = in.next().charAt(0);
					
					switch(val)
					{
					case 'N':
					case 'n':
						moneyFlag = false;
						break;
						
					case 'Y':
					case 'y':
						break;
					}
				}
			}
			
			if (money != -999)
			{
				moneyFlag = true;
			}
			
			boolean missMenu = false;
			
			while(moneyFlag)
			{
				if (money < price)
				{
					System.out.println("돈이 부족합니다.");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				
				System.out.println("=====================");
				System.out.println("      자판기");
				System.out.println("=====================");
        
				for (int i = 0; i < numItems; i++)
				{
					System.out.printf("%d. %s     %d원\n", menuNum[i], menuName[i], menuPrice[i]);
				}
        
				System.out.printf("%d. 잔돈 반환\n", numItems + 1);
				System.out.println("=====================");
				System.out.println("메뉴를 선택해주세요.");
				
				int menu = in.nextInt();
				
				if (menu == menuName.length + 1)
				{
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				else if (menu < numItems + 1 && menu > 0)
				{
					if(money >= menuPrice[menu - 1])
					{
						money -= menuPrice[menu - 1];
						System.out.printf("%s를 고르셨습니다.\n", menuName[menu - 1]);
					}
					else
					{
						System.out.println("돈이 부족합니다.");
					}
				}
				else
				{
					System.out.println("메뉴를 잘 못 고르셨습니다.");
					System.out.println("메뉴를 다시 골라주세요.");
					missMenu = true;
				}
				
				if (!missMenu)
				{
					if (money < price)
					{
						System.out.println("돈이 부족합니다.");
						System.out.printf("잔돈은 %d원 입니다.\n", money);
						break;
					}
					else
					{
						System.out.printf("%d원이 남았습니다.\n", money);
						System.out.println("더 고르시겠습니까? (Y or N)\n");
						char val = in.next().charAt(0);
						
						switch(val)
						{
						case 'N':
						case 'n':
								System.out.printf("잔돈은 %d원 입니다.\n", money);
								moneyFlag = false;
							break;
							
						case 'Y':
						case 'y':
							break;
						}
					}
				}
			}
			
			in.close();
		}
		else
		{
			System.out.println("File Not Found");
			FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
			
			System.out.println("메뉴의 갯수를 입력해주세요.");
			numItems = in.nextInt();
			String out = String.format("%d\r\n", numItems);
			fw.write(out);
			
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];
			out="";
      
			for (int i = 0; i < numItems; i++)
			{
				System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", i + 1);
				menuName[i] = in.next();
				menuPrice[i] = in.nextInt();
				out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i] );
				fw.write(out);
			}
      
			fw.close();
			in.close();
		}
	}
}
```
</details>
<details>
<summary>계산기 GUI</summary>
  
```java
package com.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test
{
	public static void main(String[] args)
	{
		new GridFrame_2();
	}
}

class GridFrame_2 extends JFrame
{
	GridFrame_2()
	{
		setTitle("계산기");
		setLayout(new BorderLayout());
		
		// North
		JPanel nPanel = new JPanel();
		
		JTextField txtf1 = new JTextField(15); 
		
		nPanel.add(txtf1);
		add(nPanel, BorderLayout.NORTH);
		
		// South
		JPanel sPanel = new JPanel(new GridLayout(1, 0));
		JPanel subPanel = new JPanel(new GridLayout(4, 4, 10, 10));
		JPanel sp1 = new JPanel();
		
		JButton bton = new JButton("on");
		JButton btoff = new JButton("off");
		
		JButton bt9 = new JButton("9");
		JButton bt8 = new JButton("8");
		JButton bt7 = new JButton("7");
		JButton btadd = new JButton("+");
		
		JButton bt4 = new JButton("4");
		JButton bt5 = new JButton("5");
		JButton bt6 = new JButton("6");
		JButton btsub = new JButton("-");
		
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		JButton btmul = new JButton("X");
		
		JButton bt0 = new JButton("0");
		JButton btdot = new JButton(".");
		JButton btequ = new JButton("=");
		JButton btdiv = new JButton("/");
		
		sp1.add(bton);
		sp1.add(btoff);
		
		subPanel.add(bt9);
		subPanel.add(bt8);
		subPanel.add(bt7);
		subPanel.add(btadd);
		
		subPanel.add(bt4);
		subPanel.add(bt5);
		subPanel.add(bt6);
		subPanel.add(btsub);
		
		subPanel.add(bt1);
		subPanel.add(bt2);
		subPanel.add(bt3);
		subPanel.add(btmul);
		
		subPanel.add(bt0);
		subPanel.add(btdot);
		subPanel.add(btequ);
		subPanel.add(btdiv);
		
		sp1.add(subPanel);
		sPanel.add(sp1);
		
		add(sPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 300);
		setVisible(true);
	}
}
```
</details>
<details>
<summary>자판기 UI 기본 동작</summary>
  
```java
package com.test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test
{
	static int sel_bt_no=0;
	static int money=0;
	
	public static void main(String[] args) throws Exception
	{
		JFrame f = new JFrame("자판기");

		f.setLayout(new BorderLayout());
		
		JPanel nPanel = new JPanel();

		JLabel l1 = new JLabel("자판기");
		
		nPanel.add(l1);
		f.add(nPanel, BorderLayout.NORTH);
		
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		int numItems;
		
		ArrayList<Integer> menuNum = new ArrayList<Integer>();
		ArrayList<String> menuName = new ArrayList<String>();
		ArrayList<Integer> menuPrice = new ArrayList<Integer>();
		ArrayList<Integer> menuCount = new ArrayList<Integer>();
		ArrayList<JButton> button = new ArrayList<JButton>();
		
		if(isExists)
		{
			Scanner fileIn = new Scanner(file);
			
			numItems = fileIn.nextInt();

			JPanel cPanel = new JPanel(new GridLayout((numItems >= 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)), 0, 10, 10));
			JPanel cPanel_2 = new JPanel();
			
			JPanel sPanel = new JPanel(new BorderLayout());
			JPanel subPanel = new JPanel();
			JPanel subPanel_2 = new JPanel();
			
			JTextField txtf1 = new JTextField(10); 
			JButton bt1 = new JButton("입력");
			JButton bt2 = new JButton("잔돈 반환");
			JLabel l2 = new JLabel("잔돈 : 0원");
			
			for(int i = 0; i < numItems; i++)
			{
				menuNum.add(fileIn.nextInt());
				menuName.add(fileIn.next());
				menuPrice.add(fileIn.nextInt());
				menuCount.add(fileIn.nextInt());
				button.add(new JButton(menuName.get(i)));
				button.get(i).addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						String str = e.getActionCommand();
						
						for (int j = 0; j < numItems; j++)
						{
							if(str.equals(menuName.get(j)))
							{
								sel_bt_no = j;
							}
						}
						
						if (menuCount.get(sel_bt_no) > 0)
						{
							money -= menuPrice.get(sel_bt_no);
							menuCount.set(sel_bt_no, menuCount.get(sel_bt_no) - 1);
							
							if (menuCount.get(sel_bt_no) > 0)
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "(이)가 " + menuCount.get(sel_bt_no) + "개 남았습니다.";
							}
							else
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "의 수량이 소진 되었습니다.";
							}
							
							JOptionPane.showMessageDialog(f, str);
							
							l2.setText("잔돈 : " + test.money + "원");
							
							for (int i = 0; i < numItems; i++)
							{
								if (menuCount.get(i) == 0)
								{
									button.get(i).setEnabled(false);
								}
								else
								{
									if(test.money >= menuPrice.get(i))
									{
										button.get(i).setEnabled(true);
									}
									else
									{
										button.get(i).setEnabled(false);
									}
								}
							}
						}
					}
				});
				cPanel.add(button.get(i));
				button.get(i).setEnabled(false);
			}
			
			fileIn.close();
			
			cPanel_2.add(cPanel);
			
			subPanel.add(txtf1);
			subPanel.add(bt1);
			subPanel.add(bt2);
			subPanel_2.add(l2);
			
			f.add(cPanel_2, BorderLayout.CENTER);
			f.add(sPanel, BorderLayout.SOUTH);
			
			sPanel.add(subPanel, BorderLayout.NORTH);
			sPanel.add(subPanel_2, BorderLayout.SOUTH);
			
			bt1.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (!txtf1.getText().equals(""))
					{
						if (!txtf1.getText().equals("-999"))
						{
							test.money += Integer.parseInt(txtf1.getText());
							l2.setText("잔돈 : " + test.money + "원");
							txtf1.setText("");
							
							for (int i = 0; i < numItems; i++)
							{
								if (menuCount.get(i) == 0)
								{
									button.get(i).setEnabled(false);
								}
								else
								{
									if(test.money >= menuPrice.get(i))
									{
										button.get(i).setEnabled(true);
									}
									else
									{
										button.get(i).setEnabled(false);
									}
								}
							}
						}
						else
						{
							f.setTitle("자판기 관리자모드");
							l1.setText("자판기 관리자모드");
							txtf1.setText("");
							JButton addMenu = new JButton("메뉴 추가");
							
							addMenu.addActionListener(new ActionListener()
							{
								@Override
								public void actionPerformed(ActionEvent e)
								{
									cPanel.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
									f.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
									cPanel.remove(numItems);
									f.setVisible(true);
								}
							});
							cPanel.add(addMenu);
							
							cPanel.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
							f.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
							f.setVisible(true);
						}
					}
				}
			});
			
			bt2.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					l2.setText("잔돈 : 0원");
					txtf1.setText("");

					String str = "잔돈은 " + test.money + "원 입니다";
					JOptionPane.showMessageDialog(f, str);
					
					for (int i = 0; i < numItems; i++)
					{
						button.get(i).setEnabled(false);
					}
				}
			});
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(300, (numItems >= 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)) * 40 + 130);
			f.setVisible(true);
		}
	}
}
```
</details>
<details>
<summary>GUI 미사용 자판기</summary>
  
```java
package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Text_VendingMachine
{
	static int numItems;
  
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		if(isExists)
		{
			Scanner fileIn = new Scanner(file);
			
			numItems = fileIn.nextInt();
			
			ArrayList<Integer> menuNum = new ArrayList<Integer>();
			ArrayList<String> menuName = new ArrayList<String>();
			ArrayList<Integer> menuPrice = new ArrayList<Integer>();
			ArrayList<Integer> menuCount = new ArrayList<Integer>();

			for(int i = 0; i < numItems; i++)
			{
				menuNum.add(fileIn.nextInt());
				menuName.add(fileIn.next());
				menuPrice.add(fileIn.nextInt());
				menuCount.add(fileIn.nextInt());
			}
      
			fileIn.close();
			
			int price = 0;
			
			for (int i = 0; i < numItems; i++)
			{
				if (price > menuPrice.get(i))
				{
					price = menuPrice.get(i);
				}
			}
			
			Runtime rt = Runtime.getRuntime();
			
			rt.addShutdownHook( // 프로그램 종료 감지
					new Thread()
					{
						public void run()
						{
							FileWriter fw;
              
							try  // 파일 저장
							{
								fw = new FileWriter("c:\\Temp\\menu.txt");
								
								String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
								fw.write(out);
								
								for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
								{
									out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
									fw.write(out);
								}
								
								fw.close();
							}
							catch (IOException e) // 실패
							{
								e.printStackTrace();
							}
							
						}
					});

			System.out.println("돈을 입력하세요...");
			
			boolean moneyFlag = true;
			int money = 0;
			
			while(moneyFlag)
			{
				String select = in.next();
        
				try 
				{
					money = money + Integer.parseInt(select);
					
					if (money == -999) // -999 입력시 메뉴 편집
					{
						FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
						String out = "";
						
						out = ""; // 초기화
						while(true)
						{
							System.out.println("=====================");
							System.out.println("      자판기 편집");
							System.out.println("=====================");
							for (int i = 0; i < numItems; i++)
							{
								System.out.printf("%d. %s     %d원\n", i + 1, menuName.get(i), menuPrice.get(i));
							}
							System.out.printf("%d. 메뉴 추가\n", numItems + 1);
							System.out.printf("%d. 메뉴 삭제\n", numItems + 2);
							System.out.printf("%d. 편집 종료\n", numItems + 3);
							System.out.println("=====================");
							System.out.println("편집할 메뉴를 선택해주세요.");
							
							select = in.next();
							
							try 
							{
								int menu = Integer.parseInt(select);
								
								if (menu < numItems + 1 && menu > 0)
								{
									System.out.printf("%d번째 메뉴의 이름과 가격, 수량을 입력해주세요.", menu);
									menuName.set(menu - 1, in.next());
									menuPrice.set(menu - 1, in.nextInt());
									menuCount.set(menu - 1, in.nextInt());
								}
								else if (menu == numItems + 1)
								{
									System.out.printf("추가할 %d번째 메뉴의 이름과 가격, 수량을 입력해주세요.", ++numItems);
									menuName.add(in.next());
									menuPrice.add(in.nextInt());
									menuCount.add(in.nextInt());
									System.out.println("메뉴가 추가되었습니다.");
								}
								else if (menu == numItems + 2)
								{
									System.out.printf("삭제할 메뉴를 입력해주세요.");
									int delNum = in.nextInt();
									menuName.remove(delNum - 1);
									menuPrice.remove(delNum - 1);
									menuCount.remove(delNum - 1);
								}
								else
								{
									money += 999;
									System.out.println("돈을 입력하세요...");
									break;
								}
							}
							catch (NumberFormatException exception)
							{
								System.out.println("숫자만 입력해주세요.\n");
							}
						}
						
						out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
						fw.write(out);
						
						for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
						{
							out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
							fw.write(out);
						}
						
						fw.close();
					}
					else
					{
						System.out.printf("입력한 돈은 %d원 입니다.\n", money);
						if(money < price)
						{
							System.out.println("돈이 부족합니다.\n");
						}
						
						boolean moreMoney = true;
						
						while(moreMoney)
						{
							System.out.println("더 입력하시겠습니까? (Y or N)\n");
							char val = in.next().charAt(0);
							
							switch(val)
							{
							case 'N':
							case 'n':
								moneyFlag = false;
								moreMoney = false;
								break;
								
							case 'Y':
							case 'y':
								moreMoney = false;
								break;
								
							default:
								System.out.println("Y와 N중 한가지만 입력해주세요.\n");
								break;
							}
						}
					}
				}
				catch (NumberFormatException exception)
				{
					System.out.println("숫자만 입력해주세요.\n");
				}
			}
			
			if (money != -999)
			{
				moneyFlag = true;
			}
			
			boolean missMenu = false;
			
			while(moneyFlag)
			{
				if (money < price)
				{
					System.out.println("돈이 부족합니다.");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				
				System.out.println("=====================");
				System.out.println("      자판기");
				System.out.println("=====================");
        
				for (int i = 0; i < numItems; i++)
				{
					if (menuCount.get(i) == 0)
					{
						System.out.printf("%d. %s     %d원 (품절)\n", i + 1, menuName.get(i), menuPrice.get(i));
					}
					else
					{
						System.out.printf("%d. %s     %d원 (%d개 남음)\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
					}
				}
        
				System.out.printf("%d. 잔돈 반환\n", numItems + 1);
				System.out.println("=====================");
				System.out.println("메뉴를 선택해주세요.");
				
				String select = in.next();
        
				try
				{
					int menu = Integer.parseInt(select);
					
					if (menu == numItems + 1) // 잔돈반환
					{
						System.out.printf("잔돈은 %d원 입니다.\n", money);
						break;
					}
					else if (menu < numItems + 1 && menu > 0) // 메뉴 선택
					{
						if(money >= menuPrice.get(menu - 1))
						{
							if (menuCount.get(menu - 1) > 0) // 수량이 1개 이상이라면
							{
								money -= menuPrice.get(menu - 1);
								menuCount.set(menu - 1, menuCount.get(menu - 1) - 1);
								System.out.printf("%s를 고르셨습니다.\n", menuName.get(menu - 1));
                
								try // 로그파일 생성
								{
									LocalDateTime currentDateTime  = LocalDateTime.now(); // 날짜
									FileWriter lfw = new FileWriter("c:\\Temp\\Log.txt", true);
									String out = String.format("%d-%d-%dT%d:%d:%d %d번 물품 %s(%d원)이 %d개 잔돈은 %d원 남았습니다.\r\n", currentDateTime.getYear(), currentDateTime.getMonthValue(), currentDateTime.getDayOfMonth(),
											currentDateTime.getHour(), currentDateTime.getMinute(), currentDateTime.getSecond(), 
											menuNum.get(menu - 1), menuName.get(menu - 1), menuPrice.get(menu - 1), menuCount.get(menu - 1), money);
									
									lfw.append(out);
									lfw.close();
								}
								catch (IOException e1)
								{
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							else // 수량 없음
							{
								System.out.println("수량이 부족합니다.");
							}
						}
						else
						{
							System.out.println("돈이 부족합니다.");
						}
					}
					else
					{
						System.out.println("메뉴를 잘 못 고르셨습니다.");
						System.out.println("메뉴를 다시 골라주세요.");
						missMenu = true;
					}
					
					if (!missMenu)
					{
						if (money < price)
						{
							System.out.println("돈이 부족합니다.");
							System.out.printf("잔돈은 %d원 입니다.\n", money);
							break;
						}
						else
						{
							System.out.printf("%d원이 남았습니다.\n", money);
							System.out.println("더 고르시겠습니까? (Y or N)\n");
							char val = in.next().charAt(0);
							
							switch(val)
							{
							case 'N':
							case 'n':
								System.out.printf("잔돈은 %d원 입니다.\n", money);
								moneyFlag = false;
								break;
								
							case 'Y':
							case 'y':
								break;
							}
						}
					}
				}
				catch (NumberFormatException exception)
				{
					System.out.println("숫자만 입력해주세요.\n");
				}
			}
			
			in.close();
		}
		else // 메뉴 파일이 없다면 메뉴파일 생성
		{
			System.out.println("File Not Found");
			FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
			
			System.out.println("메뉴의 갯수를 입력해주세요.");
			numItems = in.nextInt();
			String out = String.format("%d\r\n", numItems);
			fw.write(out);
			
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];
			int[] menuCount = new int[numItems];

			out="";
      
			for (int i = 0; i < numItems; i++)
			{
				System.out.printf("%d번째 메뉴의 이름과 가격 그리고 수량을 입력해주세요.", i + 1);
				menuName[i] = in.next();
				String inputText = in.next();
        
				try
				{
					menuPrice[i] = Integer.parseInt(inputText);
					inputText = in.next();
          
					try
					{
						menuCount[i] = Integer.parseInt(inputText);
						out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i], menuCount[i]);
						fw.write(out);
					}
					catch (NumberFormatException exception)
					{
						System.out.println("숫자만 입력해주세요.\n");
					}
				}
				catch (NumberFormatException exception)
				{
					System.out.println("숫자만 입력해주세요.\n");
				}
			}
			
			fw.close();
			in.close();
		}
	}
}
```
</details>
<details>
<summary>GUI 사용 자판기</summary>
  
```java
package com.test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_VendingMachine
{
	static int sel_bt_no=0;
	static int money=0;
	static int numItems=0;
	static int mode = 0;
	
	public static void main(String[] args) throws Exception
	{
		Runtime rt = Runtime.getRuntime();
        
		JFrame f = new JFrame("자판기");
		Font fnt1 = new Font("맑은 고딕", Font.BOLD, 40);
		
		JPanel nPanel = new JPanel();
		JLabel l1 = new JLabel("자판기");
		
		nPanel.add(l1);
		
		l1.setFont(fnt1);
		f.setLayout(new BorderLayout());
		f.add(nPanel, BorderLayout.NORTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		ArrayList<Integer> menuNum = new ArrayList<Integer>();
		ArrayList<String> menuName = new ArrayList<String>();
		ArrayList<Integer> menuPrice = new ArrayList<Integer>();
		ArrayList<Integer> menuCount = new ArrayList<Integer>();
		ArrayList<JButton> button = new ArrayList<JButton>();
		ArrayList<JLabel> priceLabel = new ArrayList<JLabel>();
		ArrayList<JLabel> countLabel = new ArrayList<JLabel>();
		
		if(!isExists) // 메뉴 파일이 없다면 물품 새로 만들기
		{
			JDialog dialog = new JDialog(f, "메뉴 생성", true);
			dialog.setSize(500, 140);
			
			JPanel dpanel = new JPanel(new BorderLayout());
			JPanel dp = new JPanel();
			JPanel dp1 = new JPanel(new GridLayout(2, 0, 10, 0));
			
			JLabel dl1 = new JLabel("메뉴");
			JLabel dl2 = new JLabel("이름");
			JLabel dl3 = new JLabel("가격");
			JLabel dl4 = new JLabel("수량");
			
			dp1.add(dl1);
			dp1.add(dl2);
			dp1.add(dl3);
			dp1.add(dl4);
			
			JComboBox<String> dcb = new JComboBox<String>();
			dcb.addItem(String.valueOf(1));
			
			JTextField dt1 = new JTextField(10);
			JTextField dt2 = new JTextField(10);
			JTextField dt3 = new JTextField(10);
			
			dp1.add(dcb);
			dp1.add(dt1);
			dp1.add(dt2);
			dp1.add(dt3);
			
			JButton btDialog = new JButton("제거");
			JButton btDialog_2 = new JButton("저장");
			JButton btDialog_3 = new JButton("확인");
			
			dp.add(dp1);
			dp.add(btDialog);
			dp.add(btDialog_2);
			dp.add(btDialog_3);
			
			dpanel.add(dp);

			dialog.add(dpanel);
			
			btDialog.addActionListener(new ActionListener() // 메뉴 제거 버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (numItems > 0)
					{
						int dcb_idx = dcb.getSelectedIndex();
						
						dcb.removeItemAt(numItems);
						menuName.remove(dcb_idx);
						menuPrice.remove(dcb_idx);
						menuCount.remove(dcb_idx);
						
						numItems--;
						
						if (numItems != dcb_idx) // 마지막 물품을 삭제하려고 했는지 검사
						{
							dt1.setText(menuName.get(dcb_idx));
							dt2.setText(String.valueOf(menuPrice.get(dcb_idx)));
							dt3.setText(String.valueOf(menuCount.get(dcb_idx)));
						}
						else
						{
							if (numItems == 0) // 더이상 삭제할 물품이 없다면
							{
								dt1.setText("");
								dt2.setText("");
								dt3.setText("");
							}
							else
							{
								dt1.setText(menuName.get(numItems - 1));
								dt2.setText(String.valueOf(menuPrice.get(numItems - 1)));
								dt3.setText(String.valueOf(menuCount.get(numItems - 1)));
							}
						}
					}
				}
			});
			
			btDialog_2.addActionListener(new ActionListener() // 메뉴 추가 저장버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					boolean check = true;
					
					try // 가격 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt2.getText());
						
						if (value < 0) // 가격이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "가격에는 음수를 입력할 수 없습니다.");
							dt2.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "가격에는 숫자만 입력해 주세요");
						dt2.setText("");
						check = false;
					}
					
					try // 수량 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt3.getText());
						
						if (value < 0) // 수량이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "수량에는 음수를 입력할 수 없습니다.");
							dt3.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "수량에는 숫자만 입력해 주세요");
						dt3.setText("");
						check = false;
					}
					
					if (check) // 검증이 끝나면 실행
					{
						menuName.add(dt1.getText());
						menuPrice.add(Integer.valueOf(dt2.getText()));
						menuCount.add(Integer.valueOf(dt3.getText()));
						
						numItems++;
						dcb.addItem(String.valueOf(numItems + 1));
					}
				}
			});
			
			btDialog_3.addActionListener(new ActionListener() // 메뉴 추가 확인버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					FileWriter fw;
          
					try  // 파일 저장
					{
						fw = new FileWriter("c:\\Temp\\menu.txt");
						
						String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
						fw.write(out);
						
						for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
						{
							out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
							fw.write(out);
						}
						
						fw.close();
					}
					catch (IOException e1) // 실패시 에러문구
					{
						String str = "저장에 실패하였습니다.";
						JOptionPane.showMessageDialog(f, str);
						
						e1.printStackTrace();
					}
					dialog.dispose();
				}
			});
			
			dcb.addItemListener(new ItemListener() // 메뉴파일 생성 콤보박스 선택
			{
				@Override
				public void itemStateChanged(ItemEvent e)
				{
					int index = ((JComboBox<String>)dcb).getSelectedIndex();
					
					if (numItems > index)
					{
						dt1.setText(menuName.get(index));
						dt2.setText(String.valueOf(menuPrice.get(index)));
						dt3.setText(String.valueOf(menuCount.get(index)));
					}
					else
					{
						dt1.setText("");
						dt2.setText("");
						dt3.setText("");
					}
				}
			});
			
			rt.addShutdownHook( // 프로그램 종료 감지
					new Thread()
					{
						public void run()
						{
							FileWriter fw;
              
							try  // 파일 저장
							{
								fw = new FileWriter("c:\\Temp\\menu.txt");
								
								String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
								fw.write(out);
								
								for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
								{
									out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
									fw.write(out);
								}
								
								fw.close();
							}
							catch (IOException e) // 실패시 에러문구
							{
								String str = "저장에 실패하였습니다.";
								JOptionPane.showMessageDialog(f, str);
								
								e.printStackTrace();
							}
							
						}
					});
			
			dialog.setVisible(true);
		}
		
		if(file.exists())
		{
			Scanner fileIn = new Scanner(file);
			numItems = fileIn.nextInt();
			GridLayout gl = new GridLayout(1, 0, 10, 10);
      
			if (numItems > 0) // 구이창의 크기 초기 조절
			{
				gl.setRows((numItems > 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)));
			}
			JPanel cPanel = new JPanel(gl);
			JPanel cPanel_2 = new JPanel();
			
			JPanel sPanel = new JPanel(new BorderLayout());
			JPanel subPanel = new JPanel();
			JPanel subPanel_2 = new JPanel();
			
			JTextField txtf1 = new JTextField(10); 
			JButton bt1 = new JButton("입력");
			JButton bt2 = new JButton("잔돈 반환");
			JLabel l2 = new JLabel("잔돈 : 0원");
			
			JMenuBar mbar = new JMenuBar();
			
			JMenu menu1 = new JMenu("관리자 메뉴");
			JMenuItem m1_item1 = new JMenuItem("기존 메뉴 수정");
			JMenuItem m1_item2 = new JMenuItem("신규 메뉴 추가");
			JMenuItem m1_item3 = new JMenuItem("종료");
			menu1.add(m1_item1);
			menu1.add(m1_item2);
			menu1.addSeparator();
			menu1.add(m1_item3);
			
			f.setJMenuBar(mbar);
			
			JDialog editDialog = new JDialog(f, "기존 메뉴 수정", true);
			JDialog newDialog = new JDialog(f, "신규 메뉴 추가", true);
			editDialog.setSize(500, 140);
			newDialog.setSize(370, 130);
			
			JPanel dpanel = new JPanel(new BorderLayout());
			JPanel dp = new JPanel();
			JPanel dp1 = new JPanel(new GridLayout(2, 0, 10, 0));
			
			JPanel n_dpanel = new JPanel(new BorderLayout());
			JPanel n_dp = new JPanel();
			JPanel n_dp1 = new JPanel(new GridLayout(2, 0, 10, 0));
			
			JLabel dl1 = new JLabel("메뉴", JLabel.CENTER);
			JLabel dl2 = new JLabel("이름", JLabel.CENTER);
			JLabel dl3 = new JLabel("가격", JLabel.CENTER);
			JLabel dl4 = new JLabel("수량", JLabel.CENTER);
			
			JLabel n_dl1 = new JLabel("이름", JLabel.CENTER);
			JLabel n_dl2 = new JLabel("가격", JLabel.CENTER);
			JLabel n_dl3 = new JLabel("수량", JLabel.CENTER);
			
			
			dp1.add(dl1);
			dp1.add(dl2);
			dp1.add(dl3);
			dp1.add(dl4);
			
			n_dp1.add(n_dl1);
			n_dp1.add(n_dl2);
			n_dp1.add(n_dl3);
			
			JComboBox<String> dcb = new JComboBox<String>();
      
			for (int i = 0; i < numItems; i++) // 아이템 번호 리스트 추가
			{
				dcb.addItem(String.valueOf(i + 1));
			}
			
			JTextField dt1 = new JTextField(10);
			JTextField dt2 = new JTextField(10);
			JTextField dt3 = new JTextField(10);
			
			JTextField n_dt1 = new JTextField(10);
			JTextField n_dt2 = new JTextField(10);
			JTextField n_dt3 = new JTextField(10);
			
			dp1.add(dcb);
			dp1.add(dt1);
			dp1.add(dt2);
			dp1.add(dt3);
			
			n_dp1.add(n_dt1);
			n_dp1.add(n_dt2);
			n_dp1.add(n_dt3);
			
			JButton btDialog = new JButton("저장");
			JButton btDialog_2 = new JButton("삭제");
			JButton btDialog_3 = new JButton("확인");
			JButton n_btDialog = new JButton("확인");
			
			dp.add(dp1);
			dp.add(btDialog);
			dp.add(btDialog_2);
			dp.add(btDialog_3);
			
			dpanel.add(dp);
			
			n_dp.add(n_dp1);
			n_dp.add(n_btDialog);
			
			n_dpanel.add(n_dp);
			
			editDialog.add(dpanel);
			newDialog.add(n_dpanel);
			
			for(int i = 0; i < numItems; i++) // 물건의 갯수만큼 반복
			{
				menuNum.add(fileIn.nextInt());
				menuName.add(fileIn.next());
				menuPrice.add(fileIn.nextInt());
				menuCount.add(fileIn.nextInt());
				
				JLabel label = new JLabel(String.valueOf(menuPrice.get(i)) + "원", JLabel.CENTER); // 버튼 아래 가격 추가
				JLabel label_2 = new JLabel(String.valueOf(menuCount.get(i)) + "개", JLabel.CENTER); // 버튼 아래 수량 추가
				button.add(new JButton(menuName.get(i))); // 버튼 배열에 추가
				priceLabel.add(label);
				countLabel.add(label_2);
				JPanel btp = new JPanel(new GridLayout(2, 0));
				JPanel btp_2 = new JPanel(new GridLayout(2, 0, 0, -5));
				button.get(i).addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) // 물품 구매 버튼
					{
						String str = e.getActionCommand();
						
						for (int j = 0; j < numItems; j++) // 몇번째 버튼인지 찾음
						{
							if(str.equals(menuName.get(j)))
							{
								sel_bt_no = j;
							}
						}
						
						if (menuCount.get(sel_bt_no) > 0) // 수량 확인
						{
							money -= menuPrice.get(sel_bt_no);
							menuCount.set(sel_bt_no, menuCount.get(sel_bt_no) - 1);
							
							if (menuCount.get(sel_bt_no) > 0) // 1개 이상 남았을때
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "(이)가 " + menuCount.get(sel_bt_no) + "개 남았습니다.";
								countLabel.get(sel_bt_no).setText(String.valueOf(menuCount.get(sel_bt_no)) + "개");
							}
							else // 마지막 수량
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "의 수량이 소진 되었습니다.";
								countLabel.get(sel_bt_no).setText("품절");
							}
							
							
							try // 로그파일 생성
							{
								LocalDateTime currentDateTime  = LocalDateTime.now(); // 날짜
								FileWriter lfw = new FileWriter("c:\\Temp\\Log.txt", true);
								String out = String.format("%d-%d-%dT%d:%d:%d %d번 물품 %s(%d원)이 %d개 잔돈은 %d원 남았습니다.\r\n", currentDateTime.getYear(), currentDateTime.getMonthValue(), currentDateTime.getDayOfMonth(),
										currentDateTime.getHour(), currentDateTime.getMinute(), currentDateTime.getSecond(), 
										menuNum.get(sel_bt_no), menuName.get(sel_bt_no), menuPrice.get(sel_bt_no), menuCount.get(sel_bt_no), money);
								
								lfw.append(out);
								lfw.close();
							}
							catch (IOException e1)
							{
								e1.printStackTrace();
							}
							
							
							JOptionPane.showMessageDialog(f, str);
							l2.setText("잔돈 : " + GUI_VendingMachine.money + "원");
							
							for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
							{
								if (menuCount.get(i) == 0)
								{
									button.get(i).setEnabled(false);
								}
								else
								{
									if(GUI_VendingMachine.money >= menuPrice.get(i))
									{
										button.get(i).setEnabled(true);
									}
									else
									{
										button.get(i).setEnabled(false);
									}
								}
							}
						}
					}
				});
				
				btp_2.add(label);
				btp_2.add(label_2);
				btp.add(button.get(i));
				btp.add(btp_2);
				cPanel.add(btp);
				button.get(i).setEnabled(false);
			}
			
			rt.addShutdownHook( // 프로그램 종료 감지
					new Thread()
					{
						public void run()
						{
							FileWriter fw;
              
							try  // 파일 저장
							{
								fw = new FileWriter("c:\\Temp\\menu.txt");
								
								String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
								fw.write(out);
								
								for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
								{
									out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
									fw.write(out);
								}
								
								fw.close();
							}
							catch (IOException e) // 실패시 에러문구
							{
								String str = "저장에 실패하였습니다.";
								JOptionPane.showMessageDialog(f, str);
								
								e.printStackTrace();
							}
							
						}
					});
			
			fileIn.close();
			
			cPanel_2.add(cPanel);
			subPanel.add(txtf1);
			subPanel.add(bt1);
			subPanel.add(bt2);
			subPanel_2.add(l2);
			
			f.add(cPanel_2, BorderLayout.CENTER);
			f.add(sPanel, BorderLayout.SOUTH);
			sPanel.add(subPanel, BorderLayout.NORTH);
			sPanel.add(subPanel_2, BorderLayout.SOUTH);
			
			bt1.addActionListener(new ActionListener() // 입력버튼 클릭
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (!txtf1.getText().equals("")) // 빈칸인지 확인
					{
						boolean check = true;
						
						try // 돈 입력란에 숫자만 입력했는지 검사
						{
							int value = Integer.parseInt(txtf1.getText());
							
							if(value != -999)
							{
								if (value < 0) // 돈이 음수인지 검사
								{
									JOptionPane.showMessageDialog(null, "돈에는 음수를 입력할 수 없습니다.");
									txtf1.setText("");
									check = false;
								}
							}
						}
						catch (NumberFormatException exception)
						{
							JOptionPane.showMessageDialog(null, "돈은 숫자만 입력할 수 있습니다.");
							txtf1.setText("");
							check = false;
						}
						
						if (check) // 검증이 끝나면 실행
						{
							if (!txtf1.getText().equals("-999")) // 돈 입력
							{
								GUI_VendingMachine.money += Integer.parseInt(txtf1.getText());
								l2.setText("잔돈 : " + GUI_VendingMachine.money + "원");
								txtf1.setText("");
								
								for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
								{
									if (menuCount.get(i) == 0)// 수량이 부족하면 비활성화
									{
										button.get(i).setEnabled(false);
									}
									else // 아니면 가격비교
									{
										if(GUI_VendingMachine.money >= menuPrice.get(i))
										{
											button.get(i).setEnabled(true);
										}
										else
										{
											button.get(i).setEnabled(false);
										}
									}
								}
							}
							else // -999원을 입력할 경우 관리자 모드 메뉴창을 띄움
							{
								if (mode == 0) // 관리자 메뉴 띄움
								{
									mbar.add(menu1);
									mode = 1;
								}
								else // 관리자 메뉴 지움
								{
									mbar.remove(menu1);
									mode = 0;
									txtf1.setText("");
								}
								refreshSize(button, gl, f);
							}
						}
					}
				}
			});
			
			bt2.addActionListener(new ActionListener() // 잔돈 반환
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					l2.setText("잔돈 : 0원");
					txtf1.setText("");
					
					String str = "잔돈은 " + GUI_VendingMachine.money + "원 입니다";
					JOptionPane.showMessageDialog(f, str);
					
					for (int i = 0; i < numItems; i++)
					{
						button.get(i).setEnabled(false);
					}
				}
			});
			
			m1_item1.addActionListener(new ActionListener() // 메뉴 수정 다이얼로그 띄움
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (numItems > 0)
					{
						int index = ((JComboBox<String>)dcb).getSelectedIndex();
						dt1.setText(menuName.get(index));
						dt2.setText(String.valueOf(menuPrice.get(index)));
						dt3.setText(String.valueOf(menuCount.get(index)));
						editDialog.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(f, "수정할 메뉴가 남아있지 않습니다.");
						editDialog.setVisible(false);
					}
				}
			});
			
			m1_item2.addActionListener(new ActionListener() // 메뉴 추가 다이얼로그 띄움
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					newDialog.setVisible(true);
				}
			});
			
			m1_item3.addActionListener(new ActionListener() // 시스템 종료
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					System.exit(0);
				}
			});
			
			btDialog.addActionListener(new ActionListener() // 메뉴 저장  버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					boolean check = true;
					
					try // 가격 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt2.getText());
						
						if (value < 0) // 가격이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "가격에는 음수를 입력할 수 없습니다.");
							dt2.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "가격에는 숫자만 입력해 주세요");
						dt2.setText("");
						check = false;
					}
					
					try // 수량 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt3.getText());
						
						if (value < 0) // 수량이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "수량에는 음수를 입력할 수 없습니다.");
							dt3.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "수량에는 숫자만 입력해 주세요");
						dt3.setText("");
						check = false;
					}
					
					if (check) // 검증이 끝나면 실행
					{
						int dcb_idx = dcb.getSelectedIndex();
						menuName.set(dcb_idx, dt1.getText());
						menuPrice.set(dcb_idx, Integer.valueOf(dt2.getText()));
						menuCount.set(dcb_idx, Integer.valueOf(dt3.getText()));
						priceLabel.get(dcb_idx).setText(String.valueOf(menuPrice.get(dcb_idx)) + "원");
						countLabel.get(dcb_idx).setText(String.valueOf(menuCount.get(dcb_idx)) + "개");
						
						for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
						{
							if (menuCount.get(i) == 0) // 수량이 부족하면 비활성화
							{
								button.get(i).setEnabled(false);
							}
							else // 아니면 가격비교
							{
								if(GUI_VendingMachine.money >= menuPrice.get(i))
								{
									button.get(i).setEnabled(true);
								}
								else
								{
									button.get(i).setEnabled(false);
								}
							}
						}
					}
				}
			});
			
			btDialog_2.addActionListener(new ActionListener() // 메뉴 삭제 버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (numItems > 0)
					{
						int dcb_idx = dcb.getSelectedIndex();
						
						menuName.remove(dcb_idx);
						menuPrice.remove(dcb_idx);
						menuCount.remove(dcb_idx);
						button.remove(dcb_idx);
						cPanel.remove(dcb_idx);
						
						numItems--;
						
						if (numItems != dcb_idx) // 마지막 물품을 삭제하려고 했는지 검사
						{
							dcb.removeItemAt(numItems);
							dt1.setText(menuName.get(dcb_idx));
							dt2.setText(String.valueOf(menuPrice.get(dcb_idx)));
							dt3.setText(String.valueOf(menuCount.get(dcb_idx)));
						}
						else
						{
							if (numItems == 0) // 더이상 삭제할 물품이 없다면
							{
								dt1.setText("");
								dt2.setText("");
								dt3.setText("");
								editDialog.setVisible(false);
								editDialog.dispose();
							}
							else
							{
								dt1.setText(menuName.get(numItems - 1));
								dt2.setText(String.valueOf(menuPrice.get(numItems - 1)));
								dt3.setText(String.valueOf(menuCount.get(numItems - 1)));
							}
						}
					}
					refreshSize(button, gl, f);
				}
			});
			
			btDialog_3.addActionListener(new ActionListener() // 메뉴 수정 확인버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					editDialog.dispose();
				}
			});
			
			n_btDialog.addActionListener(new ActionListener() // 메뉴 추가 저장버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					boolean check = true;
					
					try // 가격 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(n_dt2.getText());
						
						if (value < 0) // 가격이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "가격에는 음수를 입력할 수 없습니다.");
							n_dt2.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "가격에는 숫자만 입력해 주세요");
						n_dt2.setText("");
						check = false;
					}
					
					try // 수량 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(n_dt3.getText());
						
						if (value < 0) // 수량이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "수량에는 음수를 입력할 수 없습니다.");
							n_dt3.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "수량에는 숫자만 입력해 주세요");
						n_dt3.setText("");
						check = false;
					}
					
					if (check) // 검증이 끝나면 실행
					{
						menuName.add(n_dt1.getText());
						menuPrice.add(Integer.valueOf(n_dt2.getText()));
						menuCount.add(Integer.valueOf(n_dt3.getText()));
						button.add(new JButton(n_dt1.getText()));
						JLabel label = new JLabel(String.valueOf(n_dt2.getText()) + "원", JLabel.CENTER); // 버튼 아래 가격 추가
						JLabel label_2 = new JLabel(String.valueOf(n_dt3.getText()) + "개", JLabel.CENTER); // 버튼 아래 수량 추가
						
						priceLabel.add(label);
						countLabel.add(label_2);
						JPanel btp = new JPanel(new GridLayout(2, 0));
						JPanel btp_2 = new JPanel(new GridLayout(2, 0, 0, -5));
						
						numItems++;
						
						for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
						{
							if (menuCount.get(i) == 0) // 수량이 부족하면 비활성화
							{
								button.get(i).setEnabled(false);
							}
							else // 아니면 가격비교
							{
								if(GUI_VendingMachine.money >= menuPrice.get(i))
								{
									button.get(i).setEnabled(true);
								}
								else
								{
									button.get(i).setEnabled(false);
								}
							}
						}
						
						button.get(numItems - 1).addActionListener(new ActionListener() // 추가된 버튼 액션
						{
							@Override
							public void actionPerformed(ActionEvent e) // 물품 구매 버튼
							{
								String str = e.getActionCommand();
								
								for (int j = 0; j < numItems; j++) // 몇번째 버튼인지 찾음
								{
									if(str.equals(menuName.get(j)))
									{
										sel_bt_no = j;
									}
								}
								
								if (menuCount.get(sel_bt_no) > 0) // 수량 확인
								{
									money -= menuPrice.get(sel_bt_no);
									menuCount.set(sel_bt_no, menuCount.get(sel_bt_no) - 1);
									
									if (menuCount.get(sel_bt_no) > 0) // 1개 이상 남았을때
									{
										str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
												+ menuName.get(sel_bt_no) + "(이)가 " + menuCount.get(sel_bt_no) + "개 남았습니다.";
										countLabel.get(sel_bt_no).setText(String.valueOf(menuCount.get(sel_bt_no)) + "개");
									}
									else // 마지막 수량
									{
										str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
												+ menuName.get(sel_bt_no) + "의 수량이 소진 되었습니다.";
										countLabel.get(sel_bt_no).setText("품절");
									}
									
									try // 로그파일 생성
									{
										LocalDateTime currentDateTime  = LocalDateTime.now(); // 날짜
										FileWriter lfw = new FileWriter("c:\\Temp\\Log.txt", true);
										String out = String.format("%d-%d-%dT%d:%d:%d %d번 물품 %s(%d원)이 %d개 잔돈은 %d원 남았습니다.\r\n", currentDateTime.getYear(), currentDateTime.getMonthValue(), currentDateTime.getDayOfMonth(),
												currentDateTime.getHour(), currentDateTime.getMinute(), currentDateTime.getSecond(), 
												menuNum.get(sel_bt_no), menuName.get(sel_bt_no), menuPrice.get(sel_bt_no), menuCount.get(sel_bt_no), money);
										
										lfw.append(out);
										lfw.close();
									}
									catch (IOException e1)
									{
										e1.printStackTrace();
									}
									
									JOptionPane.showMessageDialog(f, str);
									l2.setText("잔돈 : " + GUI_VendingMachine.money + "원");
									
									for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
									{
										if (menuCount.get(i) == 0) // 수량이 부족하면 비활성화
										{
											button.get(i).setEnabled(false);
										}
										else // 아니면 가격비교
										{
											if(GUI_VendingMachine.money >= menuPrice.get(i))
											{
												button.get(i).setEnabled(true);
											}
											else
											{
												button.get(i).setEnabled(false);
											}
										}
									}
								}
							}
						});
						
						btp_2.add(label);
						btp_2.add(label);
						btp.add(button.get(numItems - 1));
						btp.add(btp_2);
						cPanel.add(btp);
						
						refreshSize(button, gl, f);
						
						newDialog.dispose();
						n_dt1.setText("");
						n_dt2.setText("");
						n_dt3.setText("");
					}
				}
			});
			
			dcb.addItemListener(new ItemListener() // 메뉴 수정 콤보박스 선택
			{
				@Override
				public void itemStateChanged(ItemEvent e)
				{
					int index = ((JComboBox<String>)dcb).getSelectedIndex();
					dt1.setText(menuName.get(index));
					dt2.setText(String.valueOf(menuPrice.get(index)));
					dt3.setText(String.valueOf(menuCount.get(index)));
				}
			});

			f.setVisible(true);
			refreshSize(button, gl, f);
		}
	}
	
	public static void refreshSize(ArrayList<JButton> bt, GridLayout grid, JFrame frame) // 프레임, 그리드 크기 재조정
	{
		int count = 0;
		int high = 0;
		
		for (int i = 0, j = 1; i < numItems; i++, j++) // 버튼 크기 검사
		{
			count += bt.get(i).getSize().width + 10;
			System.out.println(bt.get(i).getSize());
      
			if (j == 3)
			{
				if (high < count)
				{
					high = count;
					j = 0;
					count = 0;
				}
			}
		}
		
		if (high < 280) // 너무 작으면 그냥 만듦
		{
			high = 280;
		}
		
		if (numItems > 0)
		{
			frame.setVisible(true);
			grid.setRows((numItems > 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)));
			frame.setSize(high + 20, (numItems > 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)) * 70 + 170 + 20 * mode);
		}
		else
		{
			frame.setVisible(true);
			grid.setRows(1);
			frame.setSize(300, 190);
		}
	}
}
```
</details>
