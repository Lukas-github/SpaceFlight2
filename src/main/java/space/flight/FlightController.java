package space.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class FlightController {
    private TouristRepository touristRepository;
    private FlightRepository flightRepository;

    @Autowired
    public FlightController (TouristRepository touristRepository, FlightRepository flightRepository){
        this.touristRepository = touristRepository;
        this.flightRepository = flightRepository;
    }

}
