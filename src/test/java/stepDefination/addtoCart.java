package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addtoCart {
	
WebDriver driver;

	
	@Given("user launch site")
	public void user_launch_site() {
		driver = new ChromeDriver();
		driver.get("https://ehc-qa-frontend.kiwi-internal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@And("click on sign up")
	public void click_on_sign_up() {
		driver.findElement(By.xpath("//button[@class='btn btn-light']")).click();
		
	}

	@And("Enter details")
	public void enter_details() {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Monica");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Green");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Monica@yopmail.com");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hello@12345");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("Enter otp")
	public void enter_otp() {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	}

	
}
	


