import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Browser {
    private static final Logger logger = LogManager.getLogger(Browser.class);
    public WebDriver driver;

    @Test
    public void setupDriver() {

        WebDriverFactory ch = new WebDriverFactory();
        ch.createNewDriver("Chrome");
        logger.debug("SET ChromeDriver");

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.debug("Test ends");
        }
    }

}

