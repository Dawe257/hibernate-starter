package com.dzhenetl.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class DaoAspect {

    @AfterReturning
    public static void commitTransactionAdvice() {

    }

}
