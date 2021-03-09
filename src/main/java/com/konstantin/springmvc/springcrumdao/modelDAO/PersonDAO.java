/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.modelDAO;

import com.konstantin.springmvc.springcrumdao.Model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author JavaDev
 */
@Component
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;
    private static int id;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * show all persons from db
     *
     * @return list of persons from db
     */
    public List<Person> index() {
        List<Person> query = jdbcTemplate.query("select * from people", new MyRowMapper());
        Optional<Person> max = query.stream().max((o1, o2) -> {
            return o1.getId() - o2.getId(); //To change body of generated lambdas, choose Tools | Templates.
        });
        id = max.get().getId();
        return query;
    }

    @GetMapping("/person")
    public Person show(int id) {
        ArrayList<Object> arrayList = new ArrayList<>();
        return jdbcTemplate.query("select * from people where id = ?", new Object[]{id}, new MyRowMapper()).stream().findAny().orElse(null);
    }

    /**
     * работает с AOP
     *
     * @param person
     */

    public void save(Person person) {
        person.setId(++id);
        jdbcTemplate.update("Insert into people (id, name , age ,email) values (?,?,?,?)",
                person.getId(), person.getName(), person.getAge(), person.getEmail());
    }

    public void update(int id, Person person) {
        Person show = show(id);
        show.setName(person.getName());
        show.setAge(person.getAge());
        show.setEmail(person.getEmail());
        jdbcTemplate.update("Update people Set name = ?,age = ?, email = ? where id = ?", person.getName(), person.getAge(), person.getEmail(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("delete from people where id = ?", id);
    }

}
