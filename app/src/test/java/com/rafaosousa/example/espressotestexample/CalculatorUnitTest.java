package com.rafaosousa.example.espressotestexample;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorUnitTest {

    private Calculator calculator = new Calculator();

    @Test
    public void sum_isCorrect() {
        assertEquals(4, calculator.sum(2, 2));
        assertEquals(4, calculator.sum(6, -2));
        assertEquals(4, calculator.sum(1, 1, 1, 1));
        assertEquals(4, calculator.sum(4));
        assertEquals(4, calculator.sum(1, 2, 1));
    }

    @Test
    public void subtract_isCorrect() {
        assertEquals(-4, calculator.subtract(2, 2));
        assertEquals(-4, calculator.subtract(6, -2));
        assertEquals(-4, calculator.subtract(1, 1, 1, 1));
        assertEquals(-4, calculator.subtract(4));
        assertEquals(-4, calculator.subtract(1, 2, 1));
    }

    @Test
    public void multiply_isCorrect() {
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(-12, calculator.multiply(6, -2));
        assertEquals(1, calculator.multiply(1, 1, 1, 1));
        assertEquals(4, calculator.multiply(4));
        assertEquals(2, calculator.multiply(1, 2, 1));
    }

    @Test
    public void divide_isCorrect() {
        assertEquals(1, calculator.divide(2, 2));
        assertEquals(-3, calculator.divide(6, -2));
        assertEquals(1, calculator.divide(1, 1, 1, 1));
        assertEquals(4, calculator.divide(4));
        assertEquals(1, calculator.divide(1, 2, 1));
    }

    @Test
    public void calculator_isCorrect() {
        assertEquals(-1, calculator.subtract(calculator.divide(calculator.sum(6, -2), calculator.multiply(2, 2))));
    }
}