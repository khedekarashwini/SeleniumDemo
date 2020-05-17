package NewSampleProject.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic {
	
	private static  WebDriver driver=null;
	
	    public static final String APPLICATION_URL="https://demoqa.com/automation-practice-form/";
	    private static final String CHROME_DRIVER_KEY="webdriver.chrome.driver";
	    private static final String GECKO_DRIVER_KEY="webdriver.gecko.driver";
	    
	    enum SupportedBrowser
	    {
	    	
	    	FIREFOX,
			CHROME,
			INTERNETEXPLORER
	    }
	    
	    static
	    {
	    	System.setProperty(CHROME_DRIVER_KEY, "C:\\Chrome version jar\\chromedriver.exe");
		    System.setProperty(GECKO_DRIVER_KEY, "F:\\GikoDriverNewJar\\geckodriver.exe") ;
	    	
	    }
	   
	    
	    public static WebDriver launchBrowser(SupportedBrowser choice)
	    {
	    	
			
			switch (choice) {
			
			case CHROME:
				driver=new ChromeDriver();
				break;
				
			case FIREFOX:
				driver=new FirefoxDriver();
				break;
				

			default:
				System.out.println("No such Browser available");
				System.exit(0);
			}
			
			driver.manage().window().maximize();
			return driver;
			
	    	
	    }

}
