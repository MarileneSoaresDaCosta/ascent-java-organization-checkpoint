package com.galvanize.formatters;

import com.galvanize.Booking;

public class HTMLFormatter implements Formatter{
    @Override
    public String format(Booking booking) {
        String result = String.format("{\n" +
                "  \"type\": \"%1$s\",\n" +
                "  \"roomNumber\": %2$s,\n" +
                "  \"startTime\": \"%3$s\",\n" +
                "  \"endTime\": \"%4$s\"\n" +
                "}", booking.getRoomType(), booking.getRoomNumber(), booking.getStartTime(), booking.getEndTime());
        return result;
    }
}
