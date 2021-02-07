package instruments;

public enum NumPianoKeys {
    SIXTYSIX(66),
    SEVENTYTWO(72),
    EIGHTYEIGHT(88);

    private final int value;


    NumPianoKeys(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
