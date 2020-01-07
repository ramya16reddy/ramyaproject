package jan3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoofitemsinaListbox {

	public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com/");
	driver.findElement(By.partialLinkText("REG")).click();
	Select country=new Select(driver.findElement(By.name("country")));
	List<WebElement>listitems=country.getOptions();
	System.out.println("no.of items are::"+listitems.size());
	Thread.sleep(5000);
	for (int i = 0; i < listitems.size(); i++) {
		String eachitem=listitems.get(i).getText();
		System.out.println(eachitem);
		Thread.sleep(5000);
		listitems.get(i).click();
		
		
	}
	Thread.sleep(5000);
	driver.close();
	}

}
