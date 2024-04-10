package com.evaluaciontecnica.apiServicios.controllers;

import com.evaluaciontecnica.apiServicios.entities.Services;
import com.evaluaciontecnica.apiServicios.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    @GetMapping
    public List<Services> allServices(){
        return this.servicesService.getAllServices();
    }

    @GetMapping("/{id}")
    public Optional<Services> findServiceById(@PathVariable Long id){
        return this.servicesService.getServiceById(id);
    }

    @PostMapping
    public Services addNewService(@RequestBody Services services){
        return this.servicesService.saveNewService(services);
    }

    @GetMapping("/tecnico/{id}")
    public List<Services> findServiceByTechnician(@PathVariable Long id){
        return this.servicesService.getServicesByTechnician(id);
    }


}
