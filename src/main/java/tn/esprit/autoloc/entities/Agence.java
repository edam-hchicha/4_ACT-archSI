package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"employes", "vehicules"})
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy = "agence",cascade = CascadeType.PERSIST)
    private Set<Employe> employes;
    @OneToMany(mappedBy = "agence",cascade = CascadeType.PERSIST)
    private Set<Vehicule> vehicules;

}