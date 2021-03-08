/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.databaseConnection;

import com.konstantin.springmvc.springcrumdao.Model.Person;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author JavaDev
 */
public class DBCommands {
//
//
//    public void addIntoDB(Person person) {
//        jdbcTemplate.query(psc, rse)
//        int id = person.getId();
//        int age = person.getAge();
//        String email = person.getEmail();
//        String name = person.getName();
//        try {
//            PreparedStatement prepareStatement = connection.prepareStatement("insert into people (id , name , age, email) values (? ,? ,? ,?)");
//            prepareStatement.setInt(1, id);
//            prepareStatement.setString(2, name);
//            prepareStatement.setInt(3, age);
//            prepareStatement.setString(4, email);
//            prepareStatement.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBCommands.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public List<Person> getPeople() {
//        List<Person> list = new ArrayList<>();
//        try {
//            Statement createStatement = connection.createStatement();
//            ResultSet resultSet = createStatement.executeQuery("select * from people");
//            while (resultSet.next()) {
//                Person person = new Person();
//                person.setId(resultSet.getInt("id"));
//                person.setName(resultSet.getString("name"));
//                person.setAge(resultSet.getInt("age"));
//                person.setEmail(resultSet.getString("email"));
//                list.add(person);
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DBCommands.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//
//    public Person getPerson(int id) {
//        Person person = null;
//        try {
//            PreparedStatement prepareStatement = connection.prepareStatement("select * from people where id = ?");
//            prepareStatement.setInt(1, id);
//            ResultSet rs = prepareStatement.executeQuery();
//            rs.next();
//            int age = rs.getInt("age");
//            String name = rs.getString("name");
//            String email = rs.getString("email");
//            person = new Person(name, id, age, email);
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DBCommands.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return person;
//    }
//
//    public void remove(int id) {
//        try {
//            PreparedStatement prepareStatement = connection.prepareStatement("delete from people where id = ?");
//            prepareStatement.setInt(1, id);
//            prepareStatement.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBCommands.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//    public void update(Person person) {
//        try {
//            PreparedStatement prepareStatement = connection.prepareStatement("Update people  SET name = ?, age = ?, email = ? where id = ?");
//            prepareStatement.setString(1, person.getName());
//            prepareStatement.setInt(2, person.getAge());
//            prepareStatement.setString(3, person.getEmail());
//            prepareStatement.setInt(4, person.getId());
//            prepareStatement.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBCommands.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
}
