package com.galvanize;

import com.galvanize.formatters.CSVFormatter;
import com.galvanize.formatters.HTMLFormatter;
import com.galvanize.formatters.JSONFormatter;

public class Application {
    // Formatter getFormatter(String bookingCode, String format)
        // if format..., instantiate obj, call appropriate method
    public static String getFormatter(String bookingCode, String format) {
        if (format.equals("json")) {
            JSONFormatter formatter = new JSONFormatter();
            return formatter.format(Booking.parse(bookingCode));
        } else if (format.equals("html")) {
            HTMLFormatter formatter = new HTMLFormatter();
            return formatter.format(Booking.parse(bookingCode));
        } else if (format.equals("csv")) {
            CSVFormatter formatter = new CSVFormatter();
            return formatter.format(Booking.parse(bookingCode));
        } else {
            return "";
        }
    }


    public static void main(String[] args) {
//        System.out.println("Application Running");
        System.out.println(getFormatter(args[0], args[1]));
    }
}