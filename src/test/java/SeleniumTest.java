import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

public class SeleniumTest {

    @Test
    public void openPage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://example.com");

        assert driver.getTitle().contains("Example");

        driver.quit();
    }
}
