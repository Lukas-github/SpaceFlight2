package space.flight;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
        value = HttpStatus.BAD_REQUEST,
        reason = "Data Not Found"
)
public class DataNotFoundException extends RuntimeException{
}

