package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idaAgence;
    private String nom;
    private String adresse;
    private String ville;
    private String telephone;
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules = new ArrayList<>();
    @OneToMany(mappedBy = "agence")
    private List<Employe> employees = new ArrayList<>();



}
