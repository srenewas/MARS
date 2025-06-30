package com.seenu.FunctionalInterface;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class specialized_functional_interfaces {
    public static void main(String[] args) {

        /*🔁 UnaryOperator<T>
        A specialization of Function<T, T>
        Takes one input and returns a result of the same type*/
        UnaryOperator<Integer> unaryOperator = s->s*s;
        System.out.println(unaryOperator.apply(5));

        /*➕ BinaryOperator<T>
        A specialization of BiFunction<T, T, T>
        Takes two inputs of the same type and returns same type*/
        BinaryOperator<Integer> binaryOperator = (a,b)->a+b;
        System.out.println(binaryOperator.apply(10,20));

    }
}
