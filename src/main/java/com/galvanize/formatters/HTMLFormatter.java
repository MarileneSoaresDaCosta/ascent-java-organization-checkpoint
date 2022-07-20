package com.galvanize.formatters;

import com.galvanize.Booking;

public class HTMLFormatter implements Formatter{
    @Override
    public String format(Booking booking) {
        String result = String.format("<dl>\n" +
                        "  <dt>Type</dt><dd>%1$s</dd>\n" +
                        "  <dt>Room Number</dt><dd>%2$s</dd>\n" +
                        "  <dt>Start Time</dt><dd>%3$s</dd>\n" +
                        "  <dt>End Time</dt><dd>%4$s</dd>\n" +
                        "</dl>", booking.getRoomType(), booking.getRoomNumber(), booking.getStartTime(), booking.getEndTime());
        return result;
    }
}
