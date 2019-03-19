package Pages;

import Core.CommonsBasePage;
import org.openqa.selenium.By;

public class DadosDoObjetoPage extends CommonsBasePage {

    public void getTipoDocumentoObjeto() {
        waitConditionElement(By.xpath("//android.widget.RadioButton[contains(@text,'Não documento')]"),10);
        clickElement(By.xpath("//android.widget.RadioButton[contains(@text,'Não documento')]"));
    }

    public void getTipoEnveloper() {
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/rbEnvelope"));
    }

    public void getPeso(String Peso) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/txt_peso"), Peso);
    }

    public void btnCalcular() {
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/button_calc"));
    }

    public String mensagemPesoInvalido() {
        return getTextField(By.xpath("//android.widget.Toast[contains(@text,'Valor do peso inválido')]"));
    }
}