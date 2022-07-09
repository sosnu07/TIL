package ch3.example;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;        // 1000000 * 1000000 / 1000000
        int result2 = a / a * a;        // 1000000 / 1000000 * 1000000

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // 오버플로우 발생
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }
}
