package com.evaluaciontecnica.apiServicios.repositories;

import com.evaluaciontecnica.apiServicios.entities.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Long> {
}
