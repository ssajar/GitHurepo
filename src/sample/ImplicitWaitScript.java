package sample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplicitWaitScript {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DRIVE\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File Target = new File("C:\\Users\\Samrin\\eclipse-workspace\\RCVDEMO\\sample\\src\\sample\\screenshot2.png");
		FileHandler.copy(src, Target);
		driver.quit();
		System.out.println("Testing for Implicit wait");
		
	}

}
