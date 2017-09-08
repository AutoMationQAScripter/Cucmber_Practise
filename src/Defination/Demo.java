package Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {

	WebDriver driver;
@Given("^Launch browser and enter username$")
public void launch_browser_and_enter_username() throws Throwable {
	driver = new FirefoxDriver();
	driver.get("https://enterprise-demo.orangehrmlive.com/");
}

@When("^Enter username$")
public void enter_username() throws Throwable {
 
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Deepak.Pal");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Deepak.Pal");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
}

@Then("^It should through invalid error$")
public void it_should_through_invalid_error() throws Throwable {
   
	WebElement str = driver.findElement(By.xpath("//span[@id='spanMessage']"));
	if(str.equals("Invalid credentials"))
		System.out.println("Invalid credentials");
}

}
