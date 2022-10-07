package org.example.Service;

import lombok.NonNull;
import org.example.Model.Screen;
import org.example.Model.Seat;
import org.example.Model.Theatre;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TheatreService {

    private final Map<String, Theatre> theatres;
    private final Map<String, Screen> screens;
    private final Map<String, Seat> seats;

    public TheatreService(){
        this.theatres = new HashMap<>();
        this.screens = new HashMap<>();
        this.seats = new HashMap<>();
    }
    public Theatre createTheatre(@NonNull final String theatreName){
        String theatreId = UUID.randomUUID().toString();
        Theatre theatre = new Theatre(theatreId,theatreName);
        theatres.put(theatreId,theatre);
        return theatre;
    }

    public Screen createScreenInTheatre(@NonNull final String screenName,@NonNull final Theatre theatre){
       Screen screen = createScreen(screenName,theatre);
       theatre.addScreen(screen);
       return screen;
    }

    public Screen createScreen(@NonNull final String screenName, @NonNull Theatre theatre){
        String screenId = UUID.randomUUID().toString();
        Screen screen = new Screen(screenId,screenName,theatre);
        return screen;
    }

    public Seat createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer seatNo, @NonNull final Screen screen){
        String seatId = UUID.randomUUID().toString();
        Seat seat = new Seat(seatId,rowNo,seatNo);
        screen.addSeat(seat);
        seats.put(seatId,seat);
        return seat;
    }

    public Theatre getTheatre(String theatreId) {

        if(!theatres.containsKey(theatreId))
            throw new RuntimeException("Theatre Not Found");
         return theatres.get(theatreId);
    }


    public Screen getScreen(String screenId) {

        if(!screens.containsKey(screenId))
            throw new RuntimeException("Theatre Not Found");
        return screens.get(screenId);
    }

    public Seat getSeat(String seatId) {

        if(!seats.containsKey(seatId))
            throw new RuntimeException("Theatre Not Found");
        return seats.get(seatId);
    }

}
