package dec26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleMatch {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
driver.manage().window().maximize();
String exptitle="gmail";
String acttitle=driver.getTitle();
if (acttitle.equalsIgnoreCase(exptitle)) {
	System.out.println("title is matching ::"+acttitle+"   "+exptitle);
	
}
else {
	System.out.println("title is notmatching ::"+acttitle+"   "+exptitle);
}
Thread.sleep(5000);
driver.close();

	}

}
