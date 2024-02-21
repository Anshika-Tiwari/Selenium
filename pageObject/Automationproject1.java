package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationproject1 {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id-'user-name']")).sendKeys("problem_user");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id-'checkout']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Anshika");
driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Tiwari");
driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("341056");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.close();
driver.quit();
}
}
