package com.averkina;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Написать аннотацию с целочисленным параметром. Создать класс, содержащий только приватные методы (3-4 шт.)
,аннотировать любые из них. Вызвать из другого класса все аннотированные методы столько раз
,сколько указано в параметре аннотации.
 */

public class Main {
    public static void main(String[] args) {
        //getDeclaredMethods() - возвращает массив объектов методов, представляющих все методы, определенные в этом объекте класса
        for (Method method : PrivateClass.class.getDeclaredMethods()) {
            PublicClass annotation = method.getAnnotation(PublicClass.class);
            method.setAccessible(true);

            try {
                for (int i = 0; i < annotation.count(); ++i) {
                    method.invoke(null);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.toString());
            }
        }
    }
}
