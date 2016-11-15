package math;

import java.util.Random;

import hu.elte.txtuml.api.model.Collection;

public class BigIntegerImplementation implements BigInteger {

	/*
	 * Protected constructor to make conversion faster
	 */
	protected BigIntegerImplementation(java.math.BigInteger val) {
		this.num = val;
	}

	/*
	 * Extract java.math.BigInteger from BigInteger
	 */
	protected static java.math.BigInteger getOrigBigInteger(Object val) {
		if (val instanceof BigIntegerImplementation) {
			return ((BigIntegerImplementation) val).num;
		}
		else if (val instanceof BigInteger) {
			return ((BigIntegerImplementation)(BigInteger) val).num;
		}
		// Otherwise it's an error
		else return null;
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

	private java.math.BigInteger num; /* = java.math.BigInteger.ZERO;*/

	@Override
	public BigInteger abs() {
		return new BigIntegerImplementation(num.abs());
	}

	@Override
	public BigInteger add(BigInteger val) {
		return new BigIntegerImplementation(num.add(getOrigBigInteger(val)));
	}

	@Override
	public BigInteger and(BigInteger val) {
		return new BigIntegerImplementation(num.and(getOrigBigInteger(val)));
	}

	@Override
	public BigInteger andNot(BigInteger val) {
		return new BigIntegerImplementation(num.andNot(getOrigBigInteger(val)));
	}

	@Override
	public int bitCount() {
		return num.bitCount();
	}

	@Override
	public int bitLength() {
		return num.bitLength();
	}

	@Override
	public byte byteValue() {
		return num.byteValue();
	}

	@Override
	public byte byteValueExact() {
		return num.byteValueExact();
	}

	@Override
	public BigInteger clearBit(int n) {
		return new BigIntegerImplementation(num.clearBit(n));
	}

	@Override
	public int compareTo(BigInteger val) {
		return num.compareTo(getOrigBigInteger(val));
	}

	@Override
	public BigInteger divide(BigInteger val) {
		return new BigIntegerImplementation(num.divide(getOrigBigInteger(val)));
	}

	@Override
	public Collection<BigInteger> divideAndRemainder(BigInteger val) {
		java.math.BigInteger[] arr = num.divideAndRemainder(getOrigBigInteger(val));
		Collection<BigInteger> result = new Collection.Empty<>();
		for (java.math.BigInteger temp : arr) result = result.add(new BigIntegerImplementation(temp));
		return result;
	}

	@Override
	public double doubleValue() {
		return num.doubleValue();
	}

	@Override
	public boolean equals(Object x) {
		return num.equals(getOrigBigInteger(x));
	}

	@Override
	public BigInteger flipBit(int n) {
		return new BigIntegerImplementation(num.flipBit(n));
	}

	@Override
	public float floatValue() {
		return num.floatValue();
	}

	@Override
	public BigInteger gcd(BigInteger val) {
		return new BigIntegerImplementation(num.gcd(getOrigBigInteger(val)));
	}

	@Override
	public int getLowestSetBit() {
		return num.getLowestSetBit();
	}

	@Override
	public int hashCode() {
		return num.hashCode();
	}

	@Override
	public int intValue() {
		return num.intValue();
	}

	@Override
	public int intValueExact() {
		return num.intValueExact();
	}

	@Override
	public boolean isProbablePrime(int certainty) {
		return num.isProbablePrime(certainty);
	}

	@Override
	public long longValue() {
		return num.longValue();
	}

	@Override
	public long longValueExact() {
		return num.longValueExact();
	}

	@Override
	public BigInteger max(BigInteger val) {
		return new BigIntegerImplementation(num.max(getOrigBigInteger(val)));
	}

	@Override
	public BigInteger min(BigInteger val) {
		return new BigIntegerImplementation(num.min(getOrigBigInteger(val)));
	}

	@Override
	public BigInteger mod(BigInteger m) {
		return new BigIntegerImplementation(num.mod(getOrigBigInteger(m)));
	}

	@Override
	public BigInteger modInverse(BigInteger m) {
		return new BigIntegerImplementation(num.modInverse(getOrigBigInteger(m)));
	}

	@Override
	public BigInteger modPow(BigInteger exponent, BigInteger m) {
		return new BigIntegerImplementation(num.modPow(getOrigBigInteger(exponent), getOrigBigInteger(m)));
	}

	@Override
	public BigInteger multiply(BigInteger val) {
		return new BigIntegerImplementation(num.multiply(getOrigBigInteger(val)));
	}

	@Override
	public BigInteger negate() {
		return new BigIntegerImplementation(num.negate());
	}

	@Override
	public BigInteger nextProbablePrime() {
		return new BigIntegerImplementation(num.nextProbablePrime());
	}

	@Override
	public BigInteger not() {
		return new BigIntegerImplementation(num.not());
	}

	@Override
	public BigInteger or(BigInteger val) {
		return new BigIntegerImplementation(num.or(getOrigBigInteger(val)));
	}

	@Override
	public BigInteger pow(int exponent) {
		return new BigIntegerImplementation(num.pow(exponent));
	}

	@Override
	public BigInteger remainder(BigInteger val) {
		return new BigIntegerImplementation(num.remainder(getOrigBigInteger(val)));
	}

	@Override
	public BigInteger setBit(int n) {
		return new BigIntegerImplementation(num.setBit(n));
	}

	@Override
	public BigInteger shiftLeft(int n) {
		return new BigIntegerImplementation(num.shiftLeft(n));
	}

	@Override
	public BigInteger shiftRight(int n) {
		return new BigIntegerImplementation(num.shiftRight(n));
	}

	@Override
	public short shortValue() {
		return num.shortValue();
	}

	@Override
	public short shortValueExact() {
		return num.shortValueExact();
	}

	@Override
	public int signum() {
		return num.signum();
	}

	@Override
	public BigInteger subtract(BigInteger val) {
		return new BigIntegerImplementation(num.subtract(getOrigBigInteger(val)));
	}

	@Override
	public boolean testBit(int n) {
		return num.testBit(n);
	}

	@Override
	public Collection<Byte> toByteArray() {
		byte[] arr = num.toByteArray();
		Collection<Byte> result = new Collection.Empty<>();
		for (byte b : arr) result = result.add(b);
		return result;
	}

	@Override
	public String toString() {
		return num.toString();
	}

	@Override
	public String toString(int radix) {
		return num.toString(radix);
	}

	@Override
	public BigInteger xor(BigInteger val) {
		return new BigIntegerImplementation(num.xor(getOrigBigInteger(val)));
	}
}
