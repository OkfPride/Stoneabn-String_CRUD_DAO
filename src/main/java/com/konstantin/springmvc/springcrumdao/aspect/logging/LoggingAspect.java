/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.aspect.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author JavaDev
 */
@Aspect
@Component
@Order(1)
public class LoggingAspect {
    
    @Before("com.konstantin.springmvc.springcrumdao.aspect.mypointcuts.MyPointcuts.checkLoggingforPeopleController()")
    private void method1(){
        System.out.println("Logging");
    }
//    @Before("com.konstantin.springmvc.springcrumdao.aspect.Acces.AccesAspect.checkAccesfromPeopleController()")
//    public void method2(){
//        System.out.println("Check acces");
//    }
}