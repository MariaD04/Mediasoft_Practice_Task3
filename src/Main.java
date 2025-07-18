//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EconomyRoom economyRoom = new EconomyRoom(105);
        RoomService<EconomyRoom> economyService = new StandardService<>();
        System.out.println("\nEconomyRoom");
        economyService.clean(economyRoom);
        economyService.reserve(economyRoom);
        try {
            economyService.reserve(economyRoom);
        } catch (RoomReservedException ex) {
            System.out.println("Исключение: " + ex.getMessage());
        }
        economyService.free(economyRoom);

        StandardRoom standardRoom = new StandardRoom(109);
        RoomService<StandardRoom> standardService = new StandardService<>();
        System.out.println("\nStandardRoom");
        standardService.clean(standardRoom);
        standardService.reserve(standardRoom);
        standardService.free(standardRoom);

        LuxRoom luxRoom = new LuxRoom(205);
        RoomService<LuxRoom> luxRoomBasicService = new StandardService<>();
        LuxRoomService<LuxRoom> luxRoomPremiumService = new PremiumService<>();
        System.out.println("\nLuxRoom");
        luxRoomBasicService.clean(luxRoom);
        luxRoomPremiumService.reserve(luxRoom);
        luxRoomPremiumService.foodDelivery(luxRoom);
        luxRoomPremiumService.free(luxRoom);

        UltraLuxRoom ultraLuxRoom = new UltraLuxRoom(305);
        LuxRoomService<UltraLuxRoom> ultraLuxService = new PremiumService<>();
        System.out.println("\nUltraLuxRoom");
        ultraLuxService.clean(ultraLuxRoom);
        ultraLuxService.reserve(ultraLuxRoom);
        ultraLuxService.foodDelivery(ultraLuxRoom);
        ultraLuxService.free(ultraLuxRoom);

    }
}