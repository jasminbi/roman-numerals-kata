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
        assertEquals("IV",roman);
    }

    @Test
    public void convert_9_to_IX() {
        int input = 9;
        String roman = convertRomanNumerals(input);
        assertEquals("IX",roman);
    }

    @Test
    public void convert_40_to_XL() {
        int input = 40;
        String roman = convertRomanNumerals(input);
        assertEquals("XL",roman);
    }

    @Test
    public void convert_90_to_XC() {
        int input = 90;
        String roman = convertRomanNumerals(input);
        assertEquals("XC",roman);
    }


    private String convertRomanNumerals(int zahl) {


        String result = "";


        for (RomanNumeral entry : RomanNumeral.values()) {
            int wieOft = zahl / entry.getArabicValue();
            zahl %= entry.getArabicValue();
            result += composeRoman(wieOft, entry.name());

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