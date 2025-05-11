////////////////////////////////////////////////////////////////////
// NOME1 COGNOME1 MATRICOLA1 
// NOME2 COGNOME2 MATRICOLA2 
////////////////////////////////////////////////////////////////////
package test1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void testConvert() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("I", IntegerToRoman.convert(1));
    }
}