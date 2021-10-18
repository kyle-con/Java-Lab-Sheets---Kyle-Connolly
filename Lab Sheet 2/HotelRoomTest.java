public class HotelRoomTest
{
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
        roomA.setOccupied(1);
        roomB.setOccupied(0);

        System.out.println("room number is " + roomA.getRoomNumber() + ",type is "+roomA.getRoomType()+ " and the rate is "+roomA.getRate()+" is occupied?: "+roomA.getOccupied());
        System.out.println("room number is " + roomB.getRoomNumber() + ",type is "+roomB.getRoomType()+ " and the rate is "+roomB.getRate()+" is occupied?: "+roomB.getOccupied());


    }

    public void construct(int roomNumber, String roomType, int occupied, double rate)
    {
        roomNumber = 202;
        roomType = "Single";
        occupied = 0;
        rate = 90;
    }


}