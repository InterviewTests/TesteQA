package Pages;

import Core.CommonsBasePage;
import org.openqa.selenium.By;

public class DadosDoObjetoPage {

    private static CommonsBasePage Commons = new CommonsBasePage();


    public static void getTipoDocumentoObjeto() {
        Commons.clickElement(By.xpath("//android.widget.RadioButton[contains(@text,'Não documento')]"));
    }

    public static void getTipoEnveloper() {
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/rbEnvelope"));
    }

    public static void getPeso(String Peso) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/txt_peso"), Peso);
    }

    public static void btnCalcular() {
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/button_calc"));
    }

    public static String mensagemPesoInvalido() {
        return Commons.getTextField(By.xpath("//android.widget.Toast[contains(@text,'Valor do peso inválido')]"));
    }
}