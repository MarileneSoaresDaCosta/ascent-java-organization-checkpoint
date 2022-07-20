package com.galvanize;

import com.galvanize.formatters.JSONFormatter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JSONFormatterTest {

    @Test
    public void returnJSONFormat() {
        JSONFormatter formatter = new JSONFormatter();
        String expected =  "{\n" +
                "  \"type\": \"Suite\",\n" +
                "  \"roomNumber\": 111,\n" +
                "  \"startTime\": \"08:30am\",\n" +
                "  \"endTime\": \"11:00am\"\n" +
                "}";
        String actual = formatter.format(Booking.parse("s111-08:30am-11:00am"));
        assertEquals(expected, actual);
    }


}
