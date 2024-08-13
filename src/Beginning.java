import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Beginning {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//To Invoke Chrome Browser;
		//**DOWNLOAD NEW CHROMEDRIVER**
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Downloads\\chrome-win64\\new\\chrome-win64");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.close();

	}

}
