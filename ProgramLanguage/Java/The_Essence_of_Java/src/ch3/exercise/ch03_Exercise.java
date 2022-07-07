/**
 * Chapter3. Operator
 * Exercise
 * 2022.07.01
 * written by LSS
 */

package ch3.exercise;

import java.util.Scanner;

public class ch03_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exam:
        while(true) {
            System.out.println("\n\n자바의 정석 제2장 연산자 문제풀이\n");
            System.out.println("문제는 10번까지 존재하며, 0을 입력할 경우 종료됩니다.\n");
            System.out.print("문제 번호를 입력하시오> ");

            int num = sc.nextInt();
            System.out.println();

            switch (num) {
                case 0 : break exam;
                case 1 : Exercise01(); break;
                case 2 : Exercise02(); break;
                case 3 : Exercise03(); break;
                case 4 : Exercise04(); break;
                case 5 : Exercise05(); break;
                case 6 : Exercise06(); break;
                case 7 : Exercise07(); break;
                case 8 : Exercise08(); break;
                case 9 : Exercise09(); break;
                case 10 : Exercise10(); break;
            }
        }
    }

    private static void Exercise01() {

        /**
         * 연산의 결과를 적어보아라
         */

        int x = 2;
        int y = 5;
        char c = 'A';	// 'A'의 문자코드는 65

        System.out.println(1 + x << 33);                    // 6
        // 비트연산자는 우선순위가 가장 낮다
        // 3 << 33
        // int 타입이므로 int는 4byte = 32bit;; 즉, 33 = 32 + 1 => 1
        // 3 << 1 은 3에 '2의 1제곱'을 곱하는 것과 동일한 값을 얻으므로
        // 답은 6

        System.out.println(y >= 5 || x < 0 && x > 2);       // false
        // OR 연산자는 AND 연산자보다 우선순위가 높다. 조금은 상식적인 이야기.
        // 그리고 OR 연산자의 경우 왼쪽부터 오른쪽의 순서로 진행되는데, 왼쪽이 참으로 이미 결과가 나온 경우
        // 효율적인 연산을 위해 오른쪽을 연산하지 않는다.

        // 따라서 (y>=5 || x<0) && x>2
        // true && x>2 라는 결과가 도출되는데 x의 값은 2 인 상태이므로 false

        System.out.println(y += 10 - x++);                  // y = 12
        // 대입연산자의 우선순위는 가장 낮다
        // '='를 비롯하여 '+=', '=+' 같은 연산자도 마찬가지로 대입연산자 이므로
        // 우선순위 순서로 식을 묶으면
        // y += ( 10 - x++)
        // y= y + ( 10 - x++)

        // x=2 y=5 이므로 y = 12
        // x++는 후위연산자이므로 모든 식이 완료된후 x에 값을 더하여 x=3

        System.out.println(x+=2);                           // x = 5
        // 이전의 식에서 x=3이 되었기 때문에
        // x = 5

        System.out.println( !('A' <= c && c <='Z') );       // !(true) == false

        System.out.println('C'-c);                          // 2
        // 'C'에는 아무 타입도 붙여져 있지 않으므로 int가 쓰인다
        // 따라서 'C'의 유니코드 값은 67이며
        // char c = 'A' 이므로 c의 값은 'A'
        // 'A'의 유니코드 값은 65이므로
        // 2

        System.out.println('5'-'0');                        // 5
        // '5'나 '0'의 유니코드 문자가 무엇이든지 순서대로 움직이므로
        // 5

        System.out.println(c+1);                            // 66
        /**
         * c+1은 c의 값이 'A' 이므로 'A'+1이 되고, 이항연산자의 성질(int보다 작튼 타입은 int로 변환 후 연산) 떄문에
         * 'A'는 문자코드 값인 65로 변환되어 '65 + 1'을 수행하여 66의 값을 나타냄
         *
         * 이항연산자의 성질 == JVM의 피연산자 스택
         */

        // char c = 'A' 인 상태
        // 'A' + 1 == (int) 'A' + (int) 1 과 같음
        // 66


        System.out.println(++c);                            // 'B'
        /**
         * 단항연산자인 '++'는 이항연산자와 달리 int보다 작은 타입도 형변환을 하지 않는다.
         * 그래서 println은 변수 c를 숫자(int)로 출력하는 것이 아니라 문자로 출력한다.
         *
         * 변수 c에 저장된 문자가 'A'(실제로 저장된 것은 'A'의 문자코드인 65)이므로
         * 문자코드의 값이 1 증가하여 66('B'의 문자코드)이 변수 c에 저장된다.
         *
         * 변수 c에 저장된 것은 문자코드, 즉 정수값이다. println은 이 값을 타입에 따라 어떻게 출력할지 결정한다.
         * 만일 문자값이면 저장된 값(문자코드)에 해당하는 문자를 출력하고 숫자라면 숫자로 출력한다.
         */

        // 전위 증감 연산자
        // 값이 참조되기 전에 증가시킨다.
        // c = c+1 일테니
        // 'A'에 1을 더한 값이 c가 되는 셈.
        // 'B'

        System.out.println(c++);                            // 'B'
        // 후위 증감 연산자
        // 값이 참조된 이후에 증가된다.
        // 독립적인 문장에서 사용될 떄는 전위나 후위나 그게 그거

        System.out.println(c);                              // 'C'
    }

    private static void Exercise02() {
        Scanner sc = new Scanner(System.in);

        System.out.println("2번 문제");
        System.out.print("사과의 개수를 입력하시오> ");
        int numOfApples = sc.nextInt();      // 사과의 개수

        System.out.print("바구니에 담을 수 있는 사과의 개수를 입력하시오> ");
        int sizeOfBucket = sc.nextInt();      // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)

        int numOfBucket
                = numOfApples/sizeOfBucket + (numOfApples % sizeOfBucket != 0 ? 1 : 0); // 모든 사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수: " + numOfBucket);
    }

    private static void Exercise03() {
        Scanner sc = new Scanner(System.in);

        //변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드를 작성하여라.
        // 삼항연산자를 사용하시오.

        System.out.println("3번 문제");
        System.out.println("변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드를 작성하여라.");
        System.out.println("삼항연산자를 사용하시오.\n");

        System.out.print("숫자를 입력하시오> ");
        int num = sc.nextInt();
        System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0") );
    }

    private static void Exercise04() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("4번 문제");
        System.out.println("3자리 수인 변수 num의 값 중에서 백의 자리 이하를 버리는 코드를 작성하여라\n");

        System.out.print("숫자를 입력하시오> ");
        int num = scanner.nextInt();

        int solution = num/100*100;

        System.out.println(solution);
    }

    private static void Exercise05() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5번 문제");
        System.out.println("3자리수인 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드를 작성하여라\n");

        System.out.print("숫자를 입력하시오> ");
        int num = scanner.nextInt();

        int solution = num/10*10 + 1;

        System.out.println(solution);

    }

    private static void Exercise06() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("6번 문제");
        System.out.println("두자리수 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺸 나머지 코드를 작성하라\n");

        System.out.print("숫자를 입력하시오> ");
        int num = scanner.nextInt();

        int solution1 = ( (num/10+1) *10) - num;

        // 그런데 사실상 값은 10 이하로 나오는게 자명함.
        // 따라서 끝자리 수만 처리해도 상관없지 않나?
        int solution2 = 10 - num%10;

        System.out.println("solution1: "+solution1);
        System.out.println("solution2: "+solution2);

    }

    private static void Exercise07() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("7번 문제");
        System.out.println("화씨(Fahrenheit)를 섭씨(Celsius)로 전환하는 프로그램");
        System.out.println("변환 공식은 'C = 5/9 * (F-32)");
        System.out.println("단, 변환 결과값은 소수점 셋째자리에서 반올림해야 하며, ");
        System.out.println("Math.round() 메서드를 사용하지 않을 것.\n");

        System.out.print("화씨(Fahrenheit)를 입력하시오> ");
        int fahrenheit = scanner.nextInt();
        float celsius = 5/9f * (fahrenheit-32);

        celsius = (int) (celsius * 100 + 0.5) / 100f;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);

    }

    private static void Exercise08() {

        System.out.println("코드의 문제점을 수정하시오\n");

        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);        // a + b => (byte) (a+b)

        char ch = 'A';
        ch = (char) (ch + 2);           // ch +2 => (char) (ch + 2)
                                        // char 타입이 덧셈의 연산과정을 거치면서 int 타입으로 변환된다.
                                        // char 타입보다 int 타입의 크기가 더 크기 때문에 대입 불가. 변환 필요

        float f = 3 / 2f;               // 3/2 => 3/2f, 리터럴에 f 붙여서 float 표시
        long l = 3000 * 3000 *3000L;    // 리터럴에 L 붙여서 Long 표시
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = (float) d==f2; // float는 값을 절대값으로 보장하는 것이 나닌 부동 소수점방식으로 저장하기 때문에
                                        // float를 double로 저장하게 되면 값의 손실이 생각수 있음.
                                        // 실수형의 기본형은 double이기에 d==f2의 경우, 자동으로 float가 double로 변환되고
                                        // 이를 통한 값 손실을 막기 위해 double형인 d를 float로 변환시켜주어야 한다

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);

    }

    private static void Exercise09() {
        System.out.println("문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드");

        char ch = 'z';
        boolean b = ('a'<= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z');

        System.out.println(b);

    }

    private static void Exercise10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("10번 문제");
        System.out.println("대문자를 소문자로 변경하는 코드");
        System.out.println("문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다");
        System.out.println("문자 코드는 소문자가 대문자보다 32만큼 더 크다\n");

        System.out.print("문자를 입력하시오> ");
        char ch = scanner.next().charAt(0);

        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char) (ch+32) : ch;

        System.out.println("ch: " + ch);
        System.out.println("ch to lowerCase: " + lowerCase);

    }

}
