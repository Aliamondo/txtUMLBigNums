package math;

import java.math.RoundingMode;

public class MathContextImplementation implements MathContext {

	/*
	 * Protected constructor to make conversion faster
	 */
	protected MathContextImplementation(java.math.MathContext mc) {
		this.mc = mc;
	}

	/*
	 * Extract java.math.BigInteger from BigInteger
	 */
	protected static java.math.MathContext getOrigMathContext(Object val) {
		if (val instanceof MathContextImplementation) {
			return ((MathContextImplementation) val).mc;
		}
		else if (val instanceof MathContext) {
			return ((MathContextImplementation)(MathContext) val).mc;
		}
		// Otherwise it's an error
		else return null;
	}
	public MathContextImplementation(int setPrecision) {
		this.mc = new java.math.MathContext(setPrecision);
	}
	public MathContextImplementation(int setPrecision, RoundingMode setRoundingMode) {
		this.mc = new java.math.MathContext(setPrecision, setRoundingMode);
	}
	public MathContextImplementation(String val) {
		this.mc = new java.math.MathContext(val);
	}
	
	private java.math.MathContext mc;

	@Override
	public boolean equals(Object x) {
		return mc.equals(getOrigMathContext(x));
	}

	@Override
	public int getPrecision() {
		return mc.getPrecision();
	}

	@Override
	public RoundingMode getRoundingMode() {
		return mc.getRoundingMode();
	}

	@Override
	public int hashCode() {
		return mc.hashCode();
	}

	@Override
	public String toString() {
		return mc.toString();
	}
}