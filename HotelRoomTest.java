public class HotelRoomTest {
    public static void main(String[] args)
    {
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        roomA.setRoomNumber(200);
        roomA.setRate(100);
        roomB.setRoomNumber(201);
        roomB.setRate(80);
        roomA.setRoomType("Single");
        roomB.setRoomType("Double");

        System.out.println("roomA number is " + roomA.getRoomNumber());


    }
}