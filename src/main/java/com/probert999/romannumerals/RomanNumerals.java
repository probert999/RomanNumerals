package com.probert999.romannumerals;

import java.util.Collections;

public class RomanNumerals {

  public static String convert(int decimalValue) {

    String returnString = "";
    for (RomanNumeralsEnum numeral : RomanNumeralsEnum.values()) {
      int numeralValue = numeral.getDecimal();
      int addValue = decimalValue / numeralValue;
      if (addValue > 0) {
        returnString = returnString + String.join("", Collections.nCopies(addValue,numeral.getNumeral()));
        decimalValue -= (addValue * numeralValue);
      }
    }

    return returnString;
  }
}
