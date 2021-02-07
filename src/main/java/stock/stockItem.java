package stock;

import behaviours.ISell;

public abstract class stockItem implements ISell {

    private String type;
    private double costPrice;
    private double salePrice;

    public stockItem(String type, double costPrice, double salePrice) {
        this.type = type;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getType() {
        return this.type;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double calculateMarkup() {
        return (this.salePrice - this.costPrice);
    }
}
