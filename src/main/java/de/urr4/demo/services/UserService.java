package de.urr4.demo.services;

import de.urr4.demo.entities.User;
import org.neo4j.ogm.session.Session;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService {

    @Inject
    private Session session;

    public User getUserById(Long id){
        return session.load(User.class, id);
    }
}
