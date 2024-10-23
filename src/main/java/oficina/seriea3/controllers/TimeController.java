package oficina.seriea3.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oficina.seriea3.models.Time;
import oficina.seriea3.services.TimeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/time")
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService){
        this.timeService = timeService;
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Time> buscarPorTime(@PathVariable Long id){
        Time time = timeService.buscarTime(id);
        return ResponseEntity.ok(time);
    }

    @GetMapping("/buscar/{nome}")
    public ResponseEntity<Time> buscarTimePorNome(@PathVariable String name){
        Time time = timeService.buscarNome(name);
        return ResponseEntity.ok(time);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Time>> listarTimes(){
        List<Time> times = timeService.buscarTodos();
        return ResponseEntity.ok(times);
    }

    @PostMapping("/salvar")
    public Time salvar(@RequestBody Time time) {        
        return timeService.salvarTime(time);
    }    
}
