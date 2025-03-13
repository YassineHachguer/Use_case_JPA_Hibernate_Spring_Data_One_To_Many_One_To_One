package com.example.patient.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity@Data@NoArgsConstructor@AllArgsConstructor @Getter
@Setter

public class RendezVous {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private  StatusRDV status;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;

}
