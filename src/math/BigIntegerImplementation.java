package math;

import java.util.Random;

public class BigIntegerImplementation implements BigInteger {

	/*
	 * Protected constructor to make conversion faster
	 */
	protected BigIntegerImplementation(java.math.BigInteger val) {
		this.num = val;
	}

	public BigIntegerImplementation(byte[] val) {
		this.num = new java.math.BigInteger(val);
	}
	public BigIntegerImplementation(int signum, byte[] magnitude) {
		this.num = new java.math.BigInteger(signum, magnitude);
	}
	public BigIntegerImplementation(int bitLength, int certainty, Random rnd) {
		this.num = new java.math.BigInteger(bitLength, certainty, rnd);
	}
	public BigIntegerImplementation(int numBits, Random rnd) {
		this.num = new java.math.BigInteger(numBits, rnd);
	}
	public BigIntegerImplementation(String val) {
		this.num = new java.math.BigInteger(val);
	}
	public BigIntegerImplementation(String val, int radix) {
		this.num = new java.math.BigInteger(val, radix);
	}
		
//	public BigIntegerImplementation(byte[] val) {
//		super(val);
//	}
//	public BigIntegerImplementation(int signum, byte[] magnitude) {
//		super(signum, magnitude);
//	}
//	public BigIntegerImplementation(int bitLength, int certainty, Random rnd) {
//		super(bitLength, certainty, rnd);
//	}
//	public BigIntegerImplementation(int numBits, Random rnd) {
//		super(numBits, rnd);
//	}
//	public BigIntegerImplementation(String val) {
//		super(val);
//	}
//	public BigIntegerImplementation(String val, int radix) {
//		super(val, radix);
//	}
	
	private java.math.BigInteger num; /* = java.math.BigInteger.ZERO;*/

	public BigInteger abs() {
		return new BigIntegerImplementation(num.abs());
	}
	public String toString() {
		return num.toString();
	}
}
