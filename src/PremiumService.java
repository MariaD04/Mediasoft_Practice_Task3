class PremiumService<T extends LuxRoom> implements LuxRoomService<T> {
    @Override
    public void clean(T room) {
        System.out.println("Номер класса \"Люкс\" " + room.getRoomNumber() + " убран!");
    }

    @Override
    public void reserve(T room) {
        if (room.isReserved()) {
            throw new RoomReservedException("Номер класса \"Люкс\" " + room.getRoomNumber() + " уже зарезервирован!");
        }
        room.setReserved(true);
        System.out.println("Номер класса \"Люкс\" " + room.getRoomNumber() + " успешно зарезервирован!");
    }

    @Override
    public void free(T room) {
        room.setReserved(false);
        System.out.println("Номер класса \"Люкс\" " + room.getRoomNumber() + " теперь свободен!");
    }

    @Override
    public void foodDelivery(T room) {
        System.out.println("Еда доставлена в номер класса \"Люкс\" "  + room.getRoomNumber());
    }
}
