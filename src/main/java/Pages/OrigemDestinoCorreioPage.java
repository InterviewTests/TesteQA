package Pages;

import Core.CommonsBasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrigemDestinoCorreioPage {

    private static CommonsBasePage Commons = new CommonsBasePage();

    public static void getCEPEstadoOrigem(String cepEstadoOrigem) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori"), cepEstadoOrigem);
    }

    public static void getCEPEstadoOrigemInvalido(String cepEstadoOrigemInvalido) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori"), cepEstadoOrigemInvalido);
    }

    public static void btnProximoPasso() {
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/button_prox"));
    }

    public static void getPaisDestinatario(String PaisDestinatario) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/edPais"), PaisDestinatario);
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_pais"));
        Commons.clickElement(By.xpath("//android.widget.TextView[contains(@text,'PORTUGAL')]"));

    }

    public static void getCidadeDestinatario(String CidadeDestinatario) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/edMuni"), CidadeDestinatario);
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_muni"));
        Commons.clickElement(By.xpath("//android.widget.TextView[contains(@text,'LISBOA')]"));
    }

    public static String getMensagemCEP() {
        return Commons.getTextField(By.xpath("//android.widget.Toast[contains(@text,'CEP não encontrado.')]"));
    }

    public static void getEstadoOrigem(String CidadeOrigem) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/edEstado"), CidadeOrigem);
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_estado"));
        Commons.clickElement(By.xpath("//android.widget.TextView[contains(@text,'São Paulo')]"));

    }

    public static void getCidadeOrigem(String EstadoOrigem) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/edMuni"), EstadoOrigem);
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_muni"));
        Commons.clickElement(By.xpath("//android.widget.TextView[contains(@text,'São Carlos')]"));
    }

    public static void getPaisDestinatarioInvalido(String PaisDestinatarioInvalido) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/edPais"), PaisDestinatarioInvalido);
        Commons.clickElement(By.id("br.com.correios.calculaprecoprazo:id/btn_busca_pais"));
    }

    public static void popupVazioSelectPaisDestinatario() {
        boolean textVazio = Commons.existsElementText(" ");
        Assert.assertEquals("XXXXX", textVazio);
    }

    public static void writePaisInvalido(String PaisDestinatarioInvalido) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/edPais"), PaisDestinatarioInvalido);
    }

    public static void writeCidadeDestinatarioInvalido(String CidadeDestinatarioInvalido) {
        Commons.writefield(By.id("br.com.correios.calculaprecoprazo:id/edMuni"), CidadeDestinatarioInvalido);
    }


     public static String mensagemDadosDestinatarioInvalido() {
        return Commons.getTextField(By.xpath("//android.widget.Toast[contains(@text,'É necessário escolher um país e uma cidade.')]"));
    }
}