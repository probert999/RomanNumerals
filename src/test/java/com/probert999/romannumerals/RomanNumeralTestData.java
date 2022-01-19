package com.probert999.romannumerals;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class RomanNumeralTestData {

  public static Stream<Arguments> singleRomanNumeralTestData() {
    return Stream.of(
        Arguments.of(1, "I"),
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

  public static Stream<Arguments> simpleRomanNumeralTestData() {
    return Stream.of(
            Arguments.of(2, "II"),
            Arguments.of(3, "III"),
            Arguments.of(7, "VII"),
            Arguments.of(15, "XV"),
            Arguments.of(35, "XXXV"),
            Arguments.of(1066, "MLXVI"),
            Arguments.of(2022, "MMXXII"),
            Arguments.of(3000, "MMM"));
  }

  public static Stream<Arguments> complexRomanNumeralTestData() {
    return Stream.of(
        Arguments.of(18, "XVIII"),
        Arguments.of(49, "XLIX"),
        Arguments.of(99, "XCIX"),
        Arguments.of(999, "CMXCIX"),
        Arguments.of(1234, "MCCXXXIV"),
        Arguments.of(1971, "MCMLXXI"),
        Arguments.of(3999, "MMMCMXCIX"));
  }
}
