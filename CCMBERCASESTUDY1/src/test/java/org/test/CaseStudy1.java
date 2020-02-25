package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy1 {
	WebDriver driver;
	@Given("User Enters the UserName")
	public void user_Enters_the_UserName() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");	 
		driver=new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		 
		driver.findElement(By.id("details-button")).click();
		 
		driver.findElement(By.id("proceed-link")).click();
		 
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();

	}

	
	//@When("enters {string}, {string}, {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} ,  {string}")
	//public void enters(String userName, String firstName, String lastName, String password, String confirmPassword, String emailAddress, String mobileNumber, String dob, String address, String Answer, String Submit) {
	    // Write code here that turns the phrase above into concrete actions
	@When("enters {string}, {string}, {string} , {string} , {string}  , {string} , {string} , {string} , {string}  ,  {string}")
	public void enters(String userName, String firstName, String lastName, String password, String confirmPassword, String emailAddress, String mobileNumber, String dob, String address, String Answer) {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.name("userName")).sendKeys(userName);
		 
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		 
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		 
		driver.findElement(By.name("password")).sendKeys(password);
		 
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
		 
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		 
		driver.findElement(By.name("emailAddress")).sendKeys(emailAddress);
		 
		driver.findElement(By.name("mobileNumber")).sendKeys(mobileNumber);
		 
		driver.findElement(By.name("dob")).sendKeys(dob);
		 
		driver.findElement(By.name("address")).sendKeys(address);
		 
		driver.findElement(By.name("securityQuestion")).click();
		 
		driver.findElement(By.name("answer")).sendKeys(Answer);
		 
		driver.findElement(By.name("Submit")).click();

	
	}

	@Then("user navigates to login page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}


	/*	WebDriver driver;
	
	@Given("User Enters the UserName")
	public void user_Enters_the_UserName() {
		System.setProperty("WebDriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		 driver.get("https://10.232.237.143/TestMeApp/"); 
		  driver.findElement(By.id("details-button")).click();
		  driver.findElement(By.id("proceed-link")).click();
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	  
	}

	@When("enters {string}, {string}, {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void enters(String userName, String firstName, String lastName, String password, String confirmPassword, String gender, String emailAddress, String mobileNumber, String dob, String address, String SecurityQuestion, String Answer, String registerbutton, String HomePage) {
		  driver.findElement(By.name("userName")).sendKeys("ananth@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("Padmanabha B S");
		  driver.findElement(By.name("Login")).click();  
		  driver.findElement(By.xpath("//*[@href='RegisterUser.htm']")).click();
		  driver.findElement(By.name("userName")).sendKeys("ddddd");
		  driver.findElement(By.name("firstName")).sendKeys("Anantha");
		  driver.findElement(By.name("lastName")).sendKeys("Padmanabha");
		  driver.findElement(By.name("password")).sendKeys("PadmanabhaBS");
		  driver.findElement(By.name("confirmPassword")).sendKeys("PadmanabhaBS");
		  WebElement m=driver.findElement(By.id("gender"));
		  m.click();
		  driver.findElement(By.name("emailAddress")).sendKeys("ananth@gmail.com");
		  driver.findElement(By.name("mobileNumber")).sendKeys("9987785682");
		  driver.findElement(By.name("dob")).sendKeys("12/12/2019");
		  driver.findElement(By.name("address")).sendKeys("sdkgfsdkfbjksdbvk");
		  Select s=new Select(driver.findElement(By.name("securityQuestion")));
		  s.selectByIndex(2);
		  driver.findElement(By.name("answer")).sendKeys("jksdhvjsjjja");
		  driver.findElement(By.name("Submit")).click();  
	  
	}

	@Then("user navigates to login page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("userName")).sendKeys("ddddd");
		  driver.findElement(By.name("password")).sendKeys("PadmanabhaBS");
		  driver.findElement(By.name("Login")).click();
	}
	*/
