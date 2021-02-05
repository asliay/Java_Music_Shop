package instruments;

public class Guitar extends Instrument {

    private int numOfStrings;
    private GuitarType guitarType;

    public Guitar(String colour, int costPrice, int salePrice, int numOfStrings, GuitarType guitarType) {
        super(colour, costPrice, salePrice);
        this.numOfStrings = numOfStrings;
        this.guitarType = guitarType;

    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }

    public GuitarType getGuitarType() {
        return this.guitarType;
    }

    @Override
    public String play() {
        return "Strrrrummmmmmm";
    }
}
