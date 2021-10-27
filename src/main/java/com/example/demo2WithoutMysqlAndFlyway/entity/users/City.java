package com.example.demo2WithoutMysqlAndFlyway.entity.users;


import lombok.*;

import javax.persistence.*;

/**
 * A subordinate entity of the “University” entity.
 *
 * @author Maxim
 * @version 1.0
 */
@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id", "city"}) //будет неправильно работать при автоматическом присвоении БД-ых значения полю "id", а при UUID все ОК!
@ToString(of = {"id", "city"})

public class City {
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * city name
     */
    private String city;

    /**
     * field of connection with the entity "University"
     */
    @OneToOne(optional=false, mappedBy="cities")
    private University univ;


    //В закомментированном блоке кода в этой сущности, а так же в "Users" и "University" показано написание других отношений (а не только @OneToOne)
//    @OneToMany (mappedBy = "cities")
//    @JsonIgnoreProperties("cities")
//    private Set<University> universitySet;
}
