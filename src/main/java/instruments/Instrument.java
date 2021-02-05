package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String colour;
    private int costPrice;
    private int salePrice;

    public Instrument(String colour, int costPrice, int salePrice) {
        this.colour = colour;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getColour() {
        return this.colour;
    }

    public int getCostPrice() {
        return this.costPrice;
    }

    public int getSalePrice() {
        return this.salePrice;
    }
}
