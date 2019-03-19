package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "features"
        , glue =
        "stepsDefinition"

        , tags =
        //"@CalculoInternacionalValidaDadosDestinoInvalido"
        //"@CalculoInternacionalValidaDadosDestinoInvalido"
        //"@CalculoInternacionalValidaPaisInvalido"
            "@CalculoInternacional"
      // "@CalculoInternacionalValidoCEP"
        //"@CalculoInternacionalValidoCidadeEstado"
        //"@CalculoInternacionalCEPInvalido"
       // "@CalculoInternacionalDadosObjeto"
        // "@CalculoInternacionalValidaPeso"


        , plugin = {
        "pretty",
        "junit:target/cucumber.xml"
}


)

public class TestRunner {

}
