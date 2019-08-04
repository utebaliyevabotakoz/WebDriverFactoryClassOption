import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Browser {
    private static final Logger logger = LogManager.getLogger(Browser.class);
    public WebDriver driver;

    @Test
    public void setupChrome() {
        WebDriverFactory ch = new WebDriverFactory();
        ch.createNewDriver("Chrome");
        logger.info("SET ChromeDriver");
    }

    @Test
    public void setupEdge() {
        WebDriverFactory ch = new WebDriverFactory();
        ch.createNewDriver("edge");
        logger.info("SET EdgeDriver");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.info("Test ends");
        }
    }
}

