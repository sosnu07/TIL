package ch3.example;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);        // 명시적 타입지정 필요
        System.out.println(c);
    }
}
