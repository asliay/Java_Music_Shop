package stock;

public class SheetMusic extends stockItem {

    private String genre;

    public SheetMusic(String type, double costPrice, double salePrice, String genre) {
        super(type, costPrice, salePrice);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }
}
