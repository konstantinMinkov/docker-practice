package ua.kpi.integrations.restaurant.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String getUserByName() {
        return "Hello!";
    }
}
