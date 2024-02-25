package SwagLabs.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Loginpage
{

	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("Webdriver.chrome.driver","C:\\Users\\as\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//"C:\\Users\\as\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe";

		WebDriver driver = new ChromeDriver();

		System.out.println("chrome browser is opened");
		driver.manage().window().maximize();

		System.out.println("browser is maximized");
		driver.get("https://www.saucedemo.com/");

		System.out.println("url is opened");

	PomClass lp = new PomClass (driver);


		lp.sendusername();

		System.out.println("username is send");


		lp.sendpassword();
		System.out.println("password is send");


		lp.ClickLoginBtn();
		System.out.println("click on login btn");


		System.out.println("went on home page");


		String giventitle = "Swag Labs";

		String actualtitle = driver.getTitle();

		Assert.assertEquals(giventitle,actualtitle,"title does not match");


		Thread.sleep(5000);

		driver.close();

		System.out.println("browser is closed");

		System.out.println("end of program");

	}
}

