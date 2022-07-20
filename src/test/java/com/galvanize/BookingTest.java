package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookingTest {
    // creates a new booking
    // receives a string and break it into 4 parts in array
    @Test
    public void createsNewBookingAndReturnsRoomNumber(){
        String code = "a111-08:30am-11:00am";
        assertEquals("111", Booking.parse(code).getRoomNumber() );
    }




}
