import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamQuestion1Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Sridipta\\softwares\\JARs\\chromedriver_win32\\chromedriver.exe");
		String url = "http://demo.guru99.com/v4/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name = 'uid']")).sendKeys("mngr181268");
		//WebElement element1 = driver.findElement(By.)
		
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("burUned");
		driver.findElement(By.xpath("input[@type= submit]")).click();
		
		
		

	}

}
