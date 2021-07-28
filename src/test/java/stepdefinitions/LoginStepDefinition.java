package stepdefinitions;

import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.VerificarLogin;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {



    @Entonces("^el puede ver el mensaje (.*)$")
    public void elPuedeVerElMensajeHolaLAURARAMIREZ(String resultado) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarLogin.aPagina(resultado), Matchers.equalTo(resultado)));
    }
}
