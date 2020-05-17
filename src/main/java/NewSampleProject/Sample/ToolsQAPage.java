package NewSampleProject.Sample;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import NewSampleProject.Sample.Generic.SupportedBrowser;

public class ToolsQAPage {
	
	@Test
	public void testPage()
	{
		
		WebDriver driver=Generic.launchBrowser(SupportedBrowser.CHROME);
		
		driver.get(Generic.APPLICATION_URL);
		
		WebElement fname=driver.findElement(By.name("firstname"));
		  fname.sendKeys("Ashwini");
		  
	 WebElement Lastname=driver.findElement(By.id("lastname"));
	     Lastname.sendKeys("Khedekar");
	     
	     String whichGender="Female";
	     List<WebElement> genderType=driver.findElements(By.name("sex"));
	       System.out.println("Gender size="+genderType.size());
	       
	       for (WebElement gender : genderType) {
	    	   
	    	   if(gender.getAttribute("Value").equals(whichGender));
	    	   {
	    		   gender.click();
	    		   break;
	    	   }
		}
		  
		
		  String year="2";
		  List<WebElement> yearOfExpe=driver.findElements(By.name("exp"));
		      for (WebElement webElement : yearOfExpe) {
		    	  
		    	  if (webElement.getAttribute("value").equals(year)) {
		    		  
		    		  webElement.click();
					break;
				}
				
			}
		  
		WebElement datepicker=driver.findElement(By.id("datepicker"));
		   datepicker.sendKeys("5/05/2020");
		   
		   List<String> profValue= new ArrayList<String>();
		   profValue.add("Manual Tester");
		   profValue.add("Automation Tester");
		   List<WebElement> profs=driver.findElements(By.name("profession"));
		  
		   for(String val:profValue)
		   {
			   for (WebElement prfs : profs) {
				   
				   if (prfs.getAttribute("value").equals(val)) {
					   
					   prfs.click();
					    break;
				}
				
			}
			   
		   }
		
		  /* List<WebElement> autotool=driver.findElements(By.name("tool"));
		   
		   List<String> toolval=new ArrayList<String>();
		   toolval.add("Selenium IDE");
		   toolval.add("QTP");
		   for (String string : toolval) {
			   
			   for (WebElement webele: autotool) {
				   
				   if (webele.getAttribute("value").equals("tool")) {
					   
					   webele.click();
					   break;
				}
				
			}
			
		}*/
		   
		   
		   List<WebElement> autoTools = driver.findElements(By.name("tool"));

			List<String> toolvalues = new ArrayList<String>();
			toolvalues.add("QTP");
			toolvalues.add("Selenium Webdriver");

			for (String tool : toolvalues) {//2
				for (WebElement webtl : autoTools) {//3		--- 
					if(webtl.getAttribute("value").equals(tool)) {
						webtl.click();
						break;
					}
				}
			}  
		   
		   Select select=new Select(driver.findElement(By.id("continents")));
		     // select.selectByVisibleText("Europe");
		  // select.selectByIndex(4);
		   select.selectByValue("AF");
		   
		   
		   System.out.println("multichoice");
			WebElement mulContients = driver.findElement(By.id("continentsmultiple"));
			Select mulChoiceDropdwn = new Select(mulContients);
			mulChoiceDropdwn.selectByVisibleText("South America"); //end user -- always -- present
			mulChoiceDropdwn.selectByVisibleText("North America");//
			mulChoiceDropdwn.selectByVisibleText("Antarctica");//
			
			List<WebElement> lst=mulChoiceDropdwn.getOptions();
			int count=lst.size();
			for (int i=0;i<count;i++) {
				
				System.out.println(lst.get(i).getText());
			}
			
	}

}
