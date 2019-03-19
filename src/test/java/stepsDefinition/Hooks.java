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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Hooks extends DriverFactory {

    @Before
    public void inicializaAppium() {
        DriverFactory.createDriver();
    }

    @After(order = 0)
    public void turnOffDriver() {
        getDRIVER().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDRIVER().resetApp();
        getDRIVER().quit();
    }

    @After(order = 1)
    public void TakeScreenShot(Scenario scenario) {
        getDRIVER().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        Calendar date = Calendar.getInstance();
        try {
            File imagem = ((TakesScreenshot) getDRIVER()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshots/" + scenario.getName() + " " +formatDate.format(date.getTime()) +  ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}