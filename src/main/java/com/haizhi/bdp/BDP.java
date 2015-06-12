package com.haizhi.bdp;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

public class BDP {
	@Test
	public void hello() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/xianjin/Applications/Google/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // 将浏览器设置为最大化的状态

		// And now use this to visit Google
		driver.get("https://www.bdp.cn/login.html#/login");

		// Find the text input element by its name
		WebElement element = driver.findElement(By.id("domain"));

		element.sendKeys("haizhi");
		element = driver.findElement(By.id("username"));
		element.sendKeys("wuxianjin");
		element = driver.findElement(By.id("password"));
		element.sendKeys("123qweasd");
		element.submit();
		
		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		assertEquals("搜索正确", "登录", driver.getTitle());
	
	

		// Close the browser
		driver.quit();
	}

}
