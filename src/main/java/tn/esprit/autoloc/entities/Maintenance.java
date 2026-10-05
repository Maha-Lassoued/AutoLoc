package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String description;
    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

}
