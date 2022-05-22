package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DRIVE\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Samrin\\Downloads\\Dec Payslip.pdf");
		
		
		
		 
		  
		 

	}

}
