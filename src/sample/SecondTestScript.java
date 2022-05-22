package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SecondTestScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DRIVE\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
		Thread.sleep(2000);
         System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Apple")).click();
		driver.quit();
		
		
		
		

		
		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//select[@id=\"gh-cat\"]")); Select sel = new
		 * Select(element); sel.selectByVisibleText("Consumer Electronics");
		 * driver.findElement(By.id("gh-btn")).click();
		 */
		
		/*
		 * driver.findElement(By.className("gh-control")).click();
		 */
		
		
		
		
		
	}

}
