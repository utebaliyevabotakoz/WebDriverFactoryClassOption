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

        if (name.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            logger.info("ChromeDriver installed");

            driver.get("https://otus.ru/");
            logger.info("OPEN https://otus.ru/");
        }

        if (name.equalsIgnoreCase("edge")) {
//        EdgeDriverManager.getInstance().setup();
            System.setProperty("webdriver.edge.driver", "C:\\Users\\botik\\Documents\\Otus\\Lesson5\\lesson5\\src\\test\\resources\\MicrosoftWebDriver.exe"); //put actual location
            driver = new EdgeDriver();
            logger.info("EdgeDriver installed");
            driver.get("https://otus.ru/");
            logger.info("OPEN https://otus.ru/");
        }
    }
}
