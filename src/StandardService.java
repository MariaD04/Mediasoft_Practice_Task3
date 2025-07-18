class StandardService<T extends Room> implements RoomService<T> {
    @Override
    public void clean(T room) {
        System.out.println("Номер  " + room.getRoomNumber() + " убран!");
    }

    @Override
    public void reserve(T room) {
        if (room.isReserved()) {
            throw new RoomReservedException("Номер " + room.getRoomNumber() + " уже зарезервирован!");
        }
        room.setReserved(true);
        System.out.println("Номер " + room.getRoomNumber() + " успешно зарезервирован!");
    }

    @Override
    public void free(T room) {
        room.setReserved(false);
        System.out.println("Номер " + room.getRoomNumber() + " теперь свободен!");
    }
}
