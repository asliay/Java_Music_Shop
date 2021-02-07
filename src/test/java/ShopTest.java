import behaviours.ISell;
import instruments.Guitar;
import instruments.GuitarType;
import instruments.NumPianoKeys;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ISell guitar;
    private ISell piano;


    @Before
    public void setUp() {
        guitar = new Guitar("Red", 400, 600, 6, GuitarType.ACOUSTIC);
        piano = new Piano("Black", 800, 1100, NumPianoKeys.EIGHTYEIGHT, "Yamaha");
        shop = new Shop("Ray's Music Exchange", 1000);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canChangeName() {
        shop.setName("Music Shop");
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(1000, shop.getTill(), 0.0);
    }

    @Test
    public void canChangeTill() {
        shop.setTill(2000);
        assertEquals(2000, shop.getTill(), 0.0);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.addToStock(guitar);
        assertEquals(guitar, shop.removeFromStock(guitar));
    }

    @Test
    public void canRemoveAllStock() {
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.removeAllStock();
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateTotalProfit() {
        shop.addToStock(guitar);
        shop.addToStock(piano);
        assertEquals(500, shop.calculateTotalProfit(), 0.0);
    }
}
