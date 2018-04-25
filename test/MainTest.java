import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void convert_1_to_I() {
        int input = 1;
        String roman = convertRomanNumerals(input);
        assertEquals("I", roman);
    }

    @Test
    public void convert_2_to_II() {
        int input = 2;
        String roman = convertRomanNumerals(input);
        assertEquals("II", roman);
    }

    @Test
    public void convert_3_to_III() {
        int input = 3;
        String roman = convertRomanNumerals(input);
        assertEquals("III", roman);
    }

    @Test
    public void convert_5_to_V() {
        int input = 5;
        String roman = convertRomanNumerals(input);
        assertEquals("V", roman);
    }

    @Test
    public void convert_10_to_X() {
        int input = 10;
        String roman = convertRomanNumerals(input);
        assertEquals("X", roman);
    }

    @Test
    public void convert_20_to_XX() {
        int input = 20;
        String roman = convertRomanNumerals(input);
        assertEquals("XX", roman);
    }

    @Test
    public void convert_11_to_XI() {
        int input = 11;
        String roman = convertRomanNumerals(input);
        assertEquals("XI", roman);
    }

    @Test
    public void convert_6_to_VI() {
        int input = 6;
        String roman = convertRomanNumerals(input);
        assertEquals("VI", roman);
    }

    @Test
    public void convert_16_to_XVI() {
        int input = 16;
        String roman = convertRomanNumerals(input);
        assertEquals("XVI", roman);
    }

    @Test
    public void convert_50_to_L() {
        int input = 50;
        String roman = convertRomanNumerals(input);
        assertEquals("L", roman);
    }

    @Test
    public void convert_100_to_C() {
        int input = 100;
        String roman = convertRomanNumerals(input);
        assertEquals("C", roman);
    }

    @Test
    public void convert_500_to_D() {
        int input = 500;
        String roman = convertRomanNumerals(input);
        assertEquals("D", roman);
    }

    @Test
    public void convert_1000_to_M() {
        int input = 1000;
        String roman = convertRomanNumerals(input);
        assertEquals("M", roman);
    }

    @Test
    public void convert_4_to_IV() {
        int input = 4;
        String roman = convertRomanNumerals(input);
        assertEquals("IV", roman);
    }

    @Test
    public void convert_9_to_IX() {
        int input = 9;
        String roman = convertRomanNumerals(input);
        assertEquals("IX", roman);
    }

    @Test
    public void convert_40_to_XL() {
        int input = 40;
        String roman = convertRomanNumerals(input);
        assertEquals("XL", roman);
    }

    @Test
    public void convert_90_to_XC() {
        int input = 90;
        String roman = convertRomanNumerals(input);
        assertEquals("XC", roman);
    }

    @Test
    public void convert_I_to_1() {
        String input = "I";
        int arabic = convertArabicNumerals(input);
        assertEquals(1, arabic);
    }

    @Test
    public void convert_V_to_5() {
        String input = "V";
        int arabic = convertArabicNumerals(input);
        assertEquals(5, arabic);
    }

    @Test
    public void convert_X_to_10() {
        String input = "X";
        int arabic = convertArabicNumerals(input);
        assertEquals(10, arabic);
    }

    @Test
    public void convert_II_to_2() {
        String input = "II";
        int arabic = convertArabicNumerals(input);
        assertEquals(2, arabic);
    }

    @Test
    public void convert_III_to_3() {
        String input = "III";
        int arabic = convertArabicNumerals(input);
        assertEquals(3, arabic);
    }

    @Test
    public void convert_XX_to_20() {
        String input = "XX";
        int arabic = convertArabicNumerals(input);
        assertEquals(20, arabic);
    }

    @Test
    public void convert_L_to_50() {
        String input = "L";
        int arabic = convertArabicNumerals(input);
        assertEquals(50, arabic);
    }


    private int convertArabicNumerals(String input) {
        int result = 0;


        for (int i=0;i<input.length();i++) {
            result += getToAdd(input, i);
        }


        return result;

    }

    private int getToAdd(String input, int i) {
        int toAdd = 0;
        for (RomanNumeral romanNumeral : RomanNumeral.values()) {
            if (("" + input.charAt(i)).equals(romanNumeral.name())) {
                toAdd = romanNumeral.getArabicValue();
            }
        }
        return toAdd;
    }





    private String convertRomanNumerals(int zahl) {


        String result = "";


        for (RomanNumeral romanNumeral : RomanNumeral.values()) {
            int wieOft = zahl / romanNumeral.getArabicValue();
            zahl %= romanNumeral.getArabicValue();
            result += composeRoman(wieOft, romanNumeral.name());

        }


        return result;


    }

    private String composeRoman(int limit, String romanLetter) {
        String toAdd = "";
        for (int i = 0; i < limit; i++) {
            toAdd += romanLetter;
        }
        return toAdd;
    }

    private enum RomanNumeral {
        M(1000),
        D(500),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);


        private final int arabicValue;

        RomanNumeral(int arabicValue) {

            this.arabicValue = arabicValue;
        }

        public int getArabicValue() {
            return arabicValue;
        }
    }

}