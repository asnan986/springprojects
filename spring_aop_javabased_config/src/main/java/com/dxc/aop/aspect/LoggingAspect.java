package com.dxc.aop.aspect;

import java.util.logging.Logger;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;




public class LoggingAspect {
	public static Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	
	public void beforeAdvice(JoinPoint jointpoint) {
		String method= jointpoint.getSignature().toShortString();
		
	logger.info("\n------->> executing @before advice before method "+method);
		
		
	}
	
	
	public void afterAdvice(JoinPoint joinpoint) {
		String method = joinpoint.getSignature().getName();
		
		logger.info("\n------->> executing @after advice after method"+method);
		
	}
	
	
	public void afterReturningAdvice(JoinPoint joinpoint) {
		
		String method= joinpoint.getSignature().getName();
		
		logger.info("\n------->> Executing @AfterReturning on method: " + method); 
	}

	
	
	public void afterThrowingAdvice(JoinPoint joinpoint, ArithmeticException ex) {
		
		String method = joinpoint.getSignature().getName();
		logger.info("\n------->> executing @afterthrowing advice on method"+method);
		logger.info("\n------->> exeception is "+ex);
		
		
	}
	
	
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
