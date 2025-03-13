package com.example.patient.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
@Entity@Data@NoArgsConstructor@AllArgsConstructor @Getter
@Setter

public class Medecin {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String email;
    private String specialite;
    @OneToMany(mappedBy = "medecin",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;


}
