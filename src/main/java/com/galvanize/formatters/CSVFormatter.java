package com.galvanize.formatters;

import com.galvanize.Booking;

public class CSVFormatter implements Formatter{
    @Override
    public String format(Booking booking) {
        String result = String.format("type,room number,start time,end time\n" +
                "%1$s,%2$s,%3$s,%4$s", booking.getRoomType(), booking.getRoomNumber(), booking.getStartTime(), booking.getEndTime());
        return result;
    }
}
