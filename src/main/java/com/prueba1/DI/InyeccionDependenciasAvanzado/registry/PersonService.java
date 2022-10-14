package com.prueba1.DI.InyeccionDependenciasAvanzado.registry;

public interface PersonService<T> {
    String process();

    public String getPersonName();
    public String getPersonType();

}
