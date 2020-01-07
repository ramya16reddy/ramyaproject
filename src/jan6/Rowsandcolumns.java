package jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rowsandcolumns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/qedgetable.html");
driver.manage().window().maximize();
String tabletext=driver.findElement(By.xpath("/html/body/table")).getText();
System.out.println(tabletext);
	WebElement table=driver.findElement(By.name("qedgetech"));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	System.out.println("no of rows are ::"+rows.size());
	for (int i = 1; i < rows.size(); i++) {
	List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
	System.out.println("row no ::"+i+""+"column no::"+cols.size());
		}
	driver.close();
	
	}

}
