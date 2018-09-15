package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioRepositorio {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Usuario> getAllUsuario() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);        
        return criteria.list();
    }

    public long crearUsuario(Usuario usuario) {
        getSessionFactory().getCurrentSession().save(usuario);
        return usuario.getIdusuario();
    }
}
