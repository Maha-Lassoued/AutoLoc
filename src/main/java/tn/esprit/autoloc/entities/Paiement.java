package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.autoloc.enumeration.ModePaiement;

import java.time.LocalDate;

@Entity
@Table(name = "paiement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;

    private Double montant;

    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement mode;
    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private Contrat contrat;
}