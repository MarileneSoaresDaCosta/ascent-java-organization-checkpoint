package com.galvanize;

import com.galvanize.formatters.HTMLFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HTMLFormatterTest {
    @Test
    public void returnHTMLFormat(){
        HTMLFormatter formatter = new HTMLFormatter();
        String expected =  "<dl>\n" +
                "  <dt>Type</dt><dd>Conference Room</dd>\n" +
                "  <dt>Room Number</dt><dd>111</dd>\n" +
                "  <dt>Start Time</dt><dd>08:30am</dd>\n" +
                "  <dt>End Time</dt><dd>11:00am</dd>\n" +
                "</dl>";
        String actual = formatter.format(Booking.parse("r111-08:30am-11:00am"));
        assertEquals(expected, actual);
    }
}
