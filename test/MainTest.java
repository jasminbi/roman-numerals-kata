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

    private String convertRomanNumerals(int input) {

        String result = "";

        if (input == 5) {
            result = "V";

        } else if (input % 10 == 0) {
            String romanX = "X";
            for (int i = 0; i < input; i += 10) {
                result += romanX;
            }

        } else {
            String romanI = "I";
            for (int i = 0; i < input; i++) {
                result += romanI;
            }
        }

        return result;


    }

}