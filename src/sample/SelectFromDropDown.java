package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DRIVE\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("samrin");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sajar");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("sam@gmail.com");
		/*
		 * driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys(
		 * "sam@gmail.com");
		 */
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Test124");
		Select selday = new Select(driver.findElement(By.id("day")));
		selday.selectByVisibleText("2");
		Select selmonth = new Select(driver.findElement(By.id("month")));
		selmonth.selectByVisibleText("Feb");
		Select selyear = new Select(driver.findElement(By.id("year")));
		selyear.selectByVisibleText("1998");
	 driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	
		
		
		
		
		
	}

		
		
		
		
		
	}


