package sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DRIVE\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		TakesScreenshot ts = ((TakesScreenshot)driver);
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File trg = new File("C:\\Users\\Samrin\\eclipse-workspace\\RCVDEMO\\sample\\src\\sample\\screenshot1.png");
	    FileHandler.copy(src, trg);
	    driver.quit();
	    
      
		
	}

}
