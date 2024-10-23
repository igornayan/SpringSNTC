package oficina.seriea3.services;

import java.util.List;

import org.springframework.stereotype.Service;

import oficina.seriea3.models.Time;
import oficina.seriea3.repositories.TimeRepository;

@Service
public class TimeService {
    private final TimeRepository timeRepository;

    public TimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public Time buscarTime(Long id){
        return timeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("time não encontrado"));
    }
    
    public List<Time> buscarTodos(){
        return timeRepository.findAll();
    }

    public Time buscarNome(String name){
        return timeRepository.findByName(name);
    }

    public Time salvarTime(Time time){
        return timeRepository.save(time);
    }
}
