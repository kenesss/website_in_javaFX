package com.example.softfinalproject;

import javafx.scene.control.Alert;
import java.time.LocalDateTime;
public class TableBookingCommand {
    private TableBooking tableBooking;
    public TableBookingCommand(TableBooking tableBooking) {
        this.tableBooking = tableBooking;
    }
    public void bookTable(String tableName, LocalDateTime dateTime) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        if (dateTime.isBefore(currentDateTime)) {
            showErrorAlert("Cannot book a table for a past date and time!");
            return;
        }
        if (tableBooking.isTableAvailable(tableName, dateTime)) {
            tableBooking.bookTable(tableName, dateTime);
            showConfirmationAlert("Table booked successfully!");
        } else {
            showErrorAlert("Table is not available at the specified time!");        }
    }
    private void showConfirmationAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void showErrorAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}