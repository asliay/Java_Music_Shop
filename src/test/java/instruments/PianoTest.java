package instruments;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Black", 800, 1000, NumPianoKeys.SEVENTYTWO, "Yamaha");
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(800, piano.getCostPrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(1000, piano.getSalePrice(), 0.0);
    }

    @Test
    public void hasNumKeys() {
        NumPianoKeys numKeysEnum = piano.getNumKeys();
        assertEquals(72, numKeysEnum.getValue());
    }

    @Test
    public void hasBrand() {
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink Plonk", piano.play());
    }
}