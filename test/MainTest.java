import org.junit.Test;

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


    private String convertRomanNumerals(int zahl) {

        String result = "";

        int wieOft1000 = zahl / 1000;
        zahl %= 1000;
        result += composeRoman(wieOft1000, "M");

        int wieOft500 = zahl / 500;
        zahl %= 500;
        result += composeRoman(wieOft500, "D");

        int wieOft100 = zahl / 100;
        zahl %= 100;
        result += composeRoman(wieOft100, "C");

        int wieOft50 = zahl / 50;
        zahl %= 50;
        result += composeRoman(wieOft50, "L");

        int wieOft10 = zahl / 10;
        zahl %= 10;
        result += composeRoman(wieOft10, "X");

        int wieOft5 = zahl / 5;
        zahl %= 5;
        result += composeRoman(wieOft5, "V");

        int wieOft1 = zahl / 1;
        result += composeRoman(wieOft1, "I");


        return result;


    }

    private String composeRoman(int limit, String romanLetter) {
        String toAdd = "";
        for (int i = 0; i < limit; i++) {
            toAdd += romanLetter;
        }
        return toAdd;
    }

}