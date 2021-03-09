/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.aspect.logging.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author JavaDev
 */
@Component
@Aspect
public class MyAspect {
    
    @After("execution(* method() ) ")
    public void dobefore(){
        System.out.println("i am truing to AOP");
    }
}
