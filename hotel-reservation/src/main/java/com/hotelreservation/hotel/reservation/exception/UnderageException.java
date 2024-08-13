package com.hotelreservation.hotel.reservation.exception;

public class UnderageException extends RuntimeException {
    public UnderageException(String message) {
        super(message);
    }
}