import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void convert_1_to_I() {
        int input = 1;
        String roman = convertRomanNumerals(input);
        assertEquals("I", roman);
    }

    private String convertRomanNumerals(int input) {
        return null;
    }

}