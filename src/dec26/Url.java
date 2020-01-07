package dec26;

import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		String srtprotocol="https://";
		 String srtactprotocol=driver.getCurrentUrl();
		 if (srtactprotocol.startsWith(srtprotocol)) 
			 {
			 System.out.println("Url is serured::"+srtactprotocol+"  "+srtprotocol);
			
		}
	else {
		 System.out.println("Url is unserured::"+srtactprotocol+"  "+srtprotocol);
	}	 
driver.close();
	}

}
