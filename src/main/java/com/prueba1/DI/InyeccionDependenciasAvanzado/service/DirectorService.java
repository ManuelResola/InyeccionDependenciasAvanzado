package com.prueba1.DI.InyeccionDependenciasAvanzado.service;

import com.prueba1.DI.InyeccionDependenciasAvanzado.model.Person;
import com.prueba1.DI.InyeccionDependenciasAvanzado.registry.PersonService;
import org.springframework.stereotype.Service;

@Service("Director")
public class DirectorService implements PersonService<Person> {


    @Override
    public String process() {
        System.out.println("this person is a director");
        return "this person is a director";
    }

    public String getPersonName() {
        return null;
    }

    public String getPersonType() {
        return null;
    }

}
