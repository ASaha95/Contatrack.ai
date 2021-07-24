package Cloudvision;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Vision_C
{
	String baseurl = "https://vision.hipla.io/#/";
	//String driverPath = "C:\\Users\\FNSPL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
	WebDriver driver;
	
  @Test
  public void generateBrowser() 
  {
	//  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\FNSPL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		System.out.print(driver.getTitle());
		driver.manage().window().maximize();
    /* System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get("http://65.1.141.121/#/");
      String expectedTitle = "Welcome: VisionCloud";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);*/
      //driver.close();
      
  }
      
      @Test(priority=1)
  	public void  WrongUsername() throws InterruptedException
  	{
    	  String at = driver.getTitle();
    		String et = "WrongLogin";
    		if (at.equalsIgnoreCase(et))
    		{
    
    		
    	     WebDriverWait Wait = new WebDriverWait(driver, 30);
    	
  		     driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("abhathi@gmail.com");
  		       driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("123456789");
  		    driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
  		
  		
  			       System.out.println("Test Successfull");
  			
  		}
  		else
  		{
  			
  			driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("abhathi@gmail.com");
  	  		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("123456789");
  	  		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
  			 
  	  		   System.out.println("Test Failure");
  		}
  		
  		
        
  		       Thread.sleep(30000);
  		         driver.navigate().refresh();
  	}
      @Test(priority=2)
    	public void  WrongPassword() throws InterruptedException 
      
      {
    	
    	  
    	   String at = driver.getTitle();
    		String et = "WrongLogin";
    		if (at.equalsIgnoreCase(et))
    		
    		{
    			
    		
    	     Thread.sleep(30000);
    	  driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("abhisathi1995@gmail.com");
    		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("123456");
    		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
    		
    		
      			System.out.println("Test Successfull");
      			
      		}
      		else
      		{
      			
      			driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("abhisathi1995@gmail.com");
        		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("123456");
        		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
      			   
        		   System.out.println("Test Failure");
      		}
      }
      
  	
     
      
   
      		
        
     @Test(priority=3)
    	public void  Login() throws InterruptedException
    	{
    	  Thread.sleep(30000);
    		driver.navigate().refresh();
    		
    		String at = driver.getTitle();
      		String et = "Login";
      		if (at.equalsIgnoreCase(et))
      		{


      		  Thread.sleep(20000);
        	  driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("abhisathi1995@gmail.com");
        		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("123456789");
        		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
          		
        		
          			System.out.println("Test Successfull");
          			
          		}
          		else
          		{
          			
          			 driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("abhisathi1995@gmail.com");
             		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("123456789");
             		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
          			  
             		  System.out.println("Test Failure");
          		}
          		
    		
    	  
    	}

    /* @Test(priority=6)
  	public void  DashboardPlanUpgrade() throws InterruptedException
  	{
    	  Thread.sleep(20000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[1]/div[2]/button")).click();
    	  
  		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div[2]/button[2]")).click();
  		Thread.sleep(20000);
  		driver.navigate().refresh();
  		
  	}*/      
    @Test(priority=4)
  	public void BIReportIFrame () throws InterruptedException
  	
    {
    	String at = driver.getTitle();
  		String et = "BIReportUpdate";
  		if (at.equalsIgnoreCase(et))
  		{
  	
  		
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          WebElement element = driver
  				.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input"));
  		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input")).sendKeys(
  				"https://app.powerbi.com/view?r=eyJrIjoiZTEwNDQ2YWEtZWY0My00ZTdiLWFhOWYtYzQ3YTNlMTU3NjA4IiwidCI6IjNmNmNkNzIxLTE2ZWQtNGQwZi1hMGRhLTY0YmQyM2I3MmRmNSJ9&pageName=ReportSection");
  		driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
  		
  		        System.out.println("Test Successfull");
  			
  		}
  		
  		else
  		{
  			
  			 WebElement element = driver
  	  				.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input"));
  	  		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input")).sendKeys(
  	  				"https://app.powerbi.com/view?r=eyJrIjoiZTEwNDQ2YWEtZWY0My00ZTdiLWFhOWYtYzQ3YTNlMTU3NjA4IiwidCI6IjNmNmNkNzIxLTE2ZWQtNGQwZi1hMGRhLTY0YmQyM2I3MmRmNSJ9&pageName=ReportSection");
  	  		driver.findElement(By.xpath("//button[contains(text(),'Save')]")); 
  			 
  	  		      System.out.println("Test Failure");
  		}
  	}
  	
  	@Test(priority=5)
  	public void DistanceandTimeMetrickandIFrameClear() throws InterruptedException
  	{
  		JavascriptExecutor js1 = (JavascriptExecutor) driver;
  		js1.executeScript("window.scrollBy(0,600)");
        
  		String at = driver.getTitle();
  		String et = "IFrameDistanceMetricTimeMetricUpdate";
  		if (at.equalsIgnoreCase(et))
  		{
  		

  		Thread.sleep(5000);
  		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[2]/button[2]")).click();

  		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
  		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[7]")).click();
  		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
  		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
  		
  		
  			System.out.println("Test Successfull");
  			
  		}
  		
  		else
  		{
  			
  			driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[2]/button[2]")).click();

  	  		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
  	  		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[7]")).click();
  	  		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
  	  		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
  	  		 
  			  System.out.println("Test Failure");
  		}
  	}
  	@Test(priority=6)
  	public void GeoFencingDisable() throws InterruptedException
  	{

  		JavascriptExecutor Js = (JavascriptExecutor) driver;
  		Js.executeScript("window.scrollBy(0,1200)");
  		Js.executeScript("console.log()");
  		Thread.sleep(30000);
  		// driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/label/span[1]/span[1]")).click();
  		
		
  		String at = driver.getTitle();
  		String et = "Geo Fencing Disable";
  		if (at.equalsIgnoreCase(et))
  		{
  		
  		driver.findElement(By.xpath(
  				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[4]/label[1]/span[1]/span[1]/input[1]"));
  	
  			System.out.println("Test Successfull");
  			
  		}
  		else
  		{
  			
  			driver.findElement(By.xpath(
  	  				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[4]/label[1]/span[1]/span[1]/input[1]"));
  	  	
  	  			
  			         System.out.println("Test Failure");
  		}
  	}
  	@Test(priority=7)
  	public void ClickOnSubmitButton() throws InterruptedException
  	{
  		String at = driver.getTitle();
  		String et = "Submit Button";
  		if (at.equalsIgnoreCase(et))
  		{
  		Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[4]/button")).click();
        
    	
  			System.out.println("Test Successfull");
  			
  		}
  		
  		else
  		{
  			 driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[4]/button")).click();
  	        
  			       System.out.println("Test Failure");
  		}
  	}
  	
  	@Test(priority=8)
  	public void GeoFencingEnable() throws InterruptedException
  	{

  		
  		Thread.sleep(30000);
  		String at = driver.getTitle();
  		String et = "Geo Fencing Enable";
  		if (at.equalsIgnoreCase(et))
  		{
  		
  		driver.findElement(By.xpath(
  				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[4]/label[1]/span[1]/span[1]/input[1]"))
  				.click();
  		
  		
  			System.out.println("Test Successfull");
  			
  		}
  		
  		else
  		{
  			System.out.println("Test Failure");
  		}
  	}
  	@Test(priority=9)
  	public void ClickOnSubmitButton1() throws InterruptedException
  	{
  		Thread.sleep(10000);
       
    	String at = driver.getTitle();
  		String et = "Click Submit Button";
  		if (at.equalsIgnoreCase(et))
  		{
  			driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[4]/button")).click();
  	    
  			System.out.println("Test Successfull");
  			
  		}
  		
  		else
  		{ 
  			driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[4]/button")).click();
  	    	
  			System.out.println("Test Failure");
  		}
  	}
  	
  	@Test(priority=10)
	public void ScroolDownToUP() throws InterruptedException
	{

		Thread.sleep(30000);
		
		String at = driver.getTitle();
  		String et = "Scroll Down To Up";
  		if (at.equalsIgnoreCase(et))
  		{
  			JavascriptExecutor js11 = (JavascriptExecutor) driver;
  			js11.executeScript("window.scrollBy(0,-3000)");
  			
  			System.out.println("Test Successfull");
  			
  		}
  		
  		else
  		{
  			JavascriptExecutor js11 = (JavascriptExecutor) driver;
  			js11.executeScript("window.scrollBy(0,-3000)");
  			
  			System.out.println("Test Failure");
  		}
		
	}
		
		@Test(priority=11)
		public void computervision() throws InterruptedException
		{
			Thread.sleep(30000);
	      
	      
	  	String at = driver.getTitle();
  		String et = "Computer Vision";
  		if (at.equalsIgnoreCase(et))
  		{
  			driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]")).click();
  	      
  			System.out.println("Test Successfull");
  			
  		}
  		
  		else
  		{
  			driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]")).click();
  	      
  			System.out.println("Test Failure");
  		}
  		
		}
		@Test(priority=12)
		public void AddCamera() throws InterruptedException
		{
	        
			String at = driver.getTitle();
	  		String et = "Add Camera";
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
			driver.findElement(By.xpath("//button[contains(text(),'+ ADD CAMERA')]")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/input")).sendKeys("hipla20000");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"))
					.sendKeys("Meeting");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
					.sendKeys("987699");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")).sendKeys("2");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("4");
			Thread.sleep(30000);
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")).click();
			Thread.sleep(30000);
			
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]"))
					.sendKeys("www.contatrack.ai/#/");
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			
			
	  		
	  			    System.out.println("Test Successfull");
	  			
	  		}
	  		else
	  		{
	  			driver.findElement(By.xpath("//button[contains(text(),'+ ADD CAMERA')]")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/input")).sendKeys("hipla20000");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"))
						.sendKeys("Meeting");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
						.sendKeys("987699");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")).sendKeys("2");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("4");
				Thread.sleep(30000);
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")).click();
				Thread.sleep(30000);
				
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]"))
						.sendKeys("www.contatrack.ai/#/");
				driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	  			 
				System.out.println("Test Failure");
	  		}
			
			
		}
		@Test(priority=13)
		public void AddCameraDuplicateEntery() throws InterruptedException
		{
            
			Thread.sleep(20000);
			
			String at = driver.getTitle();
	  		String et = "Duplicate Entry";
	  		if (at.equalsIgnoreCase(et))
	  		
	  		{
	  			
			
			
			driver.findElement(By.xpath("//button[contains(text(),'+ ADD CAMERA')]")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/input")).sendKeys("hipla20000");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"))
					.sendKeys("Meeting");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
			.sendKeys("9876");
	         driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")).sendKeys("2");
	          driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("4");
	          
	          Thread.sleep(30000);
	           driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")).click();
	          Thread.sleep(50000);

	           driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]"))
			      .sendKeys("https://contatrack.ai/camera");
	           driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	           driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
	           
	      
	  			 System.out.println("Test Successfull");
	  			
	  		}
	  		
	  		else
	  		{
	  			driver.findElement(By.xpath("//button[contains(text(),'+ ADD CAMERA')]")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/input")).sendKeys("hipla20000");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"))
						.sendKeys("Meeting");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
				.sendKeys("9876");
		         driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")).sendKeys("2");
		          driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("4");
		          
		          Thread.sleep(30000);
		           driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")).click();
		          Thread.sleep(50000);

		           driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]"))
				      .sendKeys("https://contatrack.ai/camera");
		           driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		           driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		           
	  			         System.out.println("Test Failure");
	  		}
		}
		@Test(priority=14)
		public void EmployeeDirectory() throws InterruptedException
		{

			
		Thread.sleep(20000);
			
			String at = driver.getTitle();
	  		String et = "Employee Directory";
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			driver.findElement(
						By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[1]/img[1]"))
						.click();
				
	  			     System.out.println("Test Successfull");
	  			
	  		}
	  		
	  		else
	  		{
	  			driver.findElement(
						By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[1]/img[1]"))
						.click();
				
	  			System.out.println("Test Failure");
	  		}
	  		 
	  		     Thread.sleep(20000);
			
	}
		
		
		
		@Test(priority=15)
		public void AddEmployee() throws InterruptedException
		{
			String at = driver.getTitle();
	  		String et = "Add User";
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
			
	        driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A Haque");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
					.sendKeys("abhishek1995@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("9748330781");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
					.sendKeys("EMP90");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]"))
					.sendKeys("QATester");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]"))
					.sendKeys("ITTTT");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]"))
					.click();
			Select abhishekyaer = new Select(
					driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			abhishekyaer.selectByValue("1995");
			Select abhishekmonth = new Select(
					driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			abhishekmonth.selectByValue("0");
			driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--009')]")).click();
			Select gender = new Select(driver.findElement(By.xpath("//*[@class='modal-input']//select")));
			gender.selectByIndex(1);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			//driver.findElement(By.xpath("//button[@class='close']")).click();
			
			
	  		
	  			         System.out.println("Test Successfull");
	  			
	  		}
	  		
	  		else
	  		{
	  		  driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A Haque");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
						.sendKeys("abhishek1995@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("9748330781");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
						.sendKeys("EMP90");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]"))
						.sendKeys("QATester");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]"))
						.sendKeys("ITTTT");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]"))
						.click();
				Select abhishekyaer = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
				abhishekyaer.selectByValue("1995");
				Select abhishekmonth = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
				abhishekmonth.selectByValue("0");
				driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--009')]")).click();
				Select gender = new Select(driver.findElement(By.xpath("//*[@class='modal-input']//select")));
				gender.selectByIndex(1);
				driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	  			         
				         System.out.println("Test Failure");
	  		}
	  		
	  		
	  		     Thread.sleep(20000);
			
}
		
		
		
		
		@Test(priority=16)
		public void EmaildDuplicateEntry() throws InterruptedException
		{
			String at = driver.getTitle();
	  		String et = "Email Id Dupllicate Entry";
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
			
	        driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A Haque");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
					.sendKeys("abhishek1995@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("801782740");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
					.sendKeys("EMP91");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]"))
					.sendKeys("QATester");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]"))
					.sendKeys("ITTTT");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]"))
					.click();
			Select abhishekyaer = new Select(
					driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			abhishekyaer.selectByValue("1995");
			Select abhishekmonth = new Select(
					driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			abhishekmonth.selectByValue("0");
			driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--009')]")).click();
			Select gender = new Select(driver.findElement(By.xpath("//*[@class='modal-input']//select")));
			gender.selectByIndex(1);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
			
			
	  			System.out.println("Test Successfull");
	  			
	  		}
	  		
	  		else
	  		{
	  		  driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A Haque");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
						.sendKeys("abhishek1995@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("801782740");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
						.sendKeys("EMP91");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]"))
						.sendKeys("QATester");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]"))
						.sendKeys("ITTTT");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]"))
						.click();
				Select abhishekyaer = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
				abhishekyaer.selectByValue("1995");
				Select abhishekmonth = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
				abhishekmonth.selectByValue("0");
				driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--009')]")).click();
				Select gender = new Select(driver.findElement(By.xpath("//*[@class='modal-input']//select")));
				gender.selectByIndex(1);
				driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
	  			System.out.println("Test Failure");
	  		}
			    Thread.sleep(20000);
}
		
		@Test(priority=20)
		public void EmployeeIDDuplicateEntry() throws InterruptedException
		{
			String at = driver.getTitle();
	  		String et = "Empliyee Id Duplicate Entry";
	  		if (at.equalsIgnoreCase(et))
	  		{
			
	        driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A Haque");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
					.sendKeys("asaha@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("9830150117");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
					.sendKeys("EMP90");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]"))
					.sendKeys("QATester");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]"))
					.sendKeys("ITTTT");
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]"))
					.click();
			Select abhishekyaer = new Select(
					driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			abhishekyaer.selectByValue("1995");
			Select abhishekmonth = new Select(
					driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			abhishekmonth.selectByValue("0");
			driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--009')]")).click();
			Select gender = new Select(driver.findElement(By.xpath("//*[@class='modal-input']//select")));
			gender.selectByIndex(1);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
			
		
	  			     System.out.println("Test Successfull");
	  			
	  		}
	  		
	  		else
	  		{
	  		   driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A Haque");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
						.sendKeys("asaha@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("9830150117");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
						.sendKeys("EMP90");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]"))
						.sendKeys("QATester");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]"))
						.sendKeys("ITTTT");
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]"))
						.click();
				Select abhishekyaer = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
				abhishekyaer.selectByValue("1995");
				Select abhishekmonth = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
				abhishekmonth.selectByValue("0");
				driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--009')]")).click();
				Select gender = new Select(driver.findElement(By.xpath("//*[@class='modal-input']//select")));
				gender.selectByIndex(1);
				driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
				
	  			 System.out.println("Test Failure");
	  		}
			
		}
		
		
           

			
		}
		



