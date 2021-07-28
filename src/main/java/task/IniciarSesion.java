package task;

import models.DatosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import ui.PaginaLogin;

import static ui.PaginaLogin.*;

public class IniciarSesion implements Task {

    private String usuario;
    private String contraseña;

    public IniciarSesion(DatosLogin datosLogin) {

        this.usuario = datosLogin.getUsuario();
        this.contraseña = datosLogin.getContraseña();

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(contraseña).into(TXT_CONTRASEÑA),
                JavaScriptClick.on(BTN_INGRESAR));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static IniciarSesion enTest(DatosLogin datosLogin) {
        return Tasks.instrumented(IniciarSesion.class, datosLogin);
    }
}
