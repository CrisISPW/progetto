package com.example.calculator;

public class Calculation {
   public float calculator(float num1, float num2, String operator) {
            switch (operator) {
                case "Plus":
                    return num1+num2;
                case "Minus":
                    return num1-num2;
                case "Multiply":
                    return num1*num2;
                case "Divide":
                    if (num2 == 0)
                        return 0;
                    return num1/num2;
                default:
                    return 0;
            }}}
