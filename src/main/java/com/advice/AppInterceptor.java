package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppInterceptor 
{
	@Before("execution(* com.model.WelcomeDAO.*(..))")
	public void callBeforeMethod()
	{
		System.out.println("called before");
	}
	
	//@After("execution(* com.model.WelcomeDAO.sayHi(..))")
	public void callAfterMethod()
	{
		System.out.println("called after");
	}
	
	//@Around("execution(* com.model.WelcomeDAO.sayAround(..))")
	public void callAroundMethod(ProceedingJoinPoint pj)
	{
		System.out.println("called before");
		
		try
		{
			pj.proceed();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		System.out.println("called after");
	}
}
