package demo.swagger2.auth.repository;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by kind on 2017/8/10.
 */
public interface UserRepository extends CrudRepository<User2, Long> {

    public User2 findByUsername(String username);
}
