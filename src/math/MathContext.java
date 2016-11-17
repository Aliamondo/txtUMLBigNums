package math;

import java.math.RoundingMode;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface MathContext extends ExternalClass {
	public static final MathContext DECIMAL128 = new MathContextImplementation(java.math.MathContext.DECIMAL128);
	public static final MathContext DECIMAL32  = new MathContextImplementation(java.math.MathContext.DECIMAL32);
	public static final MathContext DECIMAL64  = new MathContextImplementation(java.math.MathContext.DECIMAL64);
	public static final MathContext UNLIMITED  = new MathContextImplementation(java.math.MathContext.UNLIMITED);

	public boolean equals(Object x);
	public int getPrecision();
	public RoundingMode getRoundingMode();
	public int hashCode();
	public String toString();
}