package com.evaluaciontecnica.apiServicios.repositories;

import com.evaluaciontecnica.apiServicios.entities.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {

    public List<Services> findByIdTechnician(Long idTechnician);

 }
