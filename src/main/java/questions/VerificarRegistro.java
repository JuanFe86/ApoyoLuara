package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.FormularioCrearPersona;

public class VerificarRegistro implements Question {

   private String registro_exitoso;

    public VerificarRegistro(String registro_exitoso) {
        this.registro_exitoso = registro_exitoso;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FormularioCrearPersona.LBL_MENSAJE).viewedBy(actor).asString();
    }

    public static VerificarRegistro aRegistro(String registro_exitoso){
        return new VerificarRegistro(registro_exitoso);
    }
}
