package java06.java0602;

class Hotel {
  private class Room {
    int number;
    String client;

    public Room(int number, String client) {
      this.number = number;
      this.client = client;
    }
  }
  private Room[] rooms = new Room[10];

  public void add(int number, String client) {
    if (number > 0 && number < 11) {
      rooms[number] = new Room(number, client);
    }
  }

  public void show() {
    for (Room room : rooms) {
      if (room != null) {
        System.out.println(room.number + "번 방을 " + room.client + "가 예약했습니다.");
      }
    }
  }
}

public class HotelTest {
  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    hotel.add(5, "호돌이");
    hotel.add(7, "길동이");
    hotel.show();
  }
}
