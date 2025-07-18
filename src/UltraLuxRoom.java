class UltraLuxRoom extends LuxRoom {
    public UltraLuxRoom(int roomNumber) {
        super(roomNumber);
        this.pricePerNight = Prices.ULTRALUX.getPrice();
    }
}
