package com.dzhenetl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DaoPointcuts {

    @Pointcut("execution(public static void main(String))")
    public void mainMethod() {}

}
