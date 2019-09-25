package pom_with_factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page_object_model.pageclass;

public class testwith {
	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		String uid="rutujarajesh23@gmail.com";
		String pwd="rutu2471";
		
		pageclass1 locateElements=PageFactory.initElements(driver, pageclass1.class);
		locateElements.loginmethod(uid, pwd);
		
		
		
	}

}
