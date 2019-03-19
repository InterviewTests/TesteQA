package stepsDefinition;

import Pages.DadosDoObjetoPage;
import Pages.MenuCalculoInternacionalPage;
import Pages.OrigemDestinoCorreioPage;
import Pages.ResultadoDoCalculoPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;


public class CorreioCalculoInternacionalStep {
    private OrigemDestinoCorreioPage origemDestinoCorreioPage = new OrigemDestinoCorreioPage();
    private MenuCalculoInternacionalPage menuCalculoInternacionalPage = new MenuCalculoInternacionalPage();
    private DadosDoObjetoPage dadosDoObjetoPage = new DadosDoObjetoPage();
    private ResultadoDoCalculoPage resultadoDoCalculoPage = new ResultadoDoCalculoPage();

    @Dado("^que estou realizando o calculo de Preco e Prazo internacional$")
    public void que_estou_realizando_o_calculo_de_Preco_e_Prazo_internacional() {
        menuCalculoInternacionalPage.menuCalculoInternational();

    }

    @Dado("^que informo CEP Remente valido$")
    public void que_informo_CEP_Remente_valido() {
        origemDestinoCorreioPage.getCEPEstadoOrigem("04350000");
        origemDestinoCorreioPage.btnProximoPasso();

    }

    @Dado("^que informo CEP Remente invalido$")
    public void que_informo_CEP_Remente_invalido()  {
        origemDestinoCorreioPage.getCEPEstadoOrigemInvalido("00000000");
        resultadoDoCalculoPage.esperar(5);
        origemDestinoCorreioPage.btnProximoPasso();

    }


    @Dado("^que informo um Pais Destinatario valido$")
    public void que_informo_um_Pais_Destinatario_valido() {
        origemDestinoCorreioPage.getPaisDestinatario("PORTUGAL");
    }

    @Dado("^que informo uma cidade de destino valida$")
    public void que_informo_uma_cidade_de_destino_valida() {
        resultadoDoCalculoPage.esperar(10);
        origemDestinoCorreioPage.getCidadeDestinatario("LISBOA");
        origemDestinoCorreioPage.btnProximoPasso();

    }

    @Dado("^que informo um Peso valido$")
    public void que_informo_um_Peso_valido() {
        resultadoDoCalculoPage.esperar(5);
        dadosDoObjetoPage.getPeso("5");
        dadosDoObjetoPage.btnCalcular();
    }

    @Entao("^o calculo deve ser salvo com sucesso$")
    public void o_calculo_deve_ser_salvo_com_sucesso() {
        resultadoDoCalculoPage.esperar(5);
        resultadoDoCalculoPage.clickSalveCalculo();
        resultadoDoCalculoPage.esperar(20);
        resultadoDoCalculoPage.getNomeCalculo("CALCULO AUTOMACAO");
        resultadoDoCalculoPage.clickOkCalculo();
//        Assert.assertEquals("Cálculo salvo com sucesso.", ResultadoDoCalculoPage.getMensagemCalculoSalvo());
    }

    @Entao("^o sistema deve apresentar mensagem de erro$")
    public void o_sistema_deve_apresentar_mensagem_de_erro() {
        Assert.assertEquals("CEP não encontrado.", origemDestinoCorreioPage.getMensagemCEP());

    }

    @Dado("^que informo o dado do Objeto Nao Documento$")
    public void que_informo_o_dado_do_Objeto_Nao_Documento()  {
        dadosDoObjetoPage.esperar(10);
        dadosDoObjetoPage.getTipoDocumentoObjeto();

    }

    @Dado("^que o tipo envelope$")
    public void que_o_tipo_envelope() {
        dadosDoObjetoPage.getTipoEnveloper();
    }

    @Entao("^o sistema deve validar a falta do Peso$")
    public void o_sistema_deve_validar_a_falta_do_Peso()  {
        dadosDoObjetoPage.btnCalcular();
        resultadoDoCalculoPage.esperar(100);
        Assert.assertEquals("Valor do peso inválido", dadosDoObjetoPage.mensagemPesoInvalido());
    }

    @Dado("^que informo um Estado Origem valido$")
    public void que_informo_um_Estado_Origem_valido() {
        origemDestinoCorreioPage.getEstadoOrigem("Sao Paulo");

    }

    @Dado("^que informo um Cidade Origem valido$")
    public void que_informo_um_Cidade_Origem_valido() {
        origemDestinoCorreioPage.getCidadeOrigem("Sao Carlos");
        origemDestinoCorreioPage.btnProximoPasso();
    }

    @Dado("^que estou validando o calculo de Preco e Prazo internacional$")
    public void que_estou_validando_o_calculo_de_Preco_e_Prazo_internacional() {
        menuCalculoInternacionalPage.menuCalculoInternational();
    }

    @Dado("^que informo um Pais Destinatario invalido$")
    public void que_informo_um_Pais_Destinatario_invalido() throws Throwable {
        origemDestinoCorreioPage.getPaisDestinatarioInvalido("XXXXXX");
    }

    @Entao("^o sistema deve realizar a verificacao e apresentar mensagem de erro$")
    public void o_sistema_deve_realizar_a_verificacao_e_apresentar_mensagem_de_erro() {
        origemDestinoCorreioPage.popupVazioSelectPaisDestinatario();
    }

    @Dado("^que informo Dado de Destinatario invalido$")
    public void que_informo_Dado_de_Destinatario_invalido() {
        origemDestinoCorreioPage.writePaisInvalido("YYYYYYY");
        origemDestinoCorreioPage.writeCidadeDestinatarioInvalido("ZZZZZZ");
        origemDestinoCorreioPage.btnProximoPasso();
    }

    @Entao("^o sistema deve realizar a verificacao e apresentar mensagem de erro informando sobre os dados invalidos$")
    public void o_sistema_deve_realizar_a_verificacao_e_apresentar_mensagem_de_erro_informando_sobre_os_dados_invalidos() {
        Assert.assertEquals("É necessário escolher um país e uma cidade.", origemDestinoCorreioPage.mensagemDadosDestinatarioInvalido());
    }
}

