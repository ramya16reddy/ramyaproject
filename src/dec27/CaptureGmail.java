package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureGmail {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		String linktext=driver.findElement(By.partialLinkText("Gm")).getText();
		String exttext="gmail";
		if (linktext.equalsIgnoreCase(exttext)) {
			System.out.println("linktext is matching::"+linktext+" "+exttext);
			
		}
else {
	System.out.println("linktext is notmatching::"+linktext+" "+exttext);	
}
		Thread.sleep(3000);
		driver.close();
	}

}
