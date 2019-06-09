package id.web.dragonbee.service;

import java.sql.Timestamp;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.web.dragonbee.dao.UserDAO;
import id.web.dragonbee.model.User;
import id.web.dragonbee.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private UserRepository userRepository;
	
	public Object findAll() {
		return userRepository.findAll();
	}
	
	@Transactional
	public void insertUser(User user) {
		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());
		user.setDateJoined(timestamp);
		userDAO.add(user);
	}
}
