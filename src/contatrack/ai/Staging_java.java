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

public class Staging_java {

	private static final WebElement countryDrpDwn = null;
	private static String text;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\FNSPL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.6.160.216/#/");
		System.out.print(driver.getTitle());
		driver.manage().window().maximize();

		// driver.close();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.findElement(By.xpath("//button[@class='sign-btn']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asaha@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='navbarDropdown']")));

		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item']")));
		driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();

		driver.findElement(By.xpath("//a[@class='nav-item nav-link']")).click();
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")));
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]"))
				.click();

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]")));
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[2]/img[1]"))
				.click();

		driver.findElement(By.xpath("//button[contains(text(),'+ ADD EMPLOYEE')]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sourav Ganguly");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("sathisaha.job@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = '1 (702) 123-4567']")).sendKeys("9874812692");

		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
				.sendKeys("EMP98");
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]/span[1]/*[1]"))
				.click();

		driver.findElement(By.xpath("//div[@id='wrapper']/div/div/div[2]/a[3]/img")).click();

		driver.findElement(By.xpath("//button[contains(text(),'+ ADD CAMERA')]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/input")).sendKeys("Came9990");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"))
				.sendKeys("Meeting");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"))
				.sendKeys("9876");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")).sendKeys("2");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("4");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]"))
				.sendKeys("https://contatrack.ai/camera");
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		driver.findElement(By.xpath("//div[@id=\"wrapper\"]/div/div/div[2]/a[4]/img")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input"));
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/input")).sendKeys(
				"https://app.powerbi.com/view?r=eyJrIjoiZTEwNDQ2YWEtZWY0My00ZTdiLWFhOWYtYzQ3YTNlMTU3NjA4IiwidCI6IjNmNmNkNzIxLTE2ZWQtNGQwZi1hMGRhLTY0YmQyM2I3MmRmNSJ9&pageName=ReportSection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		/*
		 * WebDriverWait wait3 = new WebDriverWait(driver, 10);
		 * wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//button[contains(text(),'Save')]"))); driver.findElement(By.xpath(
		 * "//button[contains(text(),'Save")).click();
		 */

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]")).click();
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Js.executeScript("console.log()");
		Thread.sleep(50000);
		// driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/label/span[1]/span[1]")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[5]/label[1]/span[1]/span[1]/input[1]"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[5]/button")).click();

		Thread.sleep(30000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-3000)");

		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//button[contains(text(),'Upgra")));
		 * driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/dide')]")));
		 * driver.findElement(By.xpath("//button[contains(text(),'Upgrade')]")).click();
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//option[contains(text(),'Enterprise')]")));
		 * driver.findElement(By.xpath("//option[contains(text(),'Enterprise')]")).click
		 * ();
		 * driver.findElement(By.xpath("//button[contains(text(),'UPGRADE')]")).click();
		 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
		 * "//div[@class-MuiAlert-message]")));
		 */

		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[1]/div[2]/a[5]")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//div[@id='demo-simple-select-outlined']")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")));
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")));
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div[1]/div/a")).click();
		Thread.sleep(50000);
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]"))
				.click();

		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item'][1]")));
		driver.findElement(By.xpath("//a[@class='dropdown-item'][1]")).click();

		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/div[2]/input"))
				.sendKeys("123456789");
		driver.findElement(By.xpath("//button[contains(text(),'update')]")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Guide')]")).click();

		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[1]/div/div[1]/div/input"))
				.sendKeys("Abhishek Saha");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("abhisheksaha759@gmail.com");
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("9748330781");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,300)");
		Js1.executeScript("console.log()");

		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[5]/button")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();

		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]")).click();

		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();

		driver.findElement(By.xpath("//*[@id=\"banner\"]/div/div/button[4]")).click();
		Thread.sleep(3000);
		JavascriptExecutor Js11 = (JavascriptExecutor) driver;
		Js11.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//*[contains(text(), 'Join the waitlist')]"));

		button.click();

		driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
				.sendKeys("ADsaha@gmail.com");
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
		/*
		 * driver.findElement(By .xpath(
		 * "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]/option[15]"
		 * )) .click();
		 */

		WebElement country = driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]"));
		Select Country = new Select(country);
		Country.selectByIndex(18);

		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();

		driver.findElement(By.xpath("//button[@class='sign-btn']")).click();
		Thread.sleep(12000);

		driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
		driver.findElement(By
				.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
				.sendKeys("asaha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/form/button")).click();
		Thread.sleep(12000);
		driver.get("http://3.6.160.216/#/");
		driver.navigate().refresh();

	}

}
