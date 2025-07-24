package com.seenu.FunctionalInterface;

import java.util.function.*;

public class FunctionExample {
    public static void main(String[] args) {
     // 1. Function<T, R> – takes input T, returns output R
        Function<String, Integer> function = str->str.length();
        System.out.println(function.apply("Seenu"));

        BiFunction<Integer, Integer,String> biFunction = (x,y)->"Sum: "+(x+y);
        System.out.println(biFunction.apply(10,30));

     // 2. Predicate<T> – takes input T, returns boolean
        Predicate<Integer> predicate = num->num/5==2;
        System.out.println(predicate.test(5));

        BiPredicate<Integer, Integer> biPredicate = (a,b)-> a+b==30;
        System.out.println(biPredicate.test(10,20));

     // 3. Consumer<T> – takes input T, returns nothing
        Consumer<String> consumer = str-> System.out.println(str.toUpperCase());
        consumer.accept("seenu");

        BiConsumer<String,String> biConsumer = (a,b)-> System.out.println(a.concat(b));
        biConsumer.accept("Seenu","Iglesias");

     // 4. Supplier<T> – takes nothing, returns T
        Supplier<String> supplier = ()->"seenu";
        System.out.println(supplier.get());

    }
}
