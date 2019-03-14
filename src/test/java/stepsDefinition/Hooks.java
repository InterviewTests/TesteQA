package stepsDefinition;

import Core.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void inicializaAppium() {
        DriverFactory.createDriver();
    }

    @After(order = 0)
    public void turnOffDriver() {
        DriverFactory.getDRIVER().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverFactory.getDRIVER().quit();
    }

    @After(order = 1)
    public void gerarScreenShot(Scenario scenario) {
        try {
            File imagem = ((TakesScreenshot) DriverFactory.getDRIVER()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshots/" + scenario.getId() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}