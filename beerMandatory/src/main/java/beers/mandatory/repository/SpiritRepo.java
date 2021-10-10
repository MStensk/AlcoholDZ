package beers.mandatory.repository;

import beers.mandatory.models.Spirit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SpiritRepo extends JpaRepository<Spirit,Long> {
}
