package contatrack.ai;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class production_webnegative {

	private static final WebElement countryDrpDwn = null;
	private static String text;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TestCase1 - " URl Hit On Browser"
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\FNSPL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://contatrack.ai/#/");
		System.out.print(driver.getTitle());
		driver.manage().window().maximize();

		// driver.close();
        
		// TestCase2 - "Login"
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.findElement(By.xpath("//button[@class='sign-btn']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asaha@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//TestCase3 - "Naver Dropdown option selection"

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='navbarDropdown']")));
        driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
        
       // TestCase4 - "If click on the dashboard option then Insight page will be open"

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item']")));
		driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
		
		//TestCase5 - "If Click on the Tracing option then all breaches data should be shown"

		driver.findElement(By.xpath("//a[@class='nav-item nav-link']")).click();
		
		//TestCase6 - "If Click on the Export APP Status option then CSV will be  Download"
		
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		
		//TestCase7 - "All Breaches Data CSV Downloads"
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")));
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]"))
				.click();
		
		//TestCase8 - "If Click on the Employee Directory option then directory option should be shown"
		
         wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]")));
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]"))
				.click();
		
		//TestCase9 - "Add Employee/Add User - If User already exists then error message should be given proper and autometacally to the next page"

		driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sourav Ganguly");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("sathidawn5@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("9051257928");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
				.sendKeys("EMP021");
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
		driver.findElement(By.xpath("//button[@class='close']")).click();
		
		
		//TestCase10 -"Click on the add camera option"

		driver.findElement(By.xpath("//div[@id='wrapper']/div/div/div[2]/a[3]/img")).click();
		
		//TestCase11 - "Camera Added - If Camera Id is not unique and click on the add button then error meessage should be given properly"
		
		driver.findElement(By.xpath("//button[contains(text(),'+ ADD CAMERA')]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/input")).sendKeys("Camera99");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"))
				.sendKeys("Meeting");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
				.sendKeys("9876");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")).sendKeys("2");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("4");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]"))
				.sendKeys("https://contatrack.ai/camera");
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		driver.findElement(By.xpath("//button[@class='close']")).click();
		
		//TestCase12 -"Click On The Dashoboard Option"
		
        driver.findElement(By.xpath("//div[@id=\"wrapper\"]/div/div/div[2]/a[4]/img")).click();
        
        //TestCase13 -"click on the BI tool Iframe option and input the power BI Report Link"

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input"));
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input")).sendKeys(
				"https://app.powerbi.com/view?r=eyJrIjoiZTEwNDQ2YWEtZWY0My00ZTdiLWFhOWYtYzQ3YTNlMTU3NjA4IiwidCI6IjNmNmNkNzIxLTE2ZWQtNGQwZi1hMGRhLTY0YmQyM2I3MmRmNSJ9&pageName=ReportSection");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");

		/*
		 * WebDriverWait wait3 = new WebDriverWait(driver, 10);
		 * wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//button[contains(text(),'Save')]"))); driver.findElement(By.xpath(
		 * "//button[contains(text(),'Save")).click();
		 */

		Thread.sleep(5000);
		
		//TestCase14 -"When I click on the clear button then BI Link should be clear"
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[2]/button[2]")).click();
		
		//TestCase15 -"Distance Metric Select"

		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();
		
		//TestCase16 -"Time Metric Select"
		
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
		
		//TestCase17 - "Geo Fencing Disable & Enable"

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,1200)");
		Js.executeScript("console.log()");
		Thread.sleep(30000);
		// driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/label/span[1]/span[1]")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[5]/label[1]/span[1]/span[1]/input[1]"))
				.click();
		//TestCase18 - "Click On the Submit Button"

		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/button")).click();
		
		//TestCase19 -"Scroll Down to Up"

		Thread.sleep(30000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(0,-3000)");

		/*
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		  "//button[contains(text(),'Upgra")));
		  driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/dide')]")));
		  driver.findElement(By.xpath("//button[contains(text(),'Upgrade')]")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//option[contains(text(),'Enterprise')]")));
		  driver.findElement(By.xpath("//option[contains(text(),'Enterprise')]")).click
		  ();
		  driver.findElement(By.xpath("//button[contains(text(),'UPGRADE')]")).click();
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
		  "//div[@class-MuiAlert-message]")));
		 */
          
		//TestCase20 -"Click On the Analytics button"
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[5]")).click();
		
		//TestCase21 -"Select The Primary Contact"

		Thread.sleep(50000);
		driver.findElement(By.xpath("//div[@id='demo-simple-select-outlined']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")));
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
		
		//TestCase22 -"Select The Secondary Contact"
		
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")));
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")).click();
		
		//TestCase23 -"Continuously Breach Data CSV Download"
		Thread.sleep(50000);
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]"))
				.click();
		
        //TestCase24 -"Naver dropdown option selection"
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		
		//TestCase25 -"Click on the change password option"
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item'][1]")));
		driver.findElement(By.xpath("//a[@class='dropdown-item'][1]")).click();
		
		//TestCase26 -"Enter the new password and confirm password"

		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/div[2]/input"))
				.sendKeys("123456789");
		
		//TestCase27 -"Click on the update button"
		driver.findElement(By.xpath("//button[contains(text(),'update')]")).click();
		
		//TestCase28 -"Click On the guide page "

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Guide')]")).click();
		
       // TestCase29 - "Enter the all details"
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[1]/div/div[1]/div/input"))
				.sendKeys("Abhishek Saha");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("abhisheksaha759@gmail.com");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("9748330781");
		
		//TestCase30 -"Click On the submit button"
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,300)");
		Js1.executeScript("console.log()");

		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[5]/button")).click();
		
		//TestCase31 -"Successfull Message will be shown and click on the OK options"
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		
		//TestCase32 -"Click On the contact us options"

		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]")).click();
		
		//TestCase33 -"Click On the Blog options"

		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
		
		//TestCase34 -"Click On the pricing options"

		driver.findElement(By.xpath("//*[@id=\"banner\"]/div/div/button[4]")).click();
		
		//TestCase35 -"Scroll up to down"
		Thread.sleep(50000);
		JavascriptExecutor Js11 = (JavascriptExecutor) driver;
		Js11.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		
		//TestCase36 -"Click On the join the waitlist button"
		WebElement button = driver.findElement(By.xpath("//*[contains(text(), 'Join the waitlist')]"));
         button.click();
         
         //TestCase37 -"Enter the all company details" -"If Email Id is exists then error message should be given properly"

		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
				.sendKeys("abcdef@gmail.com");
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

		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[3]/button[1]/span[1]/*[1]")).click();

		//TestCase38 -"Click On the sign in button"
		
		driver.findElement(By.xpath("//button[@class='sign-btn']")).click();
		Thread.sleep(12000);
        
		//TestCase39 -"Click On the forgot password button"
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
		driver.findElement(By
				.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
				.sendKeys("asaha@gmail.com");
		//TestCase40 -"Click On the submit button"
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
		//TestCase41 - "Redirect to the home page"
		Thread.sleep(12000);
		driver.get("https://contatrack.ai/#/");
		driver.navigate().refresh();

	}

}
