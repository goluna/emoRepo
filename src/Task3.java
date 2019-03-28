import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rafiqayasini\\Documents\\selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://www.rediff.com");
        
        String title = driver.getTitle();
        
        if(title .contains("cumputer")) {
        System.out.println("verified");
        
        }else {
        	 System.out.println("Not verefied");
         }
        driver.quit();
        
	}

}
