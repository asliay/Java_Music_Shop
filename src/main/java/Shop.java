import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addToStock(ISell stockItem) {
        this.stock.add(stockItem);
    }

    public void removeAllStock() {
        this.stock.clear();
    }
}
