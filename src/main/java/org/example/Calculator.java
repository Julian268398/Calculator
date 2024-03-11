package org.example;

public class Calculator {
    // Metoda dodawania dwóch liczb całkowitych
    public int add(int a, int b) {
        return a + b;
    }

    // Metoda odejmowania dwóch liczb całkowitych
    public int subtract(int a, int b) {
        return a - b;
    }
    // Metoda mnożenia dwóch liczb całkowitych
    public int multiply(int a, int b) {
        return a * b;
    }

    // Metoda dzielenia dwóch liczb całkowitych
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nie można dzielić przez zero");
        }
        return a / b;
    }

}