import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestHelloWorld {
	
	
	@Test
	public void testGoogleSearch() {
		WebDriver driver = new ChromeDriver();
	    //跳转到baidu首页
	    driver.get("http://www.baidu.com");
	    By btnSearchElement = By.xpath("//input[@value='百度一下']");
		//对象识别
        By tbSearchElement = By.name("wd");
      
        WebElement tbSearch = driver.findElement(tbSearchElement);
        WebElement btnSearch = driver.findElement(btnSearchElement);
        //对象操作
        tbSearch.sendKeys("iquicktest");
        btnSearch.click();
	}

	

}