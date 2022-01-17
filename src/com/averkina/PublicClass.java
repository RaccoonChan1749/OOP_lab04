package com.averkina;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
/*
@Retention - тип хранения
RUNTIME - аннотация которая сохраняется после компиляции и подгружается JVM (т.е. может использоваться во время выполнения самой программы).

SOURCE - аннотация доступна только в исходном коде и сбрасывается во время создания .class файла;
CLASS - аннотация хранится в .class файле, но недоступна во время выполнения программы;
 */
@Target(ElementType.METHOD)
/*
@Target - тип объекта
METHOD - метод класса

PACKAGE - назначением является целый пакет
TYPE - класс, интерфейс, enum или другая аннотация
PARAMETER - параметр метода
CONSTRUCTOR - конструктор
FIELD - поля-свойства класса
LOCAL_VARIABLE - локальная переменная
ANNOTATION_TYPE - другая аннотация
 */
public @interface PublicClass {
    int count() default 1;
}
