package com.prueba1.DI.InyeccionDependenciasAvanzado.service;

import com.prueba1.DI.InyeccionDependenciasAvanzado.model.Person;
import com.prueba1.DI.InyeccionDependenciasAvanzado.registry.PersonService;
import org.springframework.stereotype.Service;

@Service("Alumn")
public class AlumnService implements PersonService<Person> {

    @Override
    public String process() {
        System.out.println("this person is an alumn");
        return "this person is an alumn";
    }

    @Override
    public String getPersonName() {
        return null;
    }

    @Override
    public String getPersonType() {
        return null;
    }
}
