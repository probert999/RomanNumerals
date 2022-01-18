package com.probert999.romannumerals;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class RomanNumeralTestData {

  public static Stream<Arguments> singleRomanNumeralTestData() {
    return Stream.of(
        Arguments.of(5, "V"),
        Arguments.of(10, "X"),
        Arguments.of(50, "L"),
        Arguments.of(100, "C"),
        Arguments.of(500, "D"),
        Arguments.of(1000, "M"));
  }

  public static Stream<Arguments> otherPredefinedRomanNumeralTestData() {
    return Stream.of(
        Arguments.of(4, "IV"),
        Arguments.of(9, "IX"),
        Arguments.of(40, "XL"),
        Arguments.of(90, "XC"),
        Arguments.of(400, "CD"),
        Arguments.of(900, "CM"));
  }

  public static Stream<Arguments> otherRomanNumeralTestData() {
    return Stream.of(
        Arguments.of(99, "XCIX"),
        Arguments.of(999, "CMXCIX"),
        Arguments.of(2022, "MMXXII"),
        Arguments.of(3000, "MMM"),
        Arguments.of(1234, "MCCXXXIV"),
        Arguments.of(1971, "MCMLXXI"));
  }
}
