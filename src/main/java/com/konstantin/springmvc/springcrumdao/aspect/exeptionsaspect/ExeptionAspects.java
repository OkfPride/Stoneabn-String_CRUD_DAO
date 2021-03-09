/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.aspect.exeptionsaspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author JavaDev
 */
@Component
@Aspect
@Order(5)
public class ExeptionAspects {
    
    @Before("com.konstantin.springmvc.springcrumdao.aspect.mypointcuts.MyPointcuts.catchExeptions()")
    private void method1(){
        System.out.println("i am cathing exeptions from AOP");
    }
}
