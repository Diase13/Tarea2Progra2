package com.example.tarea2.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import com.example.tarea2.model.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    @Query(value = "SELECT o FROM Alumno o WHERE o.numeroAlumno=?1")
    Optional<Alumno> findByAlumno(String numeroAlumno);
}
