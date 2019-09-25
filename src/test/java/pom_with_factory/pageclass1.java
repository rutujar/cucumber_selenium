package pom_with_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageclass1 {
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT,using ="Log in") WebElement login;
	@FindBy(how=How.ID,using="Email") WebElement username;
	@FindBy(how=How.NAME,using="Password") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@value='Log in']") WebElement log;
	
	public pageclass1(WebDriver driver)
	{
		this.driver=driver;
	}
	


	public void loginmethod(String uid, String pwd) {
		// TODO Auto-generated method stub
		login.click();
		username.sendKeys(uid);
		password.sendKeys(pwd);
		log.click();
	}

}
