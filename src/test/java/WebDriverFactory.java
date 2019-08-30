import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverFactory {
    private static final Logger logger = LogManager.getLogger(Browser.class);
    WebDriver driver;

    public WebDriver createNewDriver(String name) {
        try {
            if (name.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                logger.info("ChromeDriver installed");
//                driver.get("https://www.google.com/");
//                logger.info("OPEN https://www.google.com/");
            }
            if (name.equalsIgnoreCase("ie")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                logger.info("InternetExplorerDriver installed");
//                driver.get("https://www.microsoft.com");
//                logger.info("OPEN https://www.microsoft.com");
            }
            if (name.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                logger.info("firefoxdriver installed");
//                driver.get("https://www.mozilla.org/");
//                logger.info("OPEN https://www.mozilla.org/");
            }
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        return driver;
    }

    public WebDriver createNewDriver(String name, ChromeOptions options) {
//        ChromeOptions options = new ChromeOptions();

        try {
            if (name.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
                logger.info("ChromeDriver and options installed ");

            }
            if (name.equalsIgnoreCase("ie")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.IE );
                logger.info("InternetExplorerDriver and options installed");

            }
            if (name.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
                logger.info("firefoxdriver and options installed");
            }
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        return driver;

    }
}
