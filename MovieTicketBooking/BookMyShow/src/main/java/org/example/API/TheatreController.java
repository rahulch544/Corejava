package org.example.API;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.example.Model.Theatre;
import org.example.Service.TheatreService;

@AllArgsConstructor
public class TheatreController {

    final private TheatreService theatreService;

    public String createTheatre(@NonNull final String theatreName){
        return theatreService.createTheatre(theatreName).getId();
    }

    public String createScreenInTheatre(@NonNull final String screenName,@NonNull final String theatreId){
        final Theatre theatre = theatreService.getTheatre(theatreId);
        return theatreService.createScreenInTheatre(screenName,theatre).getId();
    }

    public String createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer seatNo,@NonNull final String screenId){
        return null;
    }
}
