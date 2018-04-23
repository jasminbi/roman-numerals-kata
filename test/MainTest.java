import org.junit.Ignore;
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

    private String convertRomanNumerals(int input) {

        String result = "";

        if (input >= 10) {
            int wieOft10 = input / 10;
            result += composeRoman(wieOft10, "X", 1);
            int wieOft1 = input % 10;
            result += composeRoman(wieOft1, "I", 1);
        } else if (input % 5 == 0) {
            result += composeRoman(input, "V", 5);
        } else {
            result += composeRoman(input, "I", 1);
        }

        return result;


    }

    private String composeRoman(int limit, String romanLetter, int divisor) {
        String toAdd = "";
        for (int i = 0; i < limit; i += divisor) {
            toAdd += romanLetter;
        }
        return toAdd;
    }

}