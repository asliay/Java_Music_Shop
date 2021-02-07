import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public Shop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell stockItem) {
        this.stock.add(stockItem);
    }

    public ISell removeFromStock(ISell stockItem) {
        return this.stock.remove(this.stock.indexOf(stockItem));
    }

    public void removeAllStock() {
        this.stock.clear();
    }

    public double calculateTotalProfit() {
        double totalProfit = 0;
        for (ISell stockItem : stock) {
            totalProfit += stockItem.calculateMarkup();
        }
        return totalProfit;
    }
}
