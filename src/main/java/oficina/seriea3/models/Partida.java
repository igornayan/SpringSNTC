package oficina.seriea3.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "time_casa_id", referencedColumnName = "id")
    private Time timeCasa;

    @ManyToOne
    @JoinColumn(name = "time_visitante_id", referencedColumnName = "id")
    private Time timeFora;

    private int placarCasa;
    private int placarVisitante;
    
    @JsonFormat(pattern = "dd-MM-yyy")
    private LocalDate data;  
}
