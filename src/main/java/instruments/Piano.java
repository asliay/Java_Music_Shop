package instruments;

public class Piano extends Instrument{

    public Piano(String colour, int costPrice, int salePrice) {
        super(colour, costPrice, salePrice);
    }

    @Override
    public String play() {
        return "Plink Plonk";
    }
}
