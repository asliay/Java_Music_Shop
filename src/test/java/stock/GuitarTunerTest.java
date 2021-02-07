package stock;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTunerTest {

    private GuitarTuner tuner;

    @Before
    public void setUp() {
        tuner = new GuitarTuner("Guitar Tuner", 6.99, 14.99);
    }

    @Test
    public void hasType() {
        assertEquals("Guitar Tuner", tuner.getType());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(6.99, tuner.getCostPrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(14.99, tuner.getSalePrice(), 0.0);
    }

    @Test
    public void canChangeSalePrice() {
        tuner.setSalePrice(20.00);
        assertEquals(20.00, tuner.getSalePrice(), 0.0);
    }
}
