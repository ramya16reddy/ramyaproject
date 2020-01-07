package dec29;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("no.of links are ::"+links.size());
		Thread.sleep(5000);
		for(int i=0;i<=links.size();i++)
		{
		String linkname=links.get(i).getText();
			String linkurl=links.get(i).getAttribute("href");
		System.out.println(linkname+"\n"+linkurl);
		}
		Thread.sleep(5000);
		driver.close();
	}
}
