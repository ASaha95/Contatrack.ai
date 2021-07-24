package contatrack.ai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//public class production_contavision{

	public class production_contavision {
		public String baseurl = "http://65.1.141.121/#/";
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
			wait = new WebDriverWait(driver, 30);
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("123456789");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			Thread.sleep(30000);
			driver.get("http://35.154.116.78/#/");
			 driver.navigate().refresh();
			 
		}
		@Test(priority=3)
		public void NegativeloginPasswordBlank() throws InterruptedException
		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("asaha@gmail.com");
		    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("");
		     driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		     Thread.sleep(30000);
		     
		     driver.get("http://35.154.116.78/#/login");
			 driver.navigate().refresh();
			 
			 //Thread.sleep(30000);
		}
		@Test(priority=4)
		public void UsernameandPasswordBlank() throws InterruptedException
		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			Thread.sleep(30000);
		     
		     driver.get("http://35.154.116.78/#/login");
			 driver.navigate().refresh();
			 Thread.sleep(30000);
		}
		@Test(priority=5)
		public void EnterthewrongUsername() throws InterruptedException 
		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("as@gmail.com");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("123456789");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			Thread.sleep(30000);
		     
		     driver.get("http://35.154.116.78/#/login");
			 driver.navigate().refresh();
			 Thread.sleep(30000);
		}
		@Test(priority=6)
		public void EnterthewrongPassword() throws InterruptedException 
		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("asaha@gmail.com");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("1234567");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			Thread.sleep(30000);
		     
		     driver.get("http://35.154.116.78/#/");
			 driver.navigate().refresh();
		}
		
		@Test(priority=4)
		public void Positivelogin() throws InterruptedException
		{
			//wait = new WebDriverWait(driver, 30);
			
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("asaha@gmail.com");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("123456789");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		}
		@Test(priority=5)
		public void AttendanceSheet() throws InterruptedException
		{
			
			
			Thread.sleep(30000);
			 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[contains(text(),'Export CSV')]")).click();
	
	}

		@Test(priority=6)
		public void Insight() throws InterruptedException
		{
			Thread.sleep(30000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]/div[1]/span[1]")).click();
		}
		

		@Test(priority=7)
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
			WebElement Element = driver.findElement(By.xpath("//option[contains(text(),'012')]"));
			Element.click();
			//Select CameraID = new Select(Element);
			//CameraID.selectByVisibleText("Hipla_2");
		}
		

		@Test(priority=12)
		public void AddNewROI() throws InterruptedException
		
	
		{
			
			Thread.sleep(50000);
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/fieldset[1]/table[1]/tfoot[1]/tr[1]/th[1]/button[1]")).click();
		
			Thread.sleep(50000);
			driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/input[1]")).click();
		
	    	Thread.sleep(50000);
			WebElement Element = driver.findElement(By.xpath("//*[@id=\"image-mapper-table\"]/tbody/tr[2]/td/div[1]/div/select/option[2]"));
			Element.click();
			
			driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[2]/div[1]/input[1]")).sendKeys("ROIIIIIIII");
			
			Thread.sleep(50000);
		      driver.findElement(By.xpath("//*[@id=\"image-mapper-table\"]/tbody/tr[2]/td/div[2]/div[2]/select/option[3]"));
			
			
		/*	Thread.sleep(30000);
			driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/input[1]")).click();*/
			
			Thread.sleep(30000);
			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			
			
		}
		
		@Test(priority=13)
		public void ROICameraSelect() throws InterruptedException
		{
			Thread.sleep(50000);
			WebElement Element = driver.findElement(By.xpath("//option[contains(text(),'012')]"));
			Element.click();
		}
		
		@Test(priority=14)
		public void ClearROI() throws InterruptedException
		
		{
			Thread.sleep(50000);
			driver.findElement(By.xpath("//button[contains(text(),'Clear ROI')]")).click();
		}
		
		@Test(priority=15)
		public void ContaTracing() throws InterruptedException
		{
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[contains(text(),'ContaTracing')]")).click();
			
			
		}
		@Test(priority=16)
		public void BreachDataSelect() throws InterruptedException
		
		{
			
			WebElement element = driver.findElement(By.xpath("//select[@id='camera']"));
			Select days = new Select (element);
			days.selectByValue("14");
		}
		
		@Test(priority=17)
		public void ExportCSV() throws InterruptedException
		{
			driver.findElement(By.xpath("//button[contains(text(),'Export CSV')]")).click();
		}
		
} 
	

	
	
