package Pages;

import Core.CommonsBasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrigemDestinoCorreioPage extends CommonsBasePage {

    public void getCEPEstadoOrigem(String cepEstadoOrigem) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori"), cepEstadoOrigem);
    }

    public void getCEPEstadoOrigemInvalido(String cepEstadoOrigemInvalido) {
        waitConditionElement(By.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori"),10);
        writefield(By.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori"), cepEstadoOrigemInvalido);
    }

    public void btnProximoPasso() {
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/button_prox"));
    }

    public void getPaisDestinatario(String PaisDestinatario) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/edPais"), PaisDestinatario);
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_pais"));
        clickElement(By.xpath("//android.widget.TextView[contains(@text,'PORTUGAL')]"));

    }

    public void getCidadeDestinatario(String CidadeDestinatario) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/edMuni"), CidadeDestinatario);
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_muni"));
        clickElement(By.xpath("//android.widget.TextView[contains(@text,'LISBOA')]"));
    }

    public String getMensagemCEP() {
        return getTextField(By.xpath("//android.widget.Toast[contains(@text,'CEP não encontrado.')]"));
    }

    public void getEstadoOrigem(String CidadeOrigem) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/edEstado"), CidadeOrigem);
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_estado"));
        waitConditionElement(By.xpath("//android.widget.TextView[contains(@text,'São Paulo')]"),10);
        clickElement(By.xpath("//android.widget.TextView[contains(@text,'São Paulo')]"));

    }

    public void getCidadeOrigem(String EstadoOrigem) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/edMuni"), EstadoOrigem);
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_muni"));
        waitConditionElement(By.xpath("//android.widget.TextView[contains(@text,'São Carlos')]"),10);
        clickElement(By.xpath("//android.widget.TextView[contains(@text,'São Carlos')]"));
    }

    public void getPaisDestinatarioInvalido(String PaisDestinatarioInvalido) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/edPais"), PaisDestinatarioInvalido);
        clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_pais"));
    }

    public void popupVazioSelectPaisDestinatario() {
        boolean textVazio = existsElementText(" ");
        Assert.assertEquals("XXXXX", textVazio);
    }

    public void writePaisInvalido(String PaisDestinatarioInvalido) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/edPais"), PaisDestinatarioInvalido);
    }

    public void writeCidadeDestinatarioInvalido(String CidadeDestinatarioInvalido) {
        writefield(By.id("br.com.correios.calculaprecoprazo:id/edMuni"), CidadeDestinatarioInvalido);
    }


    public String mensagemDadosDestinatarioInvalido() {
        return getTextField(By.xpath("//android.widget.Toast[contains(@text,'É necessário escolher um país e uma cidade.')]"));
    }
}