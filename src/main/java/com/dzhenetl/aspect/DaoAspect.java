package com.dzhenetl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DaoAspect {

    @Before("com.dzhenetl.aspect.DaoPointcuts.mainMethod()")
    public static void commitTransactionAdvice() {
    }

}
