package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo_para {
	WebDriver driver=null;
	@Given("User opens the application")
	public void user_is_open_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		
	    
	}

	@When("Users click on the signin link")
	public void user_click_on_sign_in_link()  {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	    
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password)  {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		System.out.println("The title is:"+driver.getTitle());
	    
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully()  {
		System.out.println("succesful");
	   
	}

}
