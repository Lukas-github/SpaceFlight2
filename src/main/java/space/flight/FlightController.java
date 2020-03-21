package space.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;



@RestController
public class FlightController {
    private TouristRepository touristRepository;
    private FlightRepository flightRepository;

    @Autowired
    public FlightController(TouristRepository touristRepository, FlightRepository flightRepository) {
        this.touristRepository = touristRepository;
        this.flightRepository = flightRepository;
    }

    @GetMapping("/tourists")
    public List<Tourist> getTourists()

    {
        return touristRepository.findAll();
    }


    @PostMapping("/tourists")
    public ResponseEntity<?> addTourists(@RequestBody TouristCreator creator) {
        String name = creator.getName();
        String flightName = creator.getFlight();
        String surname = creator.getSurname();
        String sex = creator.getSex();
        String country = creator.getCountry();
        String note = creator.getNotes();
        LocalDate dateOfBirth = creator.getDateOfBirth();

        Optional<Flight> flight2 = flightRepository.findFlightByName(flightName);
        if (flight2.isPresent()) {
            Tourist tourist = new Tourist(name, flight2.get(),  surname, sex, country, note, dateOfBirth);
            touristRepository.save(tourist);

            return ResponseEntity.ok(tourist);
        } else {
            throw new DataNotFoundException();

        }




        return ResponseEntity.ok(tourist);


    }
}
