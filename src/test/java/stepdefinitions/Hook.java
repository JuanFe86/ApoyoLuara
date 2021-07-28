package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import interactions.OpenTheBrowser;
import models.DatosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.IniciarSesion;
import utils.Constantes;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("tester").can(BrowseTheWeb.with(driver));

    }


    @Dado("^que Juan se encuentra en la pagina web$")
    public void queJuanSeEncuentraEnLaPaginaWeb() {

        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(Constantes.URL));

    }

    @Cuando("^el se loguea en la pagina web$")
    public void elSeLogueaEnLaPaginaWeb(List<DatosLogin> datosLogin) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enTest(datosLogin.get(0)));


    }
}
