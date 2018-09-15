package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Estadistica;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EstadisticaRepositorio {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Estadistica> getAllEstadistica() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Estadistica.class);
        criteria.add(Restrictions.lt("rank", 10));//duda
        criteria.add(Restrictions.eq("confederation", "UEFA"));//duda
        return criteria.list();
    }

    public long crearEstadistica(Estadistica estadistica) {
        getSessionFactory().getCurrentSession().save(estadistica);
        return estadistica.getIdestadistica();
    }
}
