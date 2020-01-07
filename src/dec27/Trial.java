package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("om");
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("prakash");
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9866571688");
		WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("syamalaramya16@gmail.com");
		Thread.sleep(3000);
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("nizamabad");
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("hyderabad");
		Thread.sleep(3000);
		WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
		State.sendKeys("telengana");
		Thread.sleep(3000);
		WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode.sendKeys("501246");
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		country.sendKeys("INDIA");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("syamalaramya16@gmail.com");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("syamalaramya16@");
		Thread.sleep(3000);
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpassword.sendKeys("syamalaramya16@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(5000);
			driver.close();
	}

}

