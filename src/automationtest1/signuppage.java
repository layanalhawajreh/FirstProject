package automationtest1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signuppage {

	String mywebsite = " https://automationexercise.com/";
	String signuPage="https://automationexercise.com/login";
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();
    String publicemail;
	
	
	@BeforeTest
	public void setup() {
	driver.get(mywebsite);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
			
	
	@Test (priority=1 )
	public void signup() {
		
		driver.navigate().to(signuPage);
		
		int randomnumber = rand.nextInt(1233445);
		String [] usersname = { "layan","zaina","ahmad","marah"};
		int usernamerandomindex = rand.nextInt( usersname.length);
		String  emailaddress = usersname[usernamerandomindex]  + randomnumber+ "@gmail.com"  ;
		
		
		publicemail =emailaddress;
		WebElement NameInuptField = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement emailInuptField = driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
		 NameInuptField.sendKeys(usersname[usernamerandomindex] );
		 emailInuptField.sendKeys(emailaddress);
		WebElement signupbutton = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
		signupbutton.click();

	    }
	    
	@Test (priority=2 )
	public void login() {
		driver.navigate().to("https://automationexercise.com/login");
		WebElement emailInuptField = driver.findElement(By.cssSelector("input[data-qa='login-email']"));
		emailInuptField.sendKeys(publicemail);
		
		//WebElement passwordinputfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		//passwordinputfield.sendKeys("12334");
		
		
	}
	
	
	@AfterTest
	public void aftertest() {
		
		
		
		
	}
	
	

}
