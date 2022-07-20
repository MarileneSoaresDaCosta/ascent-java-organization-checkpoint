package com.galvanize;

public class Booking {
    public static enum RoomType {
        R, S, A, C
    }

    //    fields
    private RoomType roomType;
    private String roomNumber;
    private String startTime;
    private String endTime;


    // static method parse(String): instance of Booking obj
    public static Booking parse(String bookingCode ){
        // split the string and save to fields
        // get room and roomN
        String roomLetter = String.valueOf(bookingCode.charAt(0));
        RoomType roomType = null;
        switch (roomLetter) {
            case "r":
                roomType = RoomType.R;
                break;
            case "s":
                roomType = RoomType.S;
                break;
            case "a":
                roomType = RoomType.A;
                break;
            case "c":
                roomType = RoomType.C;
                break;
        }

        String[] parts = bookingCode.split("-"); // rt & rN, start, end
        String roomNumber = parts[0].substring(1); // "100"
        String startTime = parts[1];
        String endTime = parts[2];

        // creates new booking obj
        Booking newBooking = new Booking(roomType, roomNumber, startTime, endTime);
        return newBooking;
    }

    // a constructor that takes four arguments:
    public Booking(RoomType roomType, String roomNumber, String startTime, String endTime) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.startTime = startTime;
        this.endTime = endTime;
    }
  // return room  type as string  == ready to format
   public String getRoomType(){
        String roomTypeName = "";
        switch (this.roomType) {
            case R:
                roomTypeName = "Conference Room";
                break;
            case S:
                roomTypeName = "Suite";
                break;
            case A:
                roomTypeName = "Auditorium";
                break;
            case C:
                roomTypeName = "Classroom";
                break;
        }
        return roomTypeName;
   }

    public String getRoomNumber(){
        return this.roomNumber;
    }

    public String getStartTime(){
        return this.startTime;
    }

    public String getEndTime(){
        return this.endTime;
    }
}
