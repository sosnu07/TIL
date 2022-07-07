package ch3.example;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        // Or 연산'||'의 경우 두 피연산자 중 어느 한 쪽만 '참'이어도 전체 연산결과가 참이므로,
        // 좌측 피연산자가 'true'일 경우 우측 연산자까지 넘어가지 않는다.

        // 변수 b에 증감연산자 '++'를 사용해서 우측 피연산자가 처리되면, b의 값이 증가하도록 만듬.
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 =%b%n", a==0 && ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);
    }	// main의 끝
}
