package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcaseout {
	public static void main(String[] args)
	{
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		pageclass pobj=new pageclass(driver);
		pobj.clicklink();
		String username=null;
		pobj.typeuname(username);
		String password=null;
		pobj.typepassword(password);
		pobj.clickonloginlyn();
		pobj.clickonlog();
		System.out.println("title is "+driver.getTitle());
		
	}

}
