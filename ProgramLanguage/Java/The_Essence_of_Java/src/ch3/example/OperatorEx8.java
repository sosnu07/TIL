package ch3.example;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;      // 1,000,000  1백만
        int b = 2_000_000;      // 2,000,000  2백만

        long c = a * b;         // a * b = 2,000,000,000,000 ?  => 오버플로우 발생

        c = a * (long) b;       // 한쪽 타입을 long으로 맞춰서 늘여준다.

        System.out.println(c);
    }
}
