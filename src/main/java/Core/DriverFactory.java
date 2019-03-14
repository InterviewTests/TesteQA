package Core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static AndroidDriver DRIVER;

    public static AndroidDriver<MobileElement> getDRIVER() {
        return DRIVER;
    }

    public static AndroidDriver createDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "br.com.correios.calculaprecoprazo");
        desiredCapabilities.setCapability("appActivity", "br.com.correios.calculaprecoprazo.activity.SplashScreenActivity");
        desiredCapabilities.setCapability("noReset", true);
        try {
            DRIVER = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        DRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return DRIVER;
    }

}
