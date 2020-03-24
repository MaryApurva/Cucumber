package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checklogin {
WebDriver driver;
	
		@Given("^Open Chrome and start application$")
		public void open_Chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			  
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
		
		}

		@When("^I provide valid valid username and password$")
		public void i_provide_valid_valid_username_and_password() throws Throwable {
			driver.findElement(By.id("Email")).sendKeys("gademaryapurva@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("MaryApurva");
		}

		@Then("^user should be able to login$")
		public void user_should_be_able_to_login() throws Throwable {
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			driver.findElement(By.className("ico-logout")).click();
		}
	}
	

