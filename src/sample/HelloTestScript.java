package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DRIVE\\Chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.ebay.com/");
driver.findElement(By.linkText("register")).click();
driver.findElement(By.id("firstname")).sendKeys("samrin");
driver.findElement(By.id("lastname")).sendKeys("sajar");

	}

}
