package Models;

import java.util.Date;

/**
 * Модель билета
 */
public class Ticket {

    /*
     * Added by OV
     */
    private int id;
    private int routeNumber;
    private int place;
    private int price;
    private Date date;
    private boolean isValid;
    private int zoneStart;
    private int zoneStop;

    public Ticket(int id, int routeNumber, int place, int price, Date date, boolean isValid, int zoneStart,
            int zoneStop) {
        this.id = id; /* Added by OV */
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
        this.zoneStart = zoneStart; /* Added by OV */
        this.zoneStop = zoneStop; /* Added by OV */
    }

    @Override
    public String toString() {
        return "Ticket" +
                " Ticket id " + id + /* Added by OV */
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                ", Start zone " + zoneStart + /* Added by OV */
                ", Stop zone " + zoneStop + /* Added by OV */
                ", " + (isValid ? "Free" : "Busy");
    }

    public String toPrint() {
        return "Ticket" +
                "\nTicket id " + id + /* Added by OV */
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date +
                "\nStart zone " + zoneStart + /* Added by OV */
                "\nStop zone " + zoneStop; /* Added by OV */
    }

    @Override
    public int hashCode() {
        return date.hashCode() ^ (routeNumber + place + price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }

    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getId() == this.id
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDate() == this.date
                && ticket.getZoneStart() == this.zoneStart
                && ticket.getZoneStop() == this.zoneStop
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }

    /*
     * Added by OV
     */
    public int getId() {
        return id;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public int getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public int getZoneStart() {
        return zoneStart;
    }

    public void setZoneStart(int zoneStart) {
        this.zoneStart = zoneStart;
    }

    public int getZoneStop() {
        return zoneStop;
    }

    public void setZoneStop(int zoneStop) {
        this.zoneStop = zoneStop;
    }

    /*
     * Added by OV
     */
}
