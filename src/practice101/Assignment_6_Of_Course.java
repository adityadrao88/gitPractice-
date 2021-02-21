package practice101;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Assignment_6_Of_Course {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// Selecting the Checkbox and grabbing the label
		WebElement checkbox = driver.findElement(By.cssSelector("#checkBoxOption2"));
		
		  if (checkbox.isSelected() == false) 
		  { 
			  checkbox.click();
			  Assert.assertTrue(checkbox.isSelected(),"The Checkbox has just now been selected"); 
		  } 
		  else
			   System.out.println("The Checkbox is already selected no need to select");
		  
		  String lableName = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		  System.out.println("The checkbox selected is = "+lableName);
		  
		  // Selecting the dropdown options for the label grabbed in checkbox
		  
		  WebElement dropDown = driver.findElement(By.cssSelector("#dropdown-class-example")); 
		  Select drop = new Select(dropDown); 
		  drop.selectByVisibleText(lableName);
		  System.out.println("The dropdown options selected is = "+drop.getFirstSelectedOption().getText());
		  
		  // Adding the lable grabbed form checkbox to the text box
		  
		  driver.findElement(By.id("name")).sendKeys(lableName);
		  
		  // Selecting the Alert button and grabbing the word added in the text box of the allert message
		  
		  driver.findElement(By.id("alertbtn")).click();
		  
		  // Hello Option2, share this practice page and share your knowledge 
		  String pop_upText = driver.switchTo().alert().getText(); 
		  String splitText[] = pop_upText.split(","); 
		  String splitText1[] = splitText[0].split(" ");
		  System.out.println("The captured text from the alert pop-up is = " +splitText1[1]);
		

	}

}
