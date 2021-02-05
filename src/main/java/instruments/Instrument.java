package instruments;

import behaviours.IPlay;

public class Instrument implements IPlay {

    private String colour;
    private int costPrice;
    private int salePrice;

    public Instrument(String colour, int costPrice, int salePrice) {
        this.colour = colour;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    @Override
    public String play() {
        return null;
    }
}
