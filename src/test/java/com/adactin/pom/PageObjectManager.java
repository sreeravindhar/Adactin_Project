package com.adactin.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public static WebDriver driver;
	private Pom_Class a;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Pom_Class getPomClass() {
		a = new Pom_Class(driver);
		return a;

	}

}
