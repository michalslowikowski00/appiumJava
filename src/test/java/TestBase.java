import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    AppiumDriver driver;
    CalculatorPage calculatorPage;

    @Before
    public void setup() throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_2_70");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");

        driver = new AndroidDriver(url, capabilities);
        calculatorPage = new CalculatorPage(driver);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
