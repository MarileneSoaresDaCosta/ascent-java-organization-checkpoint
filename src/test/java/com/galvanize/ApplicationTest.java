package com.galvanize;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    PrintStream original;
    ByteArrayOutputStream outContent;

    // This block captures everything written to System.out
    @BeforeEach
    public void setOut() {
        original = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    // This block resets System.out to whatever it was before
    @AfterEach
    public void restoreOut() {
        System.setOut(original);
    }

    @Test
    public void shouldPrintOutHTMLFormat() {
        // Write your tests here
        // outContent.toString() will give you what your code printed to System.out
        String[] args = {"r111-08:30am-11:00am", "html"};
        Application.main(args);
        String expected = "<dl>\n" +
                "  <dt>Type</dt><dd>Conference Room</dd>\n" +
                "  <dt>Room Number</dt><dd>111</dd>\n" +
                "  <dt>Start Time</dt><dd>08:30am</dd>\n" +
                "  <dt>End Time</dt><dd>11:00am</dd>\n" +
                "</dl>\n";
        assertEquals(expected, outContent.toString());
    }

}