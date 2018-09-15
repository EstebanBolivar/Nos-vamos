/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Estadistica;
import com.helloworld.apispring.model.entity.Reserva;
import com.helloworld.apispring.model.entity.Vehiculo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jose Manuel Bello
 */
@Repository
@Transactional
public class VehiculoRepositorio {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Vehiculo> getAllVehiculo() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Vehiculo.class);
        return criteria.list();
    }

    public long crearVehiculo(Vehiculo vehiculo) {
        getSessionFactory().getCurrentSession().save(vehiculo);
        return vehiculo.getIdVehiculo();
    }
}
