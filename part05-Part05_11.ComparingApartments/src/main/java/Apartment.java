
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int compPrice = compared.princePerSquare * compared.squares;
        
        int diff = 0;
        diff = price - compPrice;
        return Math.abs(diff);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int compPrice = compared.princePerSquare * compared.squares;

        if (price > compPrice) {
            return true;
        } else {
            return false;
        }

        /*if (this.princePerSquare < compared.princePerSquare) {
            return true;
        } else {
            return false;
        } */
    }
}
