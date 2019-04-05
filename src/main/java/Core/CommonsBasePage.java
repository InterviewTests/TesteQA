package Core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static Core.DriverFactory.getDRIVER;

public class CommonsBasePage {

    public void writefield(By by, String text) {
        getDRIVER().findElement(by).sendKeys(text);
    }

    public String getTextField(By by) {
        return getDRIVER().findElement(by).getText().trim();
    }

    public static void clickElement(By by) {
        getDRIVER().findElement(by).click();
    }

    public void clickMenuByText(String text) {
        try {
            clickElement(By.id("android:id/up"));
            waitConditionElement(By.id("br.com.correios.calculaprecoprazo:id/textview_texto"), 10);
            for (MobileElement botaomenu : getDRIVER().findElements(By.id("br.com.correios.calculaprecoprazo:id/textview_texto"))) {
                if (text.equals(botaomenu.getText().trim())) {
                    botaomenu.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public boolean existsElementText(String texto) {
        List<MobileElement> elementos = getDRIVER().findElements(By.xpath("//*[@text='" + texto + "']"));
        return elementos.size() > 0;
    }

    public void waitConditionElement(By by, int Time) {
        WebDriverWait wait = new WebDriverWait(getDRIVER(), Time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void esperar(long tempo) {
        getDRIVER().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);

    }

}
