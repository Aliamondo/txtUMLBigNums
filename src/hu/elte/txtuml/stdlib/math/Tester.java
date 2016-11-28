package hu.elte.txtuml.stdlib.math;

import java.util.Random;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;
import math.model.TestBigDecimal;
import math.model.TestBigInteger;

public class Tester {
	private static TestBigInteger testBigInteger;
	private static TestBigDecimal testBigDecimal;
	static void init() {
		Action.log("BigInteger test:");
		testBigInteger = Action.create(TestBigInteger.class);
		Action.start(testBigInteger);
//		Collection<BigInteger> arr = (new BigIntegerImplementation("42")).divideAndRemainder(new BigIntegerImplementation("15"));
//		System.out.println(42 + " divideAndRemainder " + 15 + " = " + arr);
		System.out.println("probablePrime(" + 10 + ") = " + BigInteger.probablePrime(10, new Random()));
//		Collection<Byte> byteArr = new BigIntegerImplementation("42").toByteArray();
//		System.out.println("42 toByteArray: " + byteArr);
		
		System.out.println();
		Action.log("BigDecimal test:");
		testBigDecimal = Action.create(TestBigDecimal.class);
		Action.start(testBigDecimal);
	}
	public static void main(String[] args) {
		ModelExecutor.create().setTraceLogging(true).start(Tester::init);
	}
}
