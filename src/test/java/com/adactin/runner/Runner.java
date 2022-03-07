package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.org.BaseClass;
import com.adactin.org.BaseClassTwo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
                 glue = "com\\adactin\\stepdefenition",monochrome = true, plugin = {"pretty"})



public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	 public static void setUp () {
		driver = BaseClassTwo.getBrowser("chrome");


	}
	

}
