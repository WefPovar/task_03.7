package com.company;

import java.util.Stack;

public class CalcReversePolishNotation {
    private final String reversePolishNotation;

    public CalcReversePolishNotation(String reversePolishNotation) {
        this.reversePolishNotation = reversePolishNotation;
    }

    public int calculate() {
        if (!reversePolishNotation.equals("")) {
            String[] symbols = reversePolishNotation.split(" ");
            Stack<Integer> numbers = new Stack<>();

            for (String symbol : symbols) {
                if (symbol.matches("[-+]?\\d+")) {
                    numbers.push(Integer.parseInt(symbol));
                } else {
                    int firstNumber = numbers.pop();
                    int secondNumber = numbers.pop();
                    switch (symbol) {
                        case "+" -> numbers.push(secondNumber + firstNumber);
                        case "-" -> numbers.push(secondNumber - firstNumber);
                        case "*" -> numbers.push(secondNumber * firstNumber);
                        case "/" -> numbers.push(secondNumber / firstNumber);
                    }
                }
            }

            return numbers.pop();
        }

        return 0;
    }
}