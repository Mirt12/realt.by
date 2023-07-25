import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverSingleton {
    private static WebDriver driver;

    public DriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
