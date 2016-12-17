package ua.kpi.integrations.restaurant.services;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ua.kpi.integrations.restaurant.config.ApplicationConfig;
import ua.kpi.integrations.restaurant.domain.User;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;


@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class UserServiceIntegrationTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired private UserService userService;

    @Before
    public void addUsers() {
        jdbcTemplate.update("INSERT INTO USER VALUES(?, ?, ?)", 1L, "Jack", "White");
    }

    @Test
    public void testFindUserByName() throws Exception {
        User jack = userService.findUserByName("Jack");
        User jim = userService.findUserByName("Jim");

        assertThat(jack.getSurname(), is("White"));
        assertThat(jim, is(nullValue()));
    }
}