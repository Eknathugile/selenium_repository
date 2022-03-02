package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps2 {
	
	public static WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	   System.out.println("user_is_on_Home_Page()");
	   System.setProperty("webdriver.chrome.driver", "C:\\Capgemini\\Selenium jar\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		  System.out.println("user_Navigate_to_LogIn_Page()");
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() {
		  System.out.println("user_enters_UserName_and_Password()");
		  driver.findElement(By.id("login1")).sendKeys("pravin");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		  System.out.println("message_displayed_Login_Successfully()");
	}

	


}
