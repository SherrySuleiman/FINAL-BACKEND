package PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.repository;

import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Daladala;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Passenger;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface PassengerRepo extends JpaRepository<Passenger,Long> {
}
