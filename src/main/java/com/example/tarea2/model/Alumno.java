package com.example.tarea2.model;

import java.util.Date;
import lombok.*;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoAlumno;
    private String numeroAlumno;
    private String nombreAlumno;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaNacimiento;
    private String generoAlumno;
    private String carreraAlumno;
}
