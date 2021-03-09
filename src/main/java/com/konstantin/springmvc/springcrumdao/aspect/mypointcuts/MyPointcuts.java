/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.aspect.mypointcuts;

import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author JavaDev
 */
public class MyPointcuts {

    @Pointcut("execution(* com.konstantin.springmvc.springcrumdao.PeopleController.PeopleController.*(..))")
    public void checkAccesfromPeopleController() {
    }

    @Pointcut("execution(* com.konstantin.springmvc.springcrumdao.PeopleController.PeopleController.*(..))")
    public void checkLoggingforPeopleController() {
    }
    @Pointcut("execution(* com.konstantin.springmvc.springcrumdao.PeopleController.PeopleController.*(..))")
    public void catchExeptions(){}

}
