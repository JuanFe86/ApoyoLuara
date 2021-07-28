package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import ui.PaginaInicioUsario;

import static ui.PaginaInicioUsario.BTN_PERSONAS;
import static ui.PaginaInicioUsario.BTN_PERSONAS1;

public class IngresoCrearPersona implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                JavaScriptClick.on(BTN_PERSONAS),
                JavaScriptClick.on(BTN_PERSONAS1)
        );

    }

    public static IngresoCrearPersona irPersona(){
        return Tasks.instrumented(IngresoCrearPersona.class);
    }
}
