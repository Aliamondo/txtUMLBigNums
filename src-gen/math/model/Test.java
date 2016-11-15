package math.model;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.ModelClass;
import math.BigInteger;

@SuppressWarnings("all")
public class Test extends ModelClass {
  BigInteger num;
  
  Test() {
    this.num = BigInteger.ZERO;
    String _string = this.num.toString();
    Action.log(_string);
    BigInteger _valueOf = BigInteger.valueOf((-12));
    this.num = _valueOf;
    String _string_1 = this.num.toString();
    Action.log(_string_1);
    BigInteger _abs = this.num.abs();
    this.num = _abs;
    String _string_2 = this.num.toString();
    Action.log(_string_2);
    BigInteger _BigInteger = BigInteger.BigInteger("666");
    this.num = _BigInteger;
    String _string_3 = this.num.toString();
    Action.log(_string_3);
    BigInteger _BigInteger_1 = BigInteger.BigInteger("51");
    this.num = _BigInteger_1;
    String _string_4 = this.num.toString();
    Action.log(_string_4);
  }
}
