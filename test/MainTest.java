import org.junit.Test;

import java.util.*;
import java.util.Map.Entry;

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


    private String convertRomanNumerals(int zahl) {

        Map<Integer, String> romanLetters = new HashMap<>();
        romanLetters.put(1, "I");
        romanLetters.put(5, "V");
        romanLetters.put(10, "X");
        romanLetters.put(50, "L");
        romanLetters.put(100, "C");
        romanLetters.put(500, "D");
        romanLetters.put(1000, "M");


        String result = "";
        Comparator<Entry<Integer, String>> comparing = Comparator.<Entry<Integer, String>, Integer>comparing(Entry::getKey).reversed();
        List<Entry<Integer, String>> sortedRomanNumerals = romanLetters.entrySet().stream()
                .sorted(comparing)
                .collect(toList());


        for (Entry<Integer, String> entry : sortedRomanNumerals
                ) {
            int wieOft = zahl / entry.getKey();
            zahl %= entry.getKey();
            result += composeRoman(wieOft, entry.getValue());

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

}