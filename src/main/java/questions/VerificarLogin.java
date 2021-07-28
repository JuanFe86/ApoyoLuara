package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.PaginaInicioUsario;

public class VerificarLogin implements Question {

    private String resultado;

    public VerificarLogin(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaInicioUsario.LBL_MENSAJE).viewedBy(actor).asString();
    }

    public static VerificarLogin aPagina(String resultado){
        return new VerificarLogin(resultado);
    }

}
