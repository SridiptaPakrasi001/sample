import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamQuestion2Submitpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Sridipta\\softwares\\JARs\\chromedriver_win32\\chromedriver.exe");
		String url = "http://demo.guru99.com/v4/manager/Managerhomepage.php";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shylaja Bhaskaran");
		driver.findElement(By.xpath("//input[@value= 'f']")).click();
		driver.findElement(By.xpath("//input[@name = 'dob']")).sendKeys("04/03/1981");
		driver.findElement(By.xpath("//input[@name = 'addr']")).sendKeys("Kanakanagar");
		driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name = 'pinno']")).sendKeys("560032");
		driver.findElement(By.xpath("//input[@name = 'telephoneno']")).sendKeys("15567");
		driver.findElement(By.xpath("//input[@name = 'emailid']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("8jkadhaskjd");
		//driver.findElement(By.xpath("//input[@name = 'sub']")).click();
	}
}
