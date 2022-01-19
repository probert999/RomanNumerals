package com.probert999.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;


public class RomanNumeralsTest {

  @Test
  public void shouldReturnRomanNumeralIForDecimalOne() {
    assertEquals("I", RomanNumerals.convertToNumeral(1));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#singleRomanNumeralTestData")
  void shouldReturnCorrectDecimalValueForSingleNumeralsTestData(
          int inputValue, String expectedNumeral) {
    assertEquals(expectedNumeral, RomanNumerals.convertToNumeral(inputValue));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#simpleRomanNumeralTestData")
  void shouldReturnCorrectDecimalValueForSimpleNumeralsTestData(
          int inputValue, String expectedNumeral) {
    assertEquals(expectedNumeral, RomanNumerals.convertToNumeral(inputValue));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#otherPredefinedRomanNumeralTestData")
  void shouldReturnCorrectDecimalValueForOtherPreDefinedRomanNumeralsTestData(
          int inputValue, String expectedNumeral) {
    assertEquals(expectedNumeral, RomanNumerals.convertToNumeral(inputValue));
  }

  @ParameterizedTest
  @MethodSource("com.probert999.romannumerals.RomanNumeralTestData#complexRomanNumeralTestData")
  void shouldReturnCorrectDecimalValueForComplexRomanNumeralTestData(int inputValue, String expectedNumeral) {
    assertEquals(expectedNumeral, RomanNumerals.convertToNumeral(inputValue));
  }

}
