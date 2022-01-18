package com.probert999.romannumerals;

public enum RomanNumeralsEnum {
  M(1000, "M"),
  CM(900, "CM"),
  D(500, "D"),
  CD(400, "CD"),
  C(100, "C"),
  XC(90, "XC"),
  L(50, "L"),
  XL(40, "XL"),
  X(10, "X"),
  IX(9, "IX"),
  V(5, "V"),
  IV(4, "IV"),
  I(1, "I");

  private final int deciaml;
  private final String roman;

  RomanNumeralsEnum(int decimal, String roman) {
    this.deciaml = decimal;
    this.roman = roman;
  }

  public int getDecimal() {
    return this.deciaml;
  }

  public String getNumeral() {
    return this.roman;
  }
}
