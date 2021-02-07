package instruments;

public class Piano extends Instrument{

    private NumPianoKeys numKeys;
    private String brand;

    public Piano(String colour, int costPrice, int salePrice, NumPianoKeys numKeys, String brand) {
        super(colour, costPrice, salePrice);
        this.numKeys = numKeys;
        this.brand = brand;
    }

    public NumPianoKeys getNumKeys() {
        return this.numKeys;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public String play() {
        return "Plink Plonk";
    }
}
