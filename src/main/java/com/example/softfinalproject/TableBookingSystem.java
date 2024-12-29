package com.example.softfinalproject;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TableBookingSystem implements TableBooking {
    private Map<String, LocalDateTime> bookedTables = new HashMap<>();

    @Override
    public void bookTable(String tableName, LocalDateTime dateTime) {
        bookedTables.put(tableName, dateTime);
        System.out.println("Table " + tableName + " booked at " + dateTime);
    }

    @Override
    public boolean isTableAvailable(String tableName, LocalDateTime dateTime) {
        return !bookedTables.containsKey(tableName) || bookedTables.get(tableName).isBefore(dateTime);
    }
}