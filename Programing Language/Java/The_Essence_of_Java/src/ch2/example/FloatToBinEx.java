package ch2.example;

public class FloatToBinEx {
    /**
     * floatToIntBits()는 float 타입의 값을 int 타입의 값으로 해석해서 반환한다.
     */

    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i);   // 16진수 대문자로 출력
    }
}
