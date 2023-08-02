package Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    /*
     * Added by OV
     */
    private int id;
    private int[] zones;
    private long cardNumber;

    public Carrier(int id, int[] zones, long cardNumber) {
        this.id = id;
        this.zones = zones; /* Added by OV */
        this.cardNumber = cardNumber;
    }

    /*
     * Added by OV
     */
    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

}
