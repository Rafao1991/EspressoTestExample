package com.rafaosousa.example.espressotestexample;

public class Calculator {

    public long sum(long... longs) {
        long result = 0;

        for (long l : longs)
            result += l;

        return result;
    }

    public long subtract(long... longs) {
        long result = 0;

        for (long l : longs)
            result -= l;

        return result;
    }

    public long multiply(long... longs) {
        long result = 1;

        for (long l : longs)
            result *= l;

        return result;
    }

    public long divide(long... longs) {
        long result = 0;

        for (long l : longs)
            if (result == 0)
                result = l;
            else
                result /= l;

        return result;
    }
}
