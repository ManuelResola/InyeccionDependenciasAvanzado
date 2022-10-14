package com.prueba1.DI.InyeccionDependenciasAvanzado.config;

import com.prueba1.DI.InyeccionDependenciasAvanzado.registry.ServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class PersonConfig {
        @Bean                                               //definimos la función que nos devolverá el FactoryBean
        public FactoryBean<?> factoryBean() {
            final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
            bean.setServiceLocatorInterface(ServiceRegistry.class);
            return bean;
    }

}