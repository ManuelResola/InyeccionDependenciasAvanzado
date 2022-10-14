package com.prueba1.DI.InyeccionDependenciasAvanzado.controller;


import com.prueba1.DI.InyeccionDependenciasAvanzado.model.Person;
import com.prueba1.DI.InyeccionDependenciasAvanzado.registry.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PersonController {

        @Autowired
        private ServiceRegistry serviceRegistry;

        @PostMapping("/person")
        public String processPerson(@RequestBody Person person) {
                return serviceRegistry.getPerson(person.getPersonType()).getPersonName();


        }

}
