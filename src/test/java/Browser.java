import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static final Logger logger = LogManager.getLogger(Browser.class);
    public WebDriver driver1;

    @Test
    public void setupChrome() {
        WebDriverFactory ch = new WebDriverFactory();
        driver1 =   ch.createNewDriver("chrome");
        logger.info("SET ChromeDriver");
    }

    @Test
    public void setupEdge() {
        WebDriverFactory ch = new WebDriverFactory();
        driver1=  ch.createNewDriver("edge");
        logger.info("SET EdgeDriver");
    }

    @After
    public void tearDown() {
        if (driver1 != null) {
            driver1.quit();
            logger.info("Test ends");
        }
    }
}

