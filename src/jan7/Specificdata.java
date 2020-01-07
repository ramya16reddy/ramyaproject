package jan7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Specificdata {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/qedgetable.html");
driver.manage().window().maximize();
String tabletext=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[3]")).getText();
System.out.println(tabletext);
	}
	}
