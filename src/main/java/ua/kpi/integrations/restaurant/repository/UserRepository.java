package ua.kpi.integrations.restaurant.repository;


import org.springframework.data.repository.CrudRepository;
import ua.kpi.integrations.restaurant.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByName(String name);
}
