package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import interactions.IngresoCrearPersona;
import task.RegistroUsuarios;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static stepdefinitions.Hook.*;


public class RegistroCpStepDefinition {

    @Cuando("^el ingreso todos los datos$")
    public void elIngresoTodosLosDatos() {

        theActorInTheSpotlight().attemptsTo(IngresoCrearPersona.irPersona());
        theActorInTheSpotlight().attemptsTo(RegistroUsuarios.enText());
    }


    @Entonces("^el puede ver que el registro fue creado$")
    public void elPuedeVerQueElRegistroFueCreado() {


    }
}
