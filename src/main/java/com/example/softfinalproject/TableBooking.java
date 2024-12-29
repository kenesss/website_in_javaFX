package com.example.softfinalproject;

import java.time.LocalDateTime;

public interface TableBooking {
    void bookTable(String tableName, LocalDateTime dateTime);
    boolean isTableAvailable(String tableName, LocalDateTime dateTime);}