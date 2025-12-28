package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd=new ChromeDriver();
		wd.get("http://www.automationpractice.pl/index.php");
		wd.manage().window().maximize();
		By signInLinkLocator= By.xpath("//a[normalize-space(text())='Sign in']");
		wd.findElement(signInLinkLocator);
		wd.close();
		wd.close();
		wd.getPageSource();

	}

}
