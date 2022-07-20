package com.galvanize;

import com.galvanize.formatters.CSVFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVFormatterTest {
    // test if formatter returns proper string
    @Test
    public void returnsCSVFormattedString(){
        CSVFormatter formatter = new CSVFormatter();
        String expected = "type,room number,start time,end time\n" +
                "Auditorium,111,08:30am,11:00am";
        String actual = formatter.format(Booking.parse("a111-08:30am-11:00am"));
        assertEquals(expected, actual);
    }
}
