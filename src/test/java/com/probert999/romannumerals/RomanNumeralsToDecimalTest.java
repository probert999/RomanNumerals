package com.probert999.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsToDecimalTest {

  @Test
  public void shouldReturnOneForRomanNumeralI() {
    assertEquals(1, RomanNumerals.convertToDecimal("I"));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#singleRomanNumeralTestData")
  void shouldReturnCorrectDecimalValueForSingleNumeralsDefinedInTestData(
      int expectedValue, String inputNumeral) {
    assertEquals(expectedValue, RomanNumerals.convertToDecimal(inputNumeral));
  }

  @ParameterizedTest
  @MethodSource(
      "com.probert999.romannumerals.RomanNumeralTestData#otherPredefinedRomanNumeralTestData")
  void shouldReturnDecimalValuesForOtherPreDefinedRomanNumerals(
      int expectedValue, String inputNumeral) {
    assertEquals(expectedValue, RomanNumerals.convertToDecimal(inputNumeral));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#otherRomanNumeralTestData")
  void shouldReturnCorrectDecimalValueforNumeralsDefinedInTestData(
      int expectedValue, String inputNumeral) {
    assertEquals(expectedValue, RomanNumerals.convertToDecimal(inputNumeral));
  }
}
