package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abcd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=ahd48lagagid2");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.name("remember")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name='usersSelector.selectedUser']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content users_selected selected']//descendant::div[@class='label']")).click();
	}
}
