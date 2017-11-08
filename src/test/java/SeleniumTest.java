import junit.framework.TestCase;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest extends TestCase
{

    private WebDriver webDriver;

    @Before
    public void start()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kenst\\Desktop\\Selenium\\chromedriver.exe");

        webDriver = new ChromeDriver();

        webDriver.get("https://github.com/kenstill46");
    }

    public void testWebsiteReached()
    {
        start();
        assertEquals("kenstill46", webDriver.findElement(By.xpath("//span[@itemprop='additionalName']")).getText());
    }
}