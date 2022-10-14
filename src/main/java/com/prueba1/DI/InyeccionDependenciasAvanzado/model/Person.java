package com.prueba1.DI.InyeccionDependenciasAvanzado.model;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private String personName;
    private String personType;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    @Override
    public String toString() {
        return "Person [personNAme=" + personName + ", personType=" + personType + "]";
    }


}
