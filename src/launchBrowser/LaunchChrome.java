package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//Scanner scn = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\atahar\\Desktop\\Selenium\\first_Seleniun\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnk")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
