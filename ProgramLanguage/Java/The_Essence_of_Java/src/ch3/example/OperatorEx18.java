package ch3.example;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shorPi = Math.round(pi * 1000) / 1000.0;     // Math.round() 메서드는 소수점 첫째자리에서 만올림하고 정수로 되돌림
        System.out.println(shorPi);
    }
}
