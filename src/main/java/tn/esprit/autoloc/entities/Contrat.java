package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private LocalDateTime dateSignature;
    private BigDecimal montantTotal;
    private Boolean valide;

    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    private List<Paiement> paiements = new ArrayList<>();

}
