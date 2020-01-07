package jan7;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Companytable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id='liMarket']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='LiMarketStats']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='hrfDSP']")).click();
		Thread.sleep(4000);
		List<WebElement>alphabets=driver.findElement(By.id("dvNseBseRndr")).findElements(By.tagName("a"));
		for (int a = 0; a < alphabets.size(); a++) {
			WebElement ele=alphabets.get(a);
			String linkletter=(String)ele.getAttribute("id");
			System.out.println(linkletter);
			if (!linkletter.equals("")) {
				driver.findElement(By.id(linkletter)).click();
				}
			Thread.sleep(5000);
			WebElement table=driver.findElement(By.id("gridSource"));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			System.out.println("no of rows are::"+rows.size());
			for (WebElement each : rows) {
			List<WebElement>cols=each.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
			if (eachcell.getText().isEmpty()) {
		driver.findElement(By.xpath("//th[@class='table-page:next']")).click();		
			}
			System.out.print("\n"+eachcell.getText());
			}
			System.out.println();
			System.out.println("==="); 
		}
			Thread.sleep(5000);
		driver.close();
		}

	}

}
