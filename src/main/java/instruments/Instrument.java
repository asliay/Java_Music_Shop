package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String colour;
    private double costPrice;
    private double salePrice;

    public Instrument(String colour, double costPrice, double salePrice) {
        this.colour = colour;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getColour() {
        return this.colour;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public double calculateMarkup() {
        return (this.salePrice - this.costPrice);
    }
}
