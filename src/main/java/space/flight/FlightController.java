package space.flight;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
// list of tourists
    @GetMapping("/tourists")
    public List<Tourist> getTourists() {
        return touristRepository.findAll();
    }

// add tourist
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
            Tourist tourist = new Tourist(name, flight2.get(), surname, sex, country, note, dateOfBirth);
            touristRepository.save(tourist);

            return ResponseEntity.ok(tourist);
        } else {
            throw new DataNotFoundException();

        }
    }
// list of flights
    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flightRepository.findAllBy();
    }

// add flight
    @PostMapping("/flights")
    public ResponseEntity<?> addFlights(@RequestBody FlightCreator creator) {
        String name = creator.getName();
        LocalDateTime timeOfDeparture = creator.getTimeOfDeparture();
        LocalDateTime timeOfArrival = creator.getTimeOfArrival();
        int numberOfSeats = creator.getNumberOfSeats();
        int numberOfTourists = creator.getNumberOfTourists();
        double ticketPrice = creator.getTicketPrice();
        Flight flight = new Flight(name, timeOfDeparture, timeOfArrival, numberOfSeats, numberOfTourists, ticketPrice);
        flightRepository.save(flight);
        return ResponseEntity.ok(flight);

    }
    // delete tourist




}




