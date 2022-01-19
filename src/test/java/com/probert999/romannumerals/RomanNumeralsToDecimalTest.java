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
  void shouldReturnCorrectDecimalValueForSingleNumeralsTestData(
      int expectedValue, String inputNumeral) {
    assertEquals(expectedValue, RomanNumerals.convertToDecimal(inputNumeral));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#otherPredefinedRomanNumeralTestData")
  void shouldReturnCorrectDecimalValuesForOtherPreDefinedRomanNumeralsTestData(
      int expectedValue, String inputNumeral) {
    assertEquals(expectedValue, RomanNumerals.convertToDecimal(inputNumeral));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#simpleRomanNumeralTestData")
  void shouldReturnCorrectDecimalValuesForSimpleRomanNumeralsTestData(
          int expectedValue, String inputNumeral) {
    assertEquals(expectedValue, RomanNumerals.convertToDecimal(inputNumeral));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#complexRomanNumeralTestData")
  void shouldReturnCorrectDecimalValueForComplexRomanNumeralsTestData(
      int expectedValue, String inputNumeral) {
    assertEquals(expectedValue, RomanNumerals.convertToDecimal(inputNumeral));
  }
}
