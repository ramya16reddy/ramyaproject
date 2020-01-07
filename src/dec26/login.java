package dec26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com");
driver.manage().window().maximize();
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
driver.findElement(By.name("Submit")).click();
Thread.sleep(5000);
driver.quit();
	}

}
