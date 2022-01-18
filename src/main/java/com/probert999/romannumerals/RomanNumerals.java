package com.probert999.romannumerals;

import java.util.Collections;

public class RomanNumerals {

  public static String convertToNumeral(int decimalValue) {

    String returnString = "";
    for (RomanNumeralsEnum numeral : RomanNumeralsEnum.values()) {
      int numeralValue = numeral.getDecimal();
      int addValue = decimalValue / numeralValue;
      if (addValue > 0) {
        returnString = returnString.concat(String.join("", Collections.nCopies(addValue, numeral.getNumeral())));
        decimalValue -= (addValue * numeralValue);
      }
    }

    return returnString;
  }

  public static int convertToDecimal(String numeralToConvert) {
    int decimalValue = 0;
    int previousNumeralValue = 9999;
    for (int position = 0; position < numeralToConvert.length(); position++) {
      RomanNumeralsEnum currentNumeral =
          RomanNumeralsEnum.valueOf(numeralToConvert.substring(position, position + 1));
      int currentNumeralValue = currentNumeral.getDecimal();
      if (currentNumeralValue <= previousNumeralValue) {
        decimalValue += currentNumeralValue;
        previousNumeralValue = currentNumeralValue;
      } else {
        decimalValue += currentNumeralValue - (previousNumeralValue * 2);
        previousNumeralValue = 9999;
      }
    }
    return decimalValue;
  }
}
