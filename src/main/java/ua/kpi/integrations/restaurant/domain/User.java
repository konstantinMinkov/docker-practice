package ua.kpi.integrations.restaurant.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;


@Data
@EqualsAndHashCode(exclude = "id")
@Entity
public class User {

    @TableGenerator(name="user_generator")
    @Id @GeneratedValue(generator="user_generator")
    private Long id;
    private String name;
    private String surname;
}
