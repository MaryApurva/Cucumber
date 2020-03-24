package cyclos;



	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class cycloslogin {
		
		WebDriver driver;

		@Given("^Open Chrome and start application$")
		public void open_Chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			  
			driver.get("http://localhost:8585/do/login");
			driver.manage().window().maximize();
			
		   
		}

		@When("^I provide valid valid username and password$")
		public void i_provide_valid_valid_username_and_password() throws Throwable {
			driver.findElement(By.id("cyclosUsername")).sendKeys("apurva");
			driver.findElement(By.id("cyclosPassword")).click();
			driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[1]")).click();
			
			driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[2]")).click();
			
			driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[3]")).click();
			
			driver.findElement(By.xpath("//input[4]")).click();
			
			
			
		}

		@Then("^user should be able to login$")
		public void user_should_be_able_to_login() throws Throwable {
			driver.findElement(By.xpath("//div[@id='virtualKeyboard']//div//input[@class='button']")).click();


		}

		@When("^Enter valid credentials in Member login text box$")
		public void click_on_account_tab_and_System_Payment_Link() throws Throwable {
			
			
		}

		@Then("^Registered member details should get displayed$")
		public void user_should_able_to_open_Payment_to_System() throws Throwable {
			
			
		}

		@When("^Entering all information$")
		public void entering_all_information() throws Throwable {
			
			
		}

		@Then("^User should be able to submit information$")
		public void user_should_be_able_to_submit_information() throws Throwable {
			
			
		}

		@When("^Submiting all information$")
		public void submiting_all_information() throws Throwable {
			
			
		}

		@Then("^On Account Information page Should show the payment information$")
		public void on_Account_Information_page_Should_show_the_payment_information() throws Throwable {
			
			
		}


	}

	

