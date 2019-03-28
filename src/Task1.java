import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rafiqayasini\\Documents\\selenium\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.dice.com/");
		driver.get("https://indeed.com/");
		
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.close();
		driver.quit();
		
		
		
		
	}
	
	
	

}
