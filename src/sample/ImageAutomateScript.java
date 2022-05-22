package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ImageAutomateScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DRIVE\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select sel = new Select(driver.findElement(By.id("gh-cat")));
		sel.selectByVisibleText("Consumer Electronics");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		WebElement image = driver.findElement(By.xpath("//*[@id=\"gh-logo\"]"));
		image.click();
			}
		}
		/*
		 * String title = driver.getTitle() ;
		 * 
		 * if(title.contains("Electronics, Cars")) {System.out.println("title matches");
		 * 
		 * } else System.out.println("title doesnot match");
		 */
	


