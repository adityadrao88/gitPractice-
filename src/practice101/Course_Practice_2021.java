package practice101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Course_Practice_2021 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//div[@class = 'SDkEP']/div[2]/input")).sendKeys("I WILL DO IT");
		driver.findElement(By.xpath("//div[@id= 'gb']/div/div/div/div/div[2]/a")).click();
				

	}

}
