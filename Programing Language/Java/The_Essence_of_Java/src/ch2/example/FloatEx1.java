package ch2.example;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("    12345678901234%n");
        System.out.printf("f  : %f%n", f);          // %f는 기본적으로 소수점 이하 6자리까지만 출력, 7번째 자리에서 반올림.
                                                    // float는 정밀도가 7
        System.out.printf("f  : %24.20f%n", f);     // 저장공간의 한계로 오차 발생
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d  : %24.20f%n", d);

    }
}
