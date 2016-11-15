package math;

import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalImplementation implements BigDecimal {

	/*
	 * Protected constructor to make conversion faster
	 */
	protected BigDecimalImplementation(java.math.BigDecimal val) {
		this.num = val;
	}

	/*
	 * Extract java.math.BigDecimal from BigDecimal
	 */
	protected static java.math.BigDecimal getOrigBigDecimal(Object val) {
		if (val instanceof BigDecimalImplementation) {
			return ((BigDecimalImplementation) val).num;
		}
		else if (val instanceof BigDecimal) {
			return ((BigDecimalImplementation)(BigDecimal) val).num;
		}
		// Otherwise it's an error
		else return null;
	}
	public BigDecimalImplementation(BigInteger val) {
		this.num = new java.math.BigDecimal(BigIntegerImplementation.getOrigBigInteger(val));
	}
	public BigDecimalImplementation(BigInteger unscaledVal, int scale) {
		this.num = new java.math.BigDecimal(BigIntegerImplementation.getOrigBigInteger(unscaledVal), scale);
	}
	public BigDecimalImplementation(BigInteger unscaledVal, int scale, MathContext mc) {
		this.num = new java.math.BigDecimal(BigIntegerImplementation.getOrigBigInteger(unscaledVal), scale, mc);
	}
	public BigDecimalImplementation(BigInteger unscaledVal, MathContext mc) {
		this.num = new java.math.BigDecimal(BigIntegerImplementation.getOrigBigInteger(unscaledVal), mc);
	}
	public BigDecimalImplementation(char[] in) {
		this.num = new java.math.BigDecimal(in);
	}
	public BigDecimalImplementation(char[] in, int offset, int len) {
		this.num = new java.math.BigDecimal(in, offset, len);
	}
	public BigDecimalImplementation(char[] in, int offset, int len, MathContext mc) {
		this.num = new java.math.BigDecimal(in, offset, len, mc);
	}
	public BigDecimalImplementation(char[] in, MathContext mc) {
		this.num = new java.math.BigDecimal(in, mc);
	}
	public BigDecimalImplementation(double val) {
		this.num = new java.math.BigDecimal(val);
	}
	public BigDecimalImplementation(double val, MathContext mc) {
		this.num = new java.math.BigDecimal(val, mc);
	}
	public BigDecimalImplementation(int val) {
		this.num = new java.math.BigDecimal(val);
	}
	public BigDecimalImplementation(int val, MathContext mc) {
		this.num = new java.math.BigDecimal(val, mc);
	}
	public BigDecimalImplementation(long val) {
		this.num = new java.math.BigDecimal(val);
	}
	public BigDecimalImplementation(long val, MathContext mc) {
		this.num = new java.math.BigDecimal(val, mc);
	}
	public BigDecimalImplementation(String val) {
		this.num = new java.math.BigDecimal(val);
	}
	public BigDecimalImplementation(String val, MathContext mc) {
		this.num = new java.math.BigDecimal(val, mc);
	}

	private java.math.BigDecimal num; /* = java.math.BigDecimal.ZERO;*/

	@Override
	public BigDecimal abs() {
		return new BigDecimalImplementation(num.abs());
	}

	@Override
	public BigDecimal abs(MathContext mc) {
		return new BigDecimalImplementation(num.abs(mc));
	}

	@Override
	public BigDecimal add(BigDecimal augend) {
		return new BigDecimalImplementation(num.add(getOrigBigDecimal(augend)));
	}

	@Override
	public BigDecimal add(BigDecimal augend, MathContext mc) {
		return new BigDecimalImplementation(num.add(getOrigBigDecimal(augend), mc));
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
	public int compareTo(BigDecimal val) {
		return num.compareTo(getOrigBigDecimal(val));
	}

	@Override
	public BigDecimal divide(BigDecimal divisor) {
		return new BigDecimalImplementation(num.divide(getOrigBigDecimal(divisor)));
	}

	@Override
	public BigDecimal divide(BigDecimal divisor, int roundingMode) {
		return new BigDecimalImplementation(num.divide(getOrigBigDecimal(divisor), roundingMode));
	}

	@Override
	public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) {
		return new BigDecimalImplementation(num.divide(getOrigBigDecimal(divisor), scale, roundingMode));
	}

	@Override
	public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode) {
		return new BigDecimalImplementation(num.divide(getOrigBigDecimal(divisor), scale, roundingMode));
	}

	@Override
	public BigDecimal divide(BigDecimal divisor, MathContext mc) {
		return new BigDecimalImplementation(num.divide(getOrigBigDecimal(divisor), mc));
	}

	@Override
	public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode) {
		return new BigDecimalImplementation(num.divide(getOrigBigDecimal(divisor), roundingMode));
	}

	@Override
	public BigDecimal[] divideAndRemainder(BigDecimal divisor) {
		//FIXME Create a new OuterClass to store arrays OR decide on another return type OR delete this method
		java.math.BigDecimal[] result = num.divideAndRemainder(getOrigBigDecimal(divisor));
		return new BigDecimal[]{new BigDecimalImplementation(result[0]), new BigDecimalImplementation(result[1])};
	}

	@Override
	public BigDecimal[] divideAndRemainder(BigDecimal divisor, MathContext mc) {
		//FIXME Create a new OuterClass to store arrays OR decide on another return type OR delete this method
		java.math.BigDecimal[] result = num.divideAndRemainder(getOrigBigDecimal(divisor), mc);
		return new BigDecimal[]{new BigDecimalImplementation(result[0]), new BigDecimalImplementation(result[1])};
	}

	@Override
	public BigDecimal divideToIntegralValue(BigDecimal divisor) {
		return new BigDecimalImplementation(num.divideToIntegralValue(getOrigBigDecimal(divisor)));
	}

	@Override
	public BigDecimal divideToIntegralValue(BigDecimal divisor, MathContext mc) {
		return new BigDecimalImplementation(num.divideToIntegralValue(getOrigBigDecimal(divisor), mc));
	}

	@Override
	public double doubleValue() {
		return num.doubleValue();
	}

	@Override
	public boolean equals(Object x) {
		return num.equals(getOrigBigDecimal(x));
	}

	@Override
	public float floatValue() {
		return num.floatValue();
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
	public long longValue() {
		return num.longValue();
	}

	@Override
	public long longValueExact() {
		return num.longValueExact();
	}

	@Override
	public BigDecimal max(BigDecimal val) {
		return new BigDecimalImplementation(num.max(getOrigBigDecimal(val)));
	}

	@Override
	public BigDecimal min(BigDecimal val) {
		return new BigDecimalImplementation(num.min(getOrigBigDecimal(val)));
	}

	@Override
	public BigDecimal movePointLeft(int n) {
		return new BigDecimalImplementation(num.movePointLeft(n));
	}

	@Override
	public BigDecimal movePointRight(int n) {
		return new BigDecimalImplementation(num.movePointRight(n));
	}

	@Override
	public BigDecimal multiply(BigDecimal val) {
		return new BigDecimalImplementation(num.multiply(getOrigBigDecimal(val)));
	}

	@Override
	public BigDecimal multiply(BigDecimal val, MathContext mc) {
		return new BigDecimalImplementation(num.multiply(getOrigBigDecimal(val), mc));
	}

	@Override
	public BigDecimal negate() {
		return new BigDecimalImplementation(num.negate());
	}

	@Override
	public BigDecimal negate(MathContext mc) {
		return new BigDecimalImplementation(num.negate(mc));
	}

	@Override
	public BigDecimal plus() {
		return new BigDecimalImplementation(num.plus());
	}

	@Override
	public BigDecimal plus(MathContext mc) {
		return new BigDecimalImplementation(num.plus(mc));
	}

	@Override
	public BigDecimal pow(int n) {
		return new BigDecimalImplementation(num.pow(n));
	}

	@Override
	public BigDecimal pow(int n, MathContext mc) {
		return new BigDecimalImplementation(num.pow(n, mc));
	}

	@Override
	public int precision() {
		return num.precision();
	}

	@Override
	public BigDecimal remainder(BigDecimal divisor) {
		return new BigDecimalImplementation(num.remainder(getOrigBigDecimal(divisor)));
	}

	@Override
	public BigDecimal remainder(BigDecimal divisor, MathContext mc) {
		return new BigDecimalImplementation(num.remainder(getOrigBigDecimal(divisor), mc));
	}

	@Override
	public BigDecimal round(MathContext mc) {
		return new BigDecimalImplementation(num.round(mc));
	}

	@Override
	public int scale() {
		return num.scale();
	}

	@Override
	public BigDecimal scaleByPowerOfTen(int n) {
		return new BigDecimalImplementation(num.scaleByPowerOfTen(n));
	}

	@Override
	public BigDecimal setScale(int newScale) {
		return new BigDecimalImplementation(num.setScale(newScale));
	}

	@Override
	public BigDecimal setScale(int newScale, int roundingMode) {
		return new BigDecimalImplementation(num.setScale(newScale, roundingMode));
	}

	@Override
	public BigDecimal setScale(int newScale, RoundingMode roundingMode) {
		return new BigDecimalImplementation(num.setScale(newScale, roundingMode));
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
	public BigDecimal stripTrailingZeros() {
		return new BigDecimalImplementation(num.stripTrailingZeros());
	}

	@Override
	public BigDecimal subtract(BigDecimal subtrahend) {
		return new BigDecimalImplementation(num.subtract(getOrigBigDecimal(subtrahend)));
	}

	@Override
	public BigDecimal subtract(BigDecimal subtrahend, MathContext mc) {
		return new BigDecimalImplementation(num.subtract(getOrigBigDecimal(subtrahend), mc));
	}

	@Override
	public BigInteger toBigInteger() {
		return new BigIntegerImplementation(num.toBigInteger());
	}

	@Override
	public BigInteger toBigIntegerExact() {
		return new BigIntegerImplementation(num.toBigIntegerExact());
	}

	@Override
	public String toEngineeringString() {
		return num.toEngineeringString();
	}

	@Override
	public String toPlainString() {
		return num.toPlainString();
	}

	@Override
	public String toString() {
		return num.toString();
	}

	@Override
	public BigDecimal ulp() {
		return new BigDecimalImplementation(num.ulp());
	}

	@Override
	public BigInteger unscaledValue() {
		return new BigIntegerImplementation(num.unscaledValue());
	}
}
