package com.codegym.Controller;

public class caculator {
    public static float caculatorr(float value1, float value2, String caculation) {
        switch (caculation) {
            case "Addition(+)":
                return value1 + value2;

            case "Subtraction(-)":
                return value1 - value2;

            case "Multiplication(x)":
                return value1 * value2;

            case "Division(/)":
                if (value1 != 0) {
                    return value1 / value2;
                } else {
                    return 0;
                }
            default:
                return 0;


        }

    }
}
