package math;

import java.util.Random;

import hu.elte.txtuml.api.model.Collection;
import hu.elte.txtuml.api.model.external.ExternalClass;

public interface BigInteger extends ExternalClass {
	public static final BigInteger ZERO = new BigIntegerImplementation(java.math.BigInteger.ZERO);
	public static final BigInteger ONE  = new BigIntegerImplementation(java.math.BigInteger.ONE);
	public static final BigInteger TEN  = new BigIntegerImplementation(java.math.BigInteger.TEN);

	//	Static "constructor" as a workaround
	//	public static BigInteger BigInteger(String val) {
	//		return new BigIntegerImplementation(val);
	//	}

	public static BigInteger probablePrime(int bitLength, Random rnd) {
		return new BigIntegerImplementation(java.math.BigInteger.probablePrime(bitLength, rnd));
	}

	public static BigInteger probablePrime(int bitLength) {
		// TODO Delete this or the previous method
		return new BigIntegerImplementation(java.math.BigInteger.probablePrime(bitLength, new Random()));
	}

	public static BigInteger valueOf(long val) {
		return new BigIntegerImplementation(java.math.BigInteger.valueOf(val));
	}

	public BigInteger abs();
	public BigInteger add(BigInteger val);
	public BigInteger and(BigInteger val);
	public BigInteger andNot(BigInteger val);
	public int bitCount();
	public int bitLength();
	public byte byteValue();
	public byte byteValueExact();
	public BigInteger clearBit(int n);
	public int compareTo(BigInteger val);
	public BigInteger divide(BigInteger val);
	public Collection<BigInteger> divideAndRemainder(BigInteger val);
	public double doubleValue();
	public boolean equals(Object x);
	public BigInteger flipBit(int n);
	public float floatValue();
	public BigInteger gcd(BigInteger val);
	public int getLowestSetBit();
	public int hashCode();
	public int intValue();
	public int intValueExact();
	public boolean isProbablePrime(int certainty);
	public long longValue();
	public long longValueExact();
	public BigInteger max(BigInteger val);
	public BigInteger min(BigInteger val);
	public BigInteger mod(BigInteger m);
	public BigInteger modInverse(BigInteger m);
	public BigInteger modPow(BigInteger exponent, BigInteger m);
	public BigInteger multiply(BigInteger val);
	public BigInteger negate();
	public BigInteger nextProbablePrime();
	public BigInteger not();
	public BigInteger or(BigInteger val);
	public BigInteger pow(int exponent);
	public BigInteger remainder(BigInteger val);
	public BigInteger setBit(int n);
	public BigInteger shiftLeft(int n);
	public BigInteger shiftRight(int n);
	public short shortValue();
	public short shortValueExact();
	public int signum();
	public BigInteger subtract(BigInteger val);
	public boolean testBit(int n);
	public Collection<Byte> toByteArray();
	public String toString();
	public String toString(int radix);
	public BigInteger xor(BigInteger val);
}
