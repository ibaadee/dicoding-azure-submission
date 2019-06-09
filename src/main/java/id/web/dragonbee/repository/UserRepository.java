package id.web.dragonbee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import id.web.dragonbee.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
