package com.averkina;

public class PrivateClass {
    @PublicClass(count=4)
    static private void firstMethod() {
        System.out.println("Первый метод, выполняется 4 раза!");
    }

    @PublicClass(count=2)
    static private void secondMethod() {
        System.out.println("Второй метод, выполняется 2 раза!");
    }

    @PublicClass(count=3)
    static private void thirdMethod() {
        System.out.println("Третий метод, выполняется 3 раза!");
    }

    @PublicClass(count=1)
    static private void fourthMethod() {
        System.out.println("Четвертый метод, выполняется 1 раза!");
    }
}
