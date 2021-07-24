package contatrack.ai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TESTNGpositiveproduction {
	public String baseurl = "https://contatrack.ai/#/";
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

	@Test(priority=1)
	public void login() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "Login";
	  		
	  		if (at.equalsIgnoreCase(et))
	  		{
	  		
	  		driver.findElement(By.xpath("//button[@class='sign-btn']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asaha@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

          System.out.println("Test Successfull");
		
		}
		
		
		else
		{
			driver.findElement(By.xpath("//button[@class='sign-btn']")).click();

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asaha@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

	         System.out.println("Test Faliure");
			
		}
	}
	@Test(priority=2)
	public void dashboard()
	
	{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "Dashboard";
	  		
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
	  		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='navbarDropdown']")));
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item']")));
		driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
		
		 System.out.println("Test Successfull");
			
			}
			
			
			else
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='navbarDropdown']")));
				driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item']")));
				driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
				     
				
				 System.out.println("Test Faliure");
				
				    
			}
	}
	@Test(priority = 3)
	public void Tracing() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "Tracing";
	  		
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
	  		
           driver.findElement(By.xpath("//a[@class='nav-item nav-link']")).click();
             System.out.println("Test Successfull");
			
			}
			
			
			else
			{
				 driver.findElement(By.xpath("//a[@class='nav-item nav-link']")).click();
				 System.out.println("Test Faliure");
					
			}
			
	}
	@Test(priority=4)
	public void exportstatus() throws InterruptedException
		{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "ExportStatus";
	  		
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
	  		
		       driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		          System.out.println("Test Successfull");
		
			}
			
			else
			{
				driver.findElement(
						By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
						.click();
				 System.out.println("Test Faliure");
					
			}
		}
	@Test(priority=5)
	public void Breachcsv() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "BreachCSV";
	  		
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
	  		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")));
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]"))
				.click();
              System.out.println("Test Successfull");
		
			}
			
			else
			{
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")));
				driver.findElement(By.xpath(
						"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]"))
						.click();
				 System.out.println("Test Faliure");
					
			}
	}
	@Test(priority=6)
	public void EmployeeDirectory() throws InterruptedException
	{
          
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "Employee Directory";
	  		
	  		if (at.equalsIgnoreCase(et))
	  		{
	  		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]")));
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]"))
				.click();
		                System.out.println("Test Successfull");
			
			}
			
			else
			{
				wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]")));
				driver.findElement(
						By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
						.click();

				driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]"))
						.click();
				        System.out.println("Test Faliure");
				
			}
			
		
			
	
	}
	@Test(priority=7)
	public void AddEmployee() throws InterruptedException
	{
		
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = " Add Employee";
	  		
	  		if (at.equalsIgnoreCase(et))
	  		{
	  		
		
        driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sourav Ganguly");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("abhishek.s@hipla.io");
		driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("6291919592");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
				.sendKeys("EMP100000");
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
		           System.out.println("Test Successfull");
			
			}
			
			else
			{
				  driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
					driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sourav Ganguly");
					driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
							.sendKeys("abhishek.s@hipla.io");
					driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("6291919592");
					driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
							.sendKeys("EMP100000");
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
					
					  System.out.println("Test Faliure");
			}
		
	}
	@Test(priority=8)
	public void computervision() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "Computer Vision";
	  		Thread.sleep(50000);
	  		if (at.equalsIgnoreCase(et))
	  		{
	  			
	  		
		     driver.findElement(By.xpath("//div[@id='wrapper']/div/div/div[2]/a[3]/img")).click();
		     System.out.println("Test Successfull");
				
			}
			
			else
			{
				driver.findElement(By.xpath("//div[@id='wrapper']/div/div/div[2]/a[3]/img")).click();
				  System.out.println("Test Faliure");
			}
	}
	@Test(priority=9)
	public void AddCamera() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "Add Camera";
	  		Thread.sleep(50000);
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
		Thread.sleep(50000);
		
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
				Thread.sleep(50000);
				
				driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]"))
						.sendKeys("www.contatrack.ai/#/");
				driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
				           
				         System.out.println("Test Faliure");
			}
		
		
	}

	@Test(priority=10)
	public void Dashboard() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 30);
		 String at = driver.getTitle();
	  		String et = "Dashboard";
	  		Thread.sleep(50000);
	  		if (at.equalsIgnoreCase(et))
	  		{
		     driver.findElement(By.xpath("//div[@id=\"wrapper\"]/div/div/div[2]/a[4]/img")).click();
		          System.out.println("Test Successfull");
			
			}
			
			else
			{
				 driver.findElement(By.xpath("//div[@id=\"wrapper\"]/div/div/div[2]/a[4]/img")).click();
				  System.out.println("Test Faliure");
			}
	}
	
	@Test(priority=11)
	public void BIReportIFrame () throws InterruptedException
	{
		String at = driver.getTitle();
  		String et = "BI Report IFrame";
  		Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
  			
  		       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver
				.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input"));
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input")).sendKeys(
				"https://app.powerbi.com/view?r=eyJrIjoiZTEwNDQ2YWEtZWY0My00ZTdiLWFhOWYtYzQ3YTNlMTU3NjA4IiwidCI6IjNmNmNkNzIxLTE2ZWQtNGQwZi1hMGRhLTY0YmQyM2I3MmRmNSJ9&pageName=ReportSection");
		         System.out.println("Test Successfull");
			
		}
		
		else
		{
			 WebElement element = driver
						.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input"));
				driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input")).sendKeys(
						"https://app.powerbi.com/view?r=eyJrIjoiZTEwNDQ2YWEtZWY0My00ZTdiLWFhOWYtYzQ3YTNlMTU3NjA4IiwidCI6IjNmNmNkNzIxLTE2ZWQtNGQwZi1hMGRhLTY0YmQyM2I3MmRmNSJ9&pageName=ReportSection");
		          
				 System.out.println("Test Faliure");
		}
  		
	}
	
	@Test(priority=12)
	public void DistanceandTimeMetrickandIFrameClear() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");

		
           Thread.sleep(5000);
           String at = driver.getTitle();
     		String et = "Distance and Time Metrickand IFrame Clear";
     		Thread.sleep(50000);
     		if (at.equalsIgnoreCase(et))
     		{
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[2]/button[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
		  System.out.println("Test Successfull");
			
    		}
    		
    		else
    		{
    			driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[2]/button[2]")).click();

    			driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
    			driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();
    			driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
    			driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
    			
    			System.out.println("Test Faliure");
    		}
	}
	@Test(priority=13)
	public void GeoFencingDisable() throws InterruptedException
	{

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,1200)");
		Js.executeScript("console.log()");
		Thread.sleep(30000);
		// driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/label/span[1]/span[1]")).click();
		 String at = driver.getTitle();
  		String et = " Geo Fencing Disable";
  		Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[4]/label[1]/span[1]/span[1]/input[1]"))
				.click();
		   System.out.println("Test Successfull");
			
		}
		
		else
		{
			driver.findElement(By.xpath(
					"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[4]/label[1]/span[1]/span[1]/input[1]"))
					.click();
			System.out.println("Test Faliure");
		}
	}
	@Test(priority=14)
	public void ClickOnSubmitButton() throws InterruptedException
	{
		String at = driver.getTitle();
  		String et = "Click On Submit Button";
  		Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
  			
  		
      driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/button")).click();
  	
	   System.out.println("Test Successfull");
		
	}
	
	else
	{
	    driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/button")).click();
	  	
		System.out.println("Test Faliure");
	}
	
	}
	
	
	@Test(priority=15)
	public void ScroolDownToUP() throws InterruptedException
	{

		Thread.sleep(30000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(0,-3000)");
	}

		
	@Test(priority=16)
	public void ClickOnAnalytics() throws InterruptedException 
	{
		String at = driver.getTitle();
  		String et = " Click On Analytics";
  		Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		
  			driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[5]")).click();
		

		   System.out.println("Test Successfull");
			
		}
		
		else
		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[5]")).click();
			

			System.out.println("Test Faliure");
		}
	}
	@Test(priority=17)
	public void SelectOnPrimaryContact() throws InterruptedException
	{
		String at = driver.getTitle();
  		String et = "Select On Primary Contac";
  		Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		
		driver.findElement(By.xpath("//div[@id='demo-simple-select-outlined']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")));
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
		  System.out.println("Test Successfull");
			
				}
				
				else
				{
					driver.findElement(By.xpath("//div[@id='demo-simple-select-outlined']")).click();
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")));
					driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
					  
					System.out.println("Test Faliure");
				}
	}
	@Test(priority=18)
	public void SelectOnSecondaryContact() throws InterruptedException
	{
		String at = driver.getTitle();
  		String et = "Select On Primary Contac";
  		//Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")));
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")).click();
		  System.out.println("Test Successfull");
			
		}
		
		else
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")));
			driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")).click();
			System.out.println("Test Faliure");
	}

	}
	
	
	@Test(priority=19)
	public void Continouslistdatadownloadd() throws InterruptedException
	{
		Thread.sleep(50000);
		String at = driver.getTitle();
  		String et = " Continous list data download";
  		//Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]"))
				.click();
		  System.out.println("Test Successfull");
			
				}
				
				else
				{
					driver.findElement(
							By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]"))
							.click();
					System.out.println("Test Faliure");
						
				}
	}
	@Test(priority=20)
	public void DropdownSelect() throws InterruptedException
	{
		Thread.sleep(50000);
		String at = driver.getTitle();
  		String et = " Dropdown Select";
  		//Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{

		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item'][1]")));
		driver.findElement(By.xpath("//a[@class='dropdown-item'][1]")).click();
		
		  System.out.println("Test Successfull");
			
				}
				
				else
				{
				    
					driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item'][1]")));
					driver.findElement(By.xpath("//a[@class='dropdown-item'][1]")).click();
					
					System.out.println("Test Faliure");
				}
	}
	@Test(priority=21)
	public void ChangePassword() throws InterruptedException
	{
		String at = driver.getTitle();
  		String et = " Change Password";
  		//Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/div[2]/input"))
				.sendKeys("123456789");
		 System.out.println("Test Successfull");
			
		}
		
		else
		{
			driver.findElement(By.xpath(
					"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
					.sendKeys("123456789");
			driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/div[2]/input"))
					.sendKeys("123456789");
			
			System.out.println("Test Faliure");
		}
	
	}
	@Test(priority=22)
	public void Clickonupdatebutton() throws InterruptedException
	{

		String at = driver.getTitle();
  		String et = "Click on update button";
  		//Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		 driver.findElement(By.xpath("//button[contains(text(),'update')]")).click();
		 System.out.println("Test Successfull");
			
		}
		
		else
		{
			 driver.findElement(By.xpath("//button[contains(text(),'update')]")).click();
			 System.out.println("Test Faliure");
		}
				
			
		}
	
	@Test(priority=23)
	public void GuidePage() throws InterruptedException
	{
		String at = driver.getTitle();
  		String et = " Guide Page";
  		//Thread.sleep(50000);
  		if (at.equalsIgnoreCase(et))
  		{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Guide')]")).click();
		 System.out.println("Test Successfull");
			
		}
		
		else
		{
			driver.findElement(By.xpath("//span[contains(text(),'Guide')]")).click();
			 System.out.println("Test Faliure");
		}
	}
	@Test(priority=24)
	public void EnterTheAllDetails() throws InterruptedException
	{

		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[1]/div/div[1]/div/input"))
				.sendKeys("Abhishek Saha");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("abhisheksaha759@gmail.com");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("9748330781");
	}
	@Test(priority=25)
	public void ClickOnTheSubmitButton() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,300)");
		Js1.executeScript("console.log()");

		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[5]/button")).click();
	}
	@Test(priority=26)
	public void ClickOnTheSuccessfullMessageOkButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
	}
	@Test(priority=27)
	public void EnterTheContactUsPage() throws InterruptedException
	{

		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]")).click();
	}
	@Test(priority=28)
	public void BlogPage() throws InterruptedException
	{

		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
	}
	@Test(priority=29)
	public void ClickOnThePricingPage() throws InterruptedException
	{

		driver.findElement(By.xpath("//*[@id=\"banner\"]/div/div/button[4]")).click();
	}
	
	@Test(priority=30)
	public void PricingPageScrollUpToDown() throws InterruptedException
	{
			Thread.sleep(50000);
		JavascriptExecutor Js11 = (JavascriptExecutor) driver;
		Js11.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
	}
	@Test(priority=31)
	public void ClickOnSignupPage() throws InterruptedException
	{
		WebElement button = driver.findElement(By.xpath("//*[contains(text(), 'Join the waitlist')]"));
        button.click();
	}
	@Test(priority=32)
	public void EnterTheDetails() throws InterruptedException
	{

		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
				.sendKeys("cctv@gmail.com");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
				.sendKeys("HiHipla");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
				.sendKeys("hipla.io");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]"))
				.sendKeys("9748330781");

		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]")).click();

		WebElement country = driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]"));
		Select Country = new Select(country);
		Country.selectByIndex(18);
	}
	@Test(priority=33)
	public void ClickTheSubmitButton() throws InterruptedException
	{

		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}
	@Test(priority=34)
	public void SucesfullMessage() throws InterruptedException
	{
		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
	}
	@Test(priority=35)
	public void ClickOnSignButton() throws InterruptedException
	{

		driver.findElement(By.xpath("//button[@class='sign-btn']")).click();
	}
	@Test(priority=36)
	public void ClickOnForgetPasswordOption() throws InterruptedException
	{
		Thread.sleep(20000);

		driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
	}
	@Test(priority=37)
	public void EnterTheEmail() throws InterruptedException
	{
		driver.findElement(By
				.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
				.sendKeys("singtel325@gmail.com");
	}
	@Test(priority=38)
	public void SubmitButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
	}
	@Test(priority=39)
	public void WaitForTheForgotPasswordButton() throws InterruptedException
	{
		Thread.sleep(20000);
	}
	@Test(priority=40)
	public void RedirectToTheHomePage() throws InterruptedException
	{
		driver.get("https://contatrack.ai/#/");
		driver.navigate().refresh();
	}

		


@AfterTest
public void endsession() {
	
	driver.quit();
}
}
