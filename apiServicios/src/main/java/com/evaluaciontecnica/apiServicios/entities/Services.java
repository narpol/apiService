package com.evaluaciontecnica.apiServicios.entities;


import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "services")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String direccion;
    private String descripcion;
    private String horaInicio;
    private String horaFin;

    @ManyToOne
    @JoinColumn(name = "idTecnico", insertable = false, nullable = false)
    private Technician tecnico;


}
