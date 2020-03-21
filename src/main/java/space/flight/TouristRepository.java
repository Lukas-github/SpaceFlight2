package space.flight;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TouristRepository extends CrudRepository <Tourist, Long> {

    List <Tourist> findAll();

    Tourist save (Tourist tourist);

}
