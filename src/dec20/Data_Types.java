package dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Types {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "‪F:\\dec_selenium\\chromedriver_win32");
WebDriver driver=new ChromeDriver();
driver.get("http://orangehrm.qedgetech.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(5000);
	driver.quit();
	
	}
	

}
