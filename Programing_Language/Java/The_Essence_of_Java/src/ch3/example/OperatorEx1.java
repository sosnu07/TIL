package ch3.example;

public class OperatorEx1 {
    /**
     * 증감연산자
     * 전위형, 후위형
     *
     * 증감연산자가 수식이나 메서드 호출에 포함되지 않고 독립적인 하나의 문장으로 기능하는 경우에는
     * 전위형이나 후위형의 구분은 무의미
     */

    public static void main(String[] args) {
        int i = 5;
        i++;        // i=i+1; 과 같은 의미이다. ++i; 로 바꿔 써도 결과는 같다.
        System.out.println(i);

        i=5;
        ++i;        // 결과 비교를 위해 i의 값을 동일하게 설정
        System.out.println(i);

    }
}
