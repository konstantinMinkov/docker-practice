package ua.kpi.integrations.restaurant.services;


import ua.kpi.integrations.restaurant.domain.User;


public interface UserService {

    User findUserByName(String name);
}
