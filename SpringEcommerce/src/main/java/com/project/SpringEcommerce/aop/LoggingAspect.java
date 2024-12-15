package com.project.SpringEcommerce.aop;
import jakarta.persistence.criteria.Join;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    public static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

//    @Before("execution(* com.project.SpringEcommerce.service.ProductService.*(..))")
//    public void logMethod(){
//        LOGGER.info("Method is called");
//    }

    //targeting particular method ex for join point and point cut
    @Before("execution(* com.project.SpringEcommerce.service.ProductService.getProduct(..))")
    public void logMethod(JoinPoint jp){
        LOGGER.info("Method is called "+jp.getSignature().getName());
    }

}
