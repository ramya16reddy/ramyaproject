package jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frames {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]/div")).click();
	Thread.sleep(5000);
	List<WebElement>oframes=driver.findElements(By.tagName("iframe"));
	System.out.println("no.of frames are::"+oframes.size());
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("syamalaramya16@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("163106");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button/span")).click();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.findElement(By.linkText("X")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Electricity")).click();
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	}
	
	

}
