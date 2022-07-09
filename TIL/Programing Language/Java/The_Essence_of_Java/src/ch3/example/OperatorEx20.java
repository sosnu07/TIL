package ch3.example;

public class OperatorEx20 {
    public static void main(String[] args) {
        System.out.println(-10%8);
        System.out.println(10%8);
        System.out.println(-10%-8);

        // 나머지 연산자는 음수도 허용한다.
        // 다만, 부호는 무시되으로 절대값 상태에서 나머지 연산을 진행한다고 생각 할 것
    }
}
