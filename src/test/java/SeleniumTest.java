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

    /**
     * This test should pass
     */
    public void testCorrectUserPage()
    {
        start();
        assertEquals("kenstill46", webDriver.findElement(By.xpath("//span[@itemprop='additionalName']")).getText());
    }

    /**
     * This test should fail
     */
    public void testNumberOfRepos()
    {
        start();
        //This test will actually pass if the correct number of repos is givem
        assertEquals("5", webDriver.findElement(By.xpath("//a[@href='/kenstill46?tab=repositories']//span")).getText());
    }
}