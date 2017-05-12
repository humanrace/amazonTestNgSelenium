import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by pfokin on 12.05.2017.
 */

public class amazonTestIT {

    private boolean IF_CHROME_BROWSER_USED = true;

@Test
public void goToAmazon(){

    if (IF_CHROME_BROWSER_USED) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pfokin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.co.uk/");

}


}
