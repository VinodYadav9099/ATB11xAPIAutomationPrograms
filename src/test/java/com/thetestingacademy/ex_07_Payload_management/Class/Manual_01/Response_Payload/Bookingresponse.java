package com.thetestingacademy.ex_07_Payload_management.Class.Manual_01.Response_Payload;

import com.thetestingacademy.ex_07_Payload_management.Class.Manual_01.Request_Payload.Booking;

public class Bookingresponse {

    private Integer bookingId;
    private Booking booking;

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
