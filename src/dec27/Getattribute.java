package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String linkurl=driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		Thread.sleep(3000);
		System.out.println("linkurl");
		driver.close();

	}

}
