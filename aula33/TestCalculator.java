package com.loiane.cursojava.aula33;

public class TestCalculator {

    public static void main(String[] args) {

        MyCalculator calculator = new MyCalculator();

        calculator.soma(1,2);
        calculator.soma(1,2);
        calculator.soma(1.0,2.0);
        calculator.soma(1,2,3);
    }
}
