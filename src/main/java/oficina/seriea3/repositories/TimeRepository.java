package oficina.seriea3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oficina.seriea3.models.Time;

@Repository
public interface TimeRepository extends JpaRepository <Time, Long> {
    Time findByName(String name);
    Time findByCidade(String cidade);
}
