package com.evaluaciontecnica.apiServicios.services;

import com.evaluaciontecnica.apiServicios.entities.Services;
import com.evaluaciontecnica.apiServicios.repositories.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesService {

    @Autowired
    private ServicesRepository servicesRepository;

    public List<Services> getAllServices(){
        return this.servicesRepository.findAll();
    }

    public Optional<Services> getServiceById(Long id){
        return this.servicesRepository.findById(id);
    }

    public Services saveNewService(Services service){
        return this.servicesRepository.save(service);
    }

    public List<Services> getServicesByTechnician(Long idTechnician){
        return this.servicesRepository.findByIdTechnician(idTechnician);
    }


}
