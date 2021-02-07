package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Red", 400, 600, 6, GuitarType.ACOUSTIC);
    }

    @Test
    public void hasColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(400, guitar.getCostPrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(600, guitar.getSalePrice(), 0.0);
    }

    @Test
    public void hasNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strrrrummmmmmm", guitar.play());
    }
}
