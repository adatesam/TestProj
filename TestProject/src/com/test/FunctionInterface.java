package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FunctionInterface {


	public static IntStream getFilteredStream(List<Integer> list) {

		return list.stream().mapToInt(Integer::intValue).filter(v -> (v > 5));

	}


	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer[] { 10, 5, 30, 40, 0 });

		Function<List<Integer>,IntStream> funInt = FunctionInterface::getFilteredStream;

		IntStream intStream = funInt.apply(list);

		System.out.println("Min value " + intStream.min().getAsInt());

		System.out.println("Min value " + intStream.max().getAsInt());

	}


}