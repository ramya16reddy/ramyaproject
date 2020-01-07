package dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectUsingitems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com/");
		driver.manage().window().maximize();
Select datelistbox=new Select(driver.findElement(By.name("birthday_day")));
Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
	boolean value1=datelistbox.isMultiple();
	System.out.println(value1);
	boolean value2=monthlistbox.isMultiple();
	System.out.println(value2);
	boolean value3=yearlistbox.isMultiple();
	System.out.println(value3);
	datelistbox.selectByVisibleText("16");
	System.out.println(datelistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	monthlistbox.selectByVisibleText("Mar");
	System.out.println(monthlistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	yearlistbox.selectByVisibleText("1998");
	System.out.println(yearlistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	datelistbox.selectByIndex(16);
	System.out.println(datelistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	monthlistbox.selectByIndex(3);
	System.out.println(monthlistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	yearlistbox.selectByIndex(90);
	System.out.println(yearlistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	}

}
