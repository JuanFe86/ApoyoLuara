package task;

import models.DataInjection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import ui.FormularioCrearPersona;

import static ui.FormularioCrearPersona.*;

public class RegistroUsuarios implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataInjection.getDocumento()).into(TXT_DOCUMENTO),
                JavaScriptClick.on(BTN_ELEGIR_DOCUMENTO),
                JavaScriptClick.on(BTN_TIPO_DOCUMENTO),
                Enter.theValue(dataInjection.getPrimer_nombre()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(dataInjection.getSegundo_nombre()).into(TXT_SEGUNDO_NOMBRE),
                Enter.theValue(dataInjection.getPrimer_apellido()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(dataInjection.getSegundo_apellido()).into(TXT_SEGUNDO_APELLIDO),
                JavaScriptClick.on(BTN_CALENDARIO),
                JavaScriptClick.on(BTN_AÑO_CALENDARIO),
                JavaScriptClick.on(BTN_AÑO_CALENDARIO),
                JavaScriptClick.on(BTN_AÑO_CALENDARIO1),
                JavaScriptClick.on(BTN_MES_CALENDARIO),
                JavaScriptClick.on(BTN_DIA_CALENDARIO)






        );

    }

    public static RegistroUsuarios enText() {
        return Tasks.instrumented(RegistroUsuarios.class);
    }
}
