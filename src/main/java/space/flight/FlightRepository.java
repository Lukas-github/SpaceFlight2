package space.flight;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FlightRepository extends CrudRepository<Tourist, Long> {

    List<Flight> findAll();

    Flight save (Flight flight);

    Optional<Flight> findFlightByName(String flightName);
}
