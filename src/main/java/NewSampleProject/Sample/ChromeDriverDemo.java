package NewSampleProject.Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverDemo {
    private static final String APPLICATION_URL="https://opensource-demo.orangehrmlive.com/";
    private static final String CHROME_DRIVER_KEY="webdriver.chrome.driver";
    private static final String GECKO_DRIVER_KEY="webdriver.gecko.driver";

    
	
	
	
	public static void launchBrowser()
	{
		System.setProperty(CHROME_DRIVER_KEY, "C:\\Chrome version jar\\chromedriver.exe");
		//System.setProperty(GECKO_DRIVER_KEY, "F:\\GikoDriverNewJar\\geckodriver.exe") ;
		
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		 
		 driver.get(APPLICATION_URL);
		 
		 driver.manage().window().maximize();
		 
		 dealy(2);
		 
		 WebElement UserName=driver.findElement(By.id("txtUsername"));
				 
		 WebElement Password=driver.findElement(By.id("txtPassword"));
		 
		 WebElement LoginButton=driver.findElement(By.id("btnLogin"));
		
		 UserName.clear();
		 
		 UserName.sendKeys("Admin");
		 
		 dealy(2);
		 
		 Password.clear();
		 
		 Password.sendKeys("admin123");
		 
		 dealy(2);
		 
		 LoginButton.click();
		 
		 
		 
	}
	
	public static void dealy(int time)
	{
		try {
			TimeUnit.SECONDS.sleep(time);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
            launchBrowser();
	}

}
