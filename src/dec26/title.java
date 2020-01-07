package dec26;

import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		String pagetitle=driver.getTitle();
		System.out.println("page title is ::"+pagetitle);
		System.out.println("page title length is ::"+pagetitle.length());
String strurl=driver.getCurrentUrl();
System.out.println("page url is ::"+strurl);
System.out.println("page url length is ::"+strurl.length());
driver.close();
	}

}
