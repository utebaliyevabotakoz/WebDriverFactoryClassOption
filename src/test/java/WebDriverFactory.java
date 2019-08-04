import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
    private static final Logger logger = LogManager.getLogger(Browser.class);

    public void createNewDriver(String name) {
        WebDriver driver;

        if (name.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            logger.debug("ChromeDriver installed");

            driver.get("https://otus.ru/");
            logger.debug("OPEN https://otus.ru/");
        }

        if (name.equals("edge")) {
//        EdgeDriverManager.getInstance().setup();
            System.setProperty("webdriver.edge.driver", "C:\\Users\\botik\\Documents\\Otus\\Lesson5\\lesson5\\src\\test\\resources\\MicrosoftWebDriver.exe"); //put actual location
            driver = new EdgeDriver();
            logger.debug("EdgeDriver installed");
            driver.get("https://otus.ru/");
            logger.debug("OPEN https://otus.ru/");
        }

    }
}
