package com.prueba1.DI.InyeccionDependenciasAvanzado.registry;


//creamos el interface que pasaremos a la clase ServiceLocatorFactoryBean
public interface ServiceRegistry {
    public <T> PersonService<T> getPerson(String personName);
                                                                  //debe recibir un parámetro que será el nombre del bean

}
