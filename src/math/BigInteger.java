package math;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface BigInteger extends ExternalClass {
	public static final BigInteger ZERO = new BigIntegerImplementation(java.math.BigInteger.ZERO);
	public static final BigInteger ONE = new BigIntegerImplementation(java.math.BigInteger.ONE);
	public static final BigInteger TEN = new BigIntegerImplementation(java.math.BigInteger.TEN);
	
	public static BigInteger BigInteger(byte[] val) {
		return new BigIntegerImplementation(val);
	}
	public static BigInteger BigInteger(String val) {
		return new BigIntegerImplementation(val);
	}
	
	public BigInteger abs();
	public String toString();
	public static BigInteger valueOf(long val) {
		return new BigIntegerImplementation(java.math.BigInteger.valueOf(val));
	}
}
