package Core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static Core.DriverFactory.getDRIVER;

public class CommonsBasePage {

    public void writefield(By by, String text) {
        getDRIVER().findElement(by).sendKeys(text);
    }

    public String getTextField(By by) {
        return getDRIVER().findElement(by).getText();
    }

    public void clickElement(By by) {
        getDRIVER().findElement(by).click();
    }

    public void clickForText(By by, String text) {
        List<MobileElement> btnsMenu = getDRIVER().findElements(by);
        for (MobileElement botaomenu : btnsMenu) {
            if (text.equals(botaomenu.getText().trim())) {
                botaomenu.click();
                break;
            }

        }
    }

    public boolean existsElementText(String texto) {
        List<MobileElement> elementos = getDRIVER().findElements(By.xpath("//*[@text='" + texto + "']"));
        return elementos.size() > 0;
    }


    public static void esperar(long tempo) {
        getDRIVER().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);

    }

}
