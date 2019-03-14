package Pages;

import Core.CommonsBasePage;
import org.openqa.selenium.By;

public class MenuCalculoInternacionalPage {

    private static CommonsBasePage Commons = new CommonsBasePage();

    public void menuCalculoInternational() {
        menuUP();
        Commons.clickForText(By.id("br.com.correios.calculaprecoprazo:id/textview_texto"), "Cálculo Internacional");
        menuUP();
        Commons.clickForText(By.id("br.com.correios.calculaprecoprazo:id/textview_texto"), "Cálculo Internacional");
    }

    public void menuUP() {
        Commons.clickElement(By.id("android:id/up"));
    }

}