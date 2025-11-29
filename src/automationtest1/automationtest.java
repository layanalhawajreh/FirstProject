package automationtest1;

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

public class automationtest {

	String mywebsite = " https://automationexercise.com/";
	WebDriver driver = new ChromeDriver();
	String  name = "layan" ;
	String  pass = "123456$" ;
	String  date = "20" ;
	String  month = "may" ;
	String  year = "2002" ;
	String  Firstname = "layan" ;
	String  lastname = "alhawajreh" ;
	String  company = "IRIS TECHNOLOGY" ;
	String  address = "tabarbour- jamilhijazeen street" ;
	String country = "canada";
	String state = "Alberta";
	String city = "Toronto";
	String zipcode = "A1A 1A1";
	String mobilephone = "0785503581";
	Random rand = new Random();
	int randomnumber = rand.nextInt(1233445);
	String  emailaddress = "layan"+ randomnumber+ "@gmail.com"  ;
	
	@BeforeTest
	public void setup() {
	driver.get(mywebsite);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test (priority=1)
	public void signup() {
		WebElement signuplist = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		signuplist.click();
		WebElement NameInuptField = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement emailInuptField = driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
		 NameInuptField.sendKeys(name);
		 emailInuptField.sendKeys(emailaddress);
		WebElement signupbutton = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
		signupbutton.click();
		
		//signup information
		WebElement genderradiobutton = driver.findElement(By.xpath("//div[@id='uniform-id_gender2']"));
		genderradiobutton.click();
		WebElement passwordinputfield = driver.findElement(By.id("password"));
		passwordinputfield.sendKeys(pass);
		WebElement dateofbirth = driver.findElement(By.id("days"));
		WebElement monthofbirth = driver.findElement(By.id("months"));
		WebElement yearofbirth = driver.findElement(By.id("years"));
		dateofbirth.sendKeys(date);
		monthofbirth.sendKeys(month);
		yearofbirth.sendKeys(year);
		WebElement newslettercheakbutton = driver.findElement(By.id("newsletter"));
		WebElement specialofferscheakbutton = driver.findElement(By.id("optin"));
		newslettercheakbutton.click();
		specialofferscheakbutton.click();
		
		//address information
		
		WebElement Firstnameinputfield  = driver.findElement(By.id("first_name"));
		WebElement lastnameinputfield  = driver.findElement(By.id("last_name"));
		WebElement comanyinputfield = driver.findElement(By.id("company"));
		WebElement addressinputfield = driver.findElement(By.id("address1"));
		WebElement countryinputfield = driver.findElement(By.id("country"));
		WebElement stateinputfield = driver.findElement(By.id("state"));
		WebElement cityinputfield = driver.findElement(By.id("city"));
		WebElement zipcodeinputfield = driver.findElement(By.id("zipcode"));
		WebElement mobileinputfield = driver.findElement(By.id("mobile_number"));
		
		
		Firstnameinputfield.sendKeys(Firstname);
		lastnameinputfield.sendKeys(lastname);
		comanyinputfield.sendKeys(company);
		countryinputfield.sendKeys(country);
		addressinputfield.sendKeys(address);
		stateinputfield.sendKeys(state);
		cityinputfield.sendKeys(city);
		zipcodeinputfield.sendKeys(zipcode);
	    mobileinputfield.sendKeys(mobilephone);
	    
	    WebElement createacountbutton = driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
	    createacountbutton.click();
	    
	    WebElement countinebutton = driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
	    countinebutton.click();
	    }
	    
	    @Test(priority=2)
		public void logout () {
	  //  driver.navigate().to("https://automationexercise.com/logout"); // from login url i changed to logout
	    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	   	
	}
	
	@Test(priority=3)
	public void login () {
		
		
		
		WebElement emailInuptField = driver.findElement(By.cssSelector("input[data-qa='login-email']"));
		emailInuptField.sendKeys(emailaddress);
		
		WebElement passwordinputfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordinputfield.sendKeys(pass);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginbutton.click();
			
	}
	
	
	@Test(priority=4)
	public void deleteaccount() {
		
		//WebElement deleteaccountlist = driver.findElement(By.xpath("//a[normalize-space()='Delete Account']"));
		driver.navigate().to("https://automationexercise.com/delete_account");
		
		//deleteaccountlist.click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		
		
		
	}
	
	
	
	
	
	
	
	@AfterTest
	public void aftertest() {
		
		
		
	}
	
	

}
