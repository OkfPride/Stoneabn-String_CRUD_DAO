/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.aspect.Acces;

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
@Order(3)
public class AccesAspect {
   
    @Before("com.konstantin.springmvc.springcrumdao.aspect.mypointcuts.MyPointcuts.checkAccesfromPeopleController()")
    private void method2(){
        System.out.println("Check acces");
    }
    
    
}
