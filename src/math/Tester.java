package math;

import java.util.Random;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;
import math.model.TestBigInteger;

public class Tester {
	private static TestBigInteger testBigInteger;
	static void init() {
		testBigInteger = Action.create(TestBigInteger.class);
		Action.start(testBigInteger);
//		BigInteger[] arr = (new BigIntegerImplementation("42")).divideAndRemainder(new BigIntegerImplementation("15"));
//		System.out.println(42 + " divideAndRemainder " + 15 + " = " + Arrays.toString(arr));
		System.out.println("probablePrime(" + 10 + ") = " + BigInteger.probablePrime(10, new Random()));
//		byte[] byteArr = new BigIntegerImplementation("42").toByteArray();
//		System.out.println("42 toByteArray: " + Arrays.toString(byteArr));
	}
	public static void main(String[] args) {
		ModelExecutor.create().setTraceLogging(true).start(Tester::init);
	}
}
