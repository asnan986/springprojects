package com.dxc.aop.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	public static Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	//before advice
	@Before("execution(* com.dxc.aop.service.*.add*(..))")
	public void beforeAdvice(JoinPoint jointpoint) {
		String method= jointpoint.getSignature().toShortString();
		
	logger.info("\n------->> executing @before advice before method "+method);
		
		
	}
	
	@After("execution(* com.dxc.aop.service.*.get*(..))")
	public void afterAdvice(JoinPoint joinpoint) {
		String method = joinpoint.getSignature().getName();
		
		logger.info("\n------->> executing @after advice after method"+method);
		
	}
	
	@AfterReturning("execution(* com.dxc.aop.service.*.add*(..))")
	public void afterReturningAdvice(JoinPoint joinpoint) {
		
		String method= joinpoint.getSignature().getName();
		
		logger.info("\n------->> Executing @AfterReturning on method: " + method); 
	}

	
	@AfterThrowing(pointcut = "execution(* com.dxc.aop.service.*.get*(..))",throwing = "ex")
	public void afterThrowingAdvice(JoinPoint joinpoint, ArithmeticException ex) {
		
		String method = joinpoint.getSignature().getName();
		logger.info("\n------->> executing @afterthrowing advice on method"+method);
		logger.info("\n------->> exeception is "+ex);
		
		
	}
	
	@Around("execution(* com.dxc.aop.service.*.delay*(..))")
	public Object logAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		
		String method =proceedingJoinPoint.getSignature().getName();
		
		logger.info("\n------->> Executing @Around on method: " + method); 
		long begin = System.currentTimeMillis();
		
		Object result = proceedingJoinPoint.proceed();
		
		long end=System.currentTimeMillis();
		
		long duration=end-begin;
		logger.info("\n------->> Duration : "+ duration/1000.0 +"seconds"); 
		  return result; 
		
		
	}
	
	
	
	
	
    
}
