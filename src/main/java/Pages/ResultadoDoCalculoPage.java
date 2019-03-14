package Pages;

import Core.CommonsBasePage;
import org.openqa.selenium.By;

public class ResultadoDoCalculoPage {
    private static CommonsBasePage Commons = new CommonsBasePage();

    public static void clickSalveCalculo() {
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/action_salvar"));

    }

    public static void clickOkCalculo() {
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/bt_ok"));
    }

    public static String getMensagemCalculoSalvo() {
       return Commons.getTextField(By.id("//android.widget.Toast[contains(@text,'Cálculo salvo com sucesso.')]"));
    }

    public static void cleanCalculo() {
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/action_delete"));
    }

    public static void getNomeCalculo(String nomeCalculo) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/ed_nome_calculo"), nomeCalculo);
    }
}
