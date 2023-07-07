package PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.repository;

import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Daladala;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepo extends JpaRepository<Station,Long> {
}
