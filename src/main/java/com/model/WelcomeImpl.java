package com.model;

import org.springframework.stereotype.Component;

@Component
public class WelcomeImpl implements WelcomeDAO
{
	@Override
	public String sayWelcome(String name) 
	{
		return "Welcome " + name;
	}

	@Override
	public void sayHi(String name, String email) 
	{
		System.out.println("Hi " + name + ". Your email is " + email);
	}

	@Override
	public void sayAround() 
	{
		System.out.println("Around");
	}

}
