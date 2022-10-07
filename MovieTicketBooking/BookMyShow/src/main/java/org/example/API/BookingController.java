package org.example.API;

import apple.laf.JRSUIConstants;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.example.Model.Seat;
import org.example.Model.Show;
import org.example.Service.BookingService;
import org.example.Service.ShowService;
import org.example.Service.TheatreService;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class BookingController {

    private final ShowService showService;
    private final BookingService bookingService;
    private final TheatreService theatreService;


    public String createBooking(@NonNull final String userId,@NonNull final String showId,
                                @NonNull final List<String> seatIds){

        final Show show = showService.getShow(showId);
        final List<Seat> seats = seatIds.stream().map(theatreService::getSeat).collect(Collectors.toList());
        return bookingService.createBooking(userId,show,seats).getId();
    }




}
