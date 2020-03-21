package space.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
public class FlightController {
    private TouristRepository touristRepository;
    private FlightRepository flightRepository;

    @Autowired
    public FlightController (TouristRepository touristRepository, FlightRepository flightRepository){
        this.touristRepository = touristRepository;
        this.flightRepository = flightRepository;
    }

   @GetMapping("/tourists")
   public List<Tourist> getTourists{
        return touristRepository.findAll();
    }






@PostMapping("/tourists")
    public ResponseEntity<?> addTourists (@RequestBody TouristCreator creator){
        String name = creator.getName();
        String surname = creator.getSurname();
        String sex = creator.getSex();
        String country = creator.getCountry();
        String note = creator.getNotes();
        LocalDate dateOfBirth = creator.getDateOfBirth();
    Tourist tourist = new Tourist(name, surname, sex, country, note, dateOfBirth);
    touristRepository.save(tourist);

    return ResponseEntity.ok(tourist);


}
}
