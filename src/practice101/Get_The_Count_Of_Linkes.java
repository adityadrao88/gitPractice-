package practice101;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Get_The_Count_Of_Linkes {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
			
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Getting the count of all the links in the page
				System.out.println(driver.findElements(By.tagName("a")).size());
				
				
		// Getting the count of the links present in the footer section
		System.out.println(driver.findElement(By.xpath("//div[@id='gf-BIG']")).findElements(By.tagName("a")).size());
		//Above part can be done neatly as:-
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
				
		//WebElement discountCoupons= footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		WebElement discountCoupons= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(discountCoupons.findElements(By.tagName("a")).size());
		int linkCount = discountCoupons.findElements(By.tagName("a")).size();
		
		//Clicking on all the links in the footer section Discount Coupons section and verify if the links work
		
		for(int i=1; i<linkCount; i++)
		{
			String openLinkInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			// In send Keys we can perform keyboard operation too
			discountCoupons.findElements(By.tagName("a")).get(i).sendKeys(openLinkInNewTab);
		}
		
		//Printing the titles of all the tabs
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();
		
		/*
		 * for(int i=0; i<linkCount; i++) { String header = iter.next();
		 * System.out.println(driver.switchTo().window(header).getTitle());
		 * 
		 * }
		 */
		//Printing the titles of all the tabs can also be done this way:- 
		while(iter.hasNext())
		{
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}

	}

}
