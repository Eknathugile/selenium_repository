package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cart_step {
	
	public static WebDriver driver;
	@Given("Open Home Page")
	public void user_is_on_Home_Page() {
	   System.out.println("Open_Home_Page()");
	   System.setProperty("webdriver.chrome.driver", "C:\\Capgemini\\Selenium jar\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}

	@When("Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		  System.out.println("Navigate_to_LogIn_Page()");
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
	}
	
	@And("User enters Email,Password and click on login button")
	public void User_enters_Email_Password_and_click_on_login_button(){
		System.out.println("User_enters_Email_Password_and_click_on_login_button()");
		
		driver.findElement(By.id("Email")).sendKeys("eknathugile1998@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vikas@123");
		
		String login_Button_xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input";
		driver.findElement(By.xpath(login_Button_xpath)).click();
		
	}
	
	@Then("Search for computer")
	public void search_for_computer() {
		System.out.println("search_for_computer()");
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		String search_xpath="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]";
		driver.findElement(By.xpath(search_xpath)).click();
	}
	
	@Then("add computer in cart")
	public void add_computer_in_cart() {
		System.out.println("add_computer_in_cart()");
		String addToCart_xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input";
		driver.findElement(By.xpath(addToCart_xpath)).click();
		
		//driver.findElement(By.id("add-to-cart-button-72")).click();
		
	}
	
	@Then("Change the feature as per need")
	public void change_the_feature_as_per_need() {
	   
		System.out.println("change_the_feature_as_per_need");
		
	}

	@Then("add into the shopping cart")
	public void add_into_the_shopping_cart() {
		
		System.out.println("add_into_the_shopping_cart");
		driver.findElement(By.id("add-to-cart-button-72")).click();
	   
	}

	
	@Then("Message displayed The product has been added to your shopping cart")
	public void message_displayed_The_product_has_been_added_to_your_shopping_cart() {
		System.out.println("message_displayed_The_product_has_been_added_to_your_shopping_cart");
	}


}
