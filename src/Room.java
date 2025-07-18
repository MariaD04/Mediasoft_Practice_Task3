import java.util.Random;

abstract class Room {

    protected int roomNumber;
    protected int maxPeople;
    protected int pricePerNight;
    protected boolean isReserved;

    public Room(int roomNumber, Prices priceNight) {
        this.roomNumber = roomNumber;
        this.maxPeople = new Random().nextInt(4) + 1;
        this.pricePerNight = priceNight.getPrice();
        this.isReserved = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}

