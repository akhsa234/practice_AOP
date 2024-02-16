package com.bahar.practice_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logAspect {

    Logger logger = LoggerFactory.getLogger(logAspect.class);



    //    @Before(value = "execution(* com.bahar.practice_aop.service.EmployeeService.*(..)) and args(employee)")
//    public void beforeAdvice(JoinPoint joinPoint, Employee employee){
//        System.out.println("Before method: " + joinPoint.getSignature());
//        System.out.println("" + employee.getEmpId() + employee.getName());
//    }
//
//    @After(value = "execution(* com.bahar.practice_aop.service.EmployeeService.*(..)) and args(employee) ")
//    public void afterAdvice(JoinPoint joinPoint, Employee employee){
//        System.out.println("after method: " + joinPoint.getSignature());
//        System.out.println("successfully " + employee.getEmpId() + employee.getName());
//    }

    @Around("execution(* com.bahar.practice_aop.service.EmployeeService.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before: " +  joinPoint.proceed());
        Object result = joinPoint.proceed();
        System.out.println("After: " + result);
        return result;
    }

}
