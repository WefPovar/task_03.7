package com.company;

public class Main {

    public static void main(String[] args) {
        String line = "-6 8 + -2 / 11 +";
        CalcReversePolishNotation calc = new CalcReversePolishNotation(line);
        System.out.println(calc.calculate());
    }
}