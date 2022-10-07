package org.example.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.example.Constants.BookingStatus;

import java.util.List;


@Getter
public class Booking {

    private final String id;
    private final Show show;
    private final List<Seat> seatsBooked;
    private final String user;
    private BookingStatus bookingStatus;

    public Booking(@NonNull String id,@NonNull  Show show,@NonNull  List<Seat> seatsBooked,@NonNull String user) {
        this.id = id;
        this.show = show;
        this.seatsBooked = seatsBooked;
        this.user = user;
        this.bookingStatus = BookingStatus.Created;
    }

    public Boolean isConfirmed(){
        return this.bookingStatus == BookingStatus.Confirmed;
    }

    public void confirmBooking(){
        if(this.bookingStatus != BookingStatus.Confirmed)
            throw new RuntimeException("Invalid State Exception");
        this.bookingStatus = BookingStatus.Confirmed;
    }

    public void expireBooking(){
        if(this.bookingStatus !=BookingStatus.Created)
            throw new RuntimeException("Invalid state exception");
        this.bookingStatus = BookingStatus.Expired;
    }


}
