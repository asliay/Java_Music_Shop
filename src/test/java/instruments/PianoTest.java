package instruments;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Black", 800, 1000);
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(800, piano.getCostPrice());
    }

    @Test
    public void hasSalePrice() {
        assertEquals(1000, piano.getSalePrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink Plonk", piano.play());
    }
}