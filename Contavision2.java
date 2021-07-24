import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contavision2{

	public class Contavision_Web_2 {
		public String baseurl = "http://3.6.160.216/#/";
		public WebDriver driver;
		public WebDriverWait wait;


		@BeforeTest
		public void generateBrowser()
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\FNSPL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(baseurl);
			System.out.print(driver.getTitle());
			driver.manage().window().maximize();
		}
		@Test(priority=2)
		public void NegativeloginUsernameBlank() throws InterruptedException
		
		{
			
			 String at = driver.getTitle();
		  		String et = "WrongLogin";
		  		if (at.equalsIgnoreCase(et))
		  		{
		  		 wait = new WebDriverWait(driver, 30);
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("1234567");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		  		
			        System.out.println("Test Successfull");
		  		
		  		}
		  		
		  		
		  		else
		  		{
		  			
		  			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("");
					driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("1234567");
					driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		  			
					 System.out.println("Test Failure");
		  		}
		  		Thread.sleep(30000);
				driver.get("http://3.6.160.216/#/login");
				 driver.navigate().refresh();
				 
		}
				 
		  		
		  		
		
			 
		}
		@Test(priority=3)
		public void NegativeloginPasswordBlank() throws InterruptedException
		
		
		
		{
			
			 WebDriver driver = null;
			String at = driver.getTitle();
		  		String et = "WrongLogin";
		  		
		  		if (at.equalsIgnoreCase(et))
		       {
			    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("demo@hipla.io");
		        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("");
		        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		       //  Thread.sleep(30000);
		         
		         System.out.println("Test Successfull");
			  		
		  		}
		  		
		  		else
		  		{
		  			
		  			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("demo@hipla.io");
			        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("");
			        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		  			 
			         System.out.println("Test Failure");
		  		}
		  		
		          Thread.sleep(30000);
		          driver.get("http://3.6.160.216/#/login");
			       driver.navigate().refresh();
			 
		
			 
			 
			 //Thread.sleep(30000);
		}
		
		
		
		
		
		
		@Test(priority=4)
		public void Positivelogin() throws InterruptedException
		{
			//wait = new WebDriverWait(driver, 30);
			
			 WebDriver driver = null;
				String at = driver.getTitle();
			  		String et = "Positive Login";
			  		if (at.equalsIgnoreCase(et))
			  		{
			
			           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("demo@hipla.io");
			           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("1234567");
			           driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			           
			               System.out.println("Test Successfull");
				  		
			  		}   
			  		
			  		else
			  		{
			  			   System.out.println("Test Failure");
			  		}
			
			           Thread.sleep(30000);
			
			
		
		}
		
		
		@Test(priority=5)
		public void SwitchMode() throws InterruptedException 
		 
		{
			 WebDriver driver = null;
				String at = driver.getTitle();
			  		String et = "Switch Mode";
			  		
			  		if (at.equalsIgnoreCase(et))
			  		{
			  			
			           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[1]/ul[2]/label[1]/div[1]/div[3]/i[1]")).click();
			              // Thread.sleep(30000);
			               
			               System.out.println("Test Successfull");
					  		
			  		}   
			  		
			  		else
			  		{
			  			
			  			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("demo@hipla.io");
				        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("");
				        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			  			  
				         System.out.println("Test Failure");
			  		}
			
	  		           Thread.sleep(30000);
		}
		
	
		@Test(priority=6)
		public void AttendanceSheetExportCSV() throws InterruptedException
		{
			 WebDriver driver = null;
				String at = driver.getTitle();
			  		String et = "Export CSV";
			  		
			  		if (at.equalsIgnoreCase(et))
			  		{
			
			          driver.findElement(By.xpath("//button[contains(text(),'Export CSV')]")).click();
			
			           // Thread.sleep(30000);
			
			         System.out.println("Test Successfull");
	  			
	  		     	}
	  		     else
	  		       {
	  		    	 
	  		    	driver.findElement(By.xpath("//button[contains(text(),'Export CSV')]")).click();
	  				
	  			       System.out.println("Test Failure");
	  		       }
	  		             Thread.sleep(30000);
		}
	
		@Test(priority=7)
		public void Roi() throws InterruptedException
		{
			 WebDriver driver = null;
			String at = driver.getTitle();
			String et = "Roi";
			
			if (at.equalsIgnoreCase(et))
			{
				
			  driver.findElement(By.xpath("//span[contains(text(),'Region of Interest')]")).click();
			
	  			System.out.println("Test Successfull");
	  			
	  			
	  		}
	  		else
	  		{
	  			System.out.println("Test Failure");
	  		}
					
			
		}
		
		/*@Test(priority=10)
		public void RoiCamreSelect() throws InterruptedException
		{
			driver.findElement(By.xpath(""))
		}





			
		
		
		

		/*@Test(priority=7)
		public void SelectRestrictedZoneAccess() throws InterruptedException
		{
			Thread.sleep(30000);
			WebElement Element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/select[1]"));
			Select Graph = new Select(Element);
			Graph.selectByValue("2");
		}
		
		@Test(priority=8)
		public void SelectSpeedDetection() throws InterruptedException
		{
			Thread.sleep(30000);
			WebElement Element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/select[1]"));
			Select Graph = new Select(Element);
			Graph.selectByValue("3");
		}
		
		@Test(priority=9)
		public void SelectOccupancyMonitor() throws InterruptedException
		{
			Thread.sleep(30000);
			WebElement Element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/select[1]"));
			Select Graph = new Select(Element);
			Graph.selectByValue("1");
		}
		@Test(priority=10)
		public void ROI() throws InterruptedException
		{
			Thread.sleep(30000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/div[1]")).click();
		}
		
		@Test(priority=11)
		public void ROISelectCamera() throws InterruptedException
		{
			Thread.sleep(30000);
			WebElement Element = driver.findElement(By.xpath("//option[contains(text(),'Hipla_2')]"));
			Element.click();
			//Select CameraID = new Select(Element);
			//CameraID.selectByVisibleText("Hipla_2");
		}
		

		@Test(priority=12)
		public void AddROI() throws InterruptedException
		
	
		{
			
			Thread.sleep(20000);
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/fieldset[1]/table[1]/tfoot[1]/tr[1]/th[1]/button[1]")).click();
		
		
		
	    	Thread.sleep(20000);
			WebElement Element = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/select[1]/option[3]"));
			Element.click();
			
			driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).sendKeys("Test");
			
			Thread.sleep(20000);
			WebElement Element1 = driver.findElement(By.xpath("//tbody/tr[2]/td[4]/select[1]/option[3]"));
			Element.click();
			
			Thread.sleep(20000);
			driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/input[1]")).click();
			
			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			
			
		}*/

	
}


	

