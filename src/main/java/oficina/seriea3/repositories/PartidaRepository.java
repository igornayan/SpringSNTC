package oficina.seriea3.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oficina.seriea3.models.Partida;
import oficina.seriea3.models.Time;
import java.time.LocalDate;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long>{
    List<Partida> findByTimeCasaOrTimeFora(Time timeCasa, Time timeFora);
    List<Partida> findByData(LocalDate data);
}
