package com.learn.practiceexam;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Quetion10 {

	public static void main(String[] args) {
		
		//Function<String> hello = () -> "Hello";//not allowed

		//DoubleConsumer cube = x -> x*x*x;//notnot return a value 

		//BiPredicate<Integer, Integer> add = (x, y) -> x + y;//cannot convert int to boolen

		Supplier<String> hello = () -> "Hello";

		BiPredicate<Integer, Integer> test = (x, y) -> x == y;
		
		//DoublePredicate<Integer, Integer> test = (x, y) -> x == y;

		BiFunction<Integer, Integer, Integer> divide = (x, y) -> x/y;

		IntPredicate test1 = x -> x == 10;

		DoubleFunction<Double> area = r -> Math.PI*r*r;
	}

}
