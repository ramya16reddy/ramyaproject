package jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rowsandcolumns {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/qedgetable.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement table=driver.findElement(By.name("qedgetech"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are ::"+rows.size());
		for (int i = 1; i < rows.size(); i++) {
	List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
	for (int j = 0; j < cols.size(); j++) {
	String celltext=cols.get(j).getText();
	System.out.println("\t"+celltext);
	}
	System.out.println();
	System.out.println("=========");
	
		}
driver.close();
		
		
	}

}
