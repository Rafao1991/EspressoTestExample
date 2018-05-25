package com.rafaosousa.example.espressotestexample;

public class Calculator {

    private long sum(Long... longs) {
        long result = 0;

        for (long l : longs)
            result += l;

        return result;
    }

    private long division(Long... longs) {
        long result = 0;

        for (long l : longs)
            result /= l;

        return result;
    }
}
