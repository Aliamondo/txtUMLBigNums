package math;

import java.math.RoundingMode;

import hu.elte.txtuml.api.model.Collection;
import hu.elte.txtuml.api.model.external.ExternalClass;

public interface BigDecimal extends ExternalClass {
	public static final BigDecimal ZERO = new BigDecimalImplementation(java.math.BigDecimal.ZERO);
	public static final BigDecimal ONE  = new BigDecimalImplementation(java.math.BigDecimal.ONE);
	public static final BigDecimal TEN  = new BigDecimalImplementation(java.math.BigDecimal.TEN);

	public static final int ROUND_CEILING     = java.math.BigDecimal.ROUND_CEILING;
	public static final int ROUND_DOWN        = java.math.BigDecimal.ROUND_DOWN;
	public static final int ROUND_FLOOR       = java.math.BigDecimal.ROUND_FLOOR;
	public static final int ROUND_HALF_DOWN   = java.math.BigDecimal.ROUND_HALF_DOWN;
	public static final int ROUND_HALF_EVEN   = java.math.BigDecimal.ROUND_HALF_EVEN;
	public static final int ROUND_HALF_UP     = java.math.BigDecimal.ROUND_HALF_UP;
	public static final int ROUND_UNNECESSARY = java.math.BigDecimal.ROUND_UNNECESSARY;
	public static final int ROUND_UP          = java.math.BigDecimal.ROUND_UP;

	public static BigDecimal valueOf(double val) {
		return new BigDecimalImplementation(java.math.BigDecimal.valueOf(val));
	}
	public static BigDecimal valueOf(long val) {
		return new BigDecimalImplementation(java.math.BigDecimal.valueOf(val));
	}
	public static BigDecimal valueOf(long unscaledVal, int scale) {
		return new BigDecimalImplementation(java.math.BigDecimal.valueOf(unscaledVal, scale));
	}

	public BigDecimal abs();
	public BigDecimal abs(MathContext mc);
	public BigDecimal add(BigDecimal augend);
	public BigDecimal add(BigDecimal augend, MathContext mc);
	public byte byteValue();
	public byte byteValueExact();
	public int compareTo(BigDecimal val);
	public BigDecimal divide(BigDecimal divisor);
	public BigDecimal divide(BigDecimal divisor, int roundingMode);
	public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode);
	public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode);
	public BigDecimal divide(BigDecimal divisor, MathContext mc);
	public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode);
	public Collection<BigDecimal> divideAndRemainder(BigDecimal divisor);
	public Collection<BigDecimal> divideAndRemainder(BigDecimal divisor, MathContext mc);
	public BigDecimal divideToIntegralValue(BigDecimal divisor);
	public BigDecimal divideToIntegralValue(BigDecimal divisor, MathContext mc);
	public double doubleValue();
	public boolean equals(Object x);
	public float floatValue();
	public int hashCode();
	public int intValue();
	public int intValueExact();
	public long longValue();
	public long longValueExact();
	public BigDecimal max(BigDecimal val);
	public BigDecimal min(BigDecimal val);
	public BigDecimal movePointLeft(int n);
	public BigDecimal movePointRight(int n);
	public BigDecimal multiply(BigDecimal val);
	public BigDecimal multiply(BigDecimal val, MathContext mc);
	public BigDecimal negate();
	public BigDecimal negate(MathContext mc);
	public BigDecimal plus();
	public BigDecimal plus(MathContext mc);
	public BigDecimal pow(int n);
	public BigDecimal pow(int n, MathContext mc);
	public int precision();
	public BigDecimal remainder(BigDecimal divisor);
	public BigDecimal remainder(BigDecimal divisor, MathContext mc);
	public BigDecimal round(MathContext mc);
	public int scale();
	public BigDecimal scaleByPowerOfTen(int n);
	public BigDecimal setScale(int newScale);
	public BigDecimal setScale(int newScale, int roundingMode);
	public BigDecimal setScale(int newScale, RoundingMode roundingMode);
	public short shortValue();
	public short shortValueExact();
	public int signum();
	public BigDecimal stripTrailingZeros();
	public BigDecimal subtract(BigDecimal subtrahend);
	public BigDecimal subtract(BigDecimal subtrahend, MathContext mc);
	public BigInteger toBigInteger();
	public BigInteger toBigIntegerExact();
	public String toEngineeringString();
	public String toPlainString();
	public String toString();
	public BigDecimal ulp();
	public BigInteger unscaledValue();
}
