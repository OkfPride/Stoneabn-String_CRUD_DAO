/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.aspect.Acces;

import com.konstantin.springmvc.springcrumdao.Model.Person;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
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

    @AfterReturning(pointcut = "com.konstantin.springmvc.springcrumdao.aspect.mypointcuts.MyPointcuts.checkAccesfromPeopleController()", returning = "listOfPersons")
    private void method2(JoinPoint joinPoint, List<Person>listOfPersons) {
        System.out.println(listOfPersons);
//        Signature signature = joinPoint.getSignature();
//        System.out.println("signature = " + signature);
//        String declaringTypeName = signature.getDeclaringTypeName();
//        System.out.println("signature.getDeclaringTypeName() = " + declaringTypeName);
//        if (signature.getName().equalsIgnoreCase("save")) {
//            Object[] args = joinPoint.getArgs();
//            for (Object arg : args) {
//                System.out.println(arg);
//                if (arg instanceof Person) {
//                    Person person = (Person) arg;
//                    String name = person.getName();
//                    System.out.println("\n name = " + name + "\n");
//
//                }
//            }
//
//        }else{
//            System.out.println("ITS NOT SAVE");
//        }
        System.out.println("----------------------------");
    }

}
