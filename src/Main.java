import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rafiqayasini\\Documents\\selenium\\chromedriver.exe");
	
	ChromeDriver driver  = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.get("http://google.com");
	driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    String title=driver.getTitle();
    System.out.println(title);
    String url=driver.getCurrentUrl();
    System.out.println(url);
   driver.quit();
	}

}
