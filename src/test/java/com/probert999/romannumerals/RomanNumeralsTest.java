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
    assertEquals("I", RomanNumerals.convert(1));
  }

  @ParameterizedTest
  @EnumSource(
      value = RomanNumeralsEnum.class,
      mode = EXCLUDE,
      names = {"IV", "IX", "XL", "XC", "CD", "CM"})
  void shouldReturnSingleRomanNumerals(RomanNumeralsEnum numeral) {
    assertEquals(numeral.getNumeral(), RomanNumerals.convert(numeral.getDecimal()));
  }

  @ParameterizedTest
  @EnumSource(
      value = RomanNumeralsEnum.class,
      mode = EXCLUDE,
      names = {"I", "V", "X", "L", "C", "D", "M"})
  void shouldReturnOtherPreDefinedRomanNumerals(RomanNumeralsEnum numeral) {
    assertEquals(numeral.getNumeral(), RomanNumerals.convert(numeral.getDecimal()));
  }

  @ParameterizedTest
  @MethodSource("romanNumeralTestData")
  void shouldReturnCorrectNumeralDefinedInTestData(int inputValue, String expectedNumeral) {
    assertEquals(expectedNumeral, RomanNumerals.convert(inputValue));
  }

  private static Stream<Arguments> romanNumeralTestData() {
    return Stream.of(
        Arguments.of(99, "XCIX"),
        Arguments.of(999, "CMXCIX"),
        Arguments.of(2022, "MMXXII"),
        Arguments.of(3000, "MMM"),
        Arguments.of(1234, "MCCXXXIV"),
        Arguments.of(1971, "MCMLXXI"));
  }
}
