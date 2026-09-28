package tn.esprit.autoloc.entity;

import jakarta.persistence.*;
import lombok.*;
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
    private Long id;

    private Double montant;

    @Column(name = "date_paiement")
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    @Column(name = "mode_paiement")
    private ModePaiement mode;
}