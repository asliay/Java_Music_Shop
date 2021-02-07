package stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("Sheet Music", 6.99, 12.99, "Classical");
    }

    @Test
    public void hasType() {
        assertEquals("Sheet Music", sheetMusic.getType());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(6.99, sheetMusic.getCostPrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(12.99, sheetMusic.getSalePrice(), 0.0);
    }

    @Test
    public void canChangeSalePrice() {
        sheetMusic.setSalePrice(20.00);
        assertEquals(20.00, sheetMusic.getSalePrice(), 0.0);
    }
}
