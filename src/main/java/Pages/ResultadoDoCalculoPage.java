package Pages;

import Core.CommonsBasePage;
import org.openqa.selenium.By;

public class ResultadoDoCalculoPage extends CommonsBasePage {

    public void clickSalveCalculo() {
        waitConditionElement(By.id("br.com.correios.calculaprecoprazo:id/action_salvar"),10);
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/action_salvar"));

    }

    public static void clickOkCalculo() {
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/bt_ok"));
    }

    public void getNomeCalculo(String nomeCalculo) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/ed_nome_calculo"), nomeCalculo);
    }
}
