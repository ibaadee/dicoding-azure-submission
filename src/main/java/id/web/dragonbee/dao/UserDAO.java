package id.web.dragonbee.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import id.web.dragonbee.model.User;

@Repository
public class UserDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void add(User user) {
		em.persist(user);
		em.flush();
	}
}
