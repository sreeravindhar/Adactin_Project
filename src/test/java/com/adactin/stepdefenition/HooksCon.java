package com.adactin.stepdefenition;

import java.io.IOException;

import com.adactin.org.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class HooksCon extends BaseClass {
	
	
	@Before
	public void beforeScenerio(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("The Title is  : "+name);

	}

	
	
	@After
	public void afterScenerio(Scenario scenario) throws IOException {
		Status status = scenario.getStatus();
		System.out.println("The Status is : " + status);
		
		
		if (scenario.isFailed()) {
			screenShot("A:\\My data\\Java\\AdactinWithCucumber\\ScreenShot\\fail.png");
			
		}
		
		

	}

}
